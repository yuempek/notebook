# Tiny Core Linux - QEMU Frugal Kurulum

 ## 1\. Diski hazırla

```
sudo fdisk /dev/sda
```

 `fdisk` içinde:

```
o
n
p
1
Enter
Enter
a
1
w
```

```
sudo mkfs.ext4 /dev/sda1
sudo mkdir -p /mnt/tinycore
sudo mount /dev/sda1 /mnt/tinycore
```

 ## 3\. Tiny Core'u kopyala

```
sudo cp -av /mnt/sr0/boot /mnt/tinycore/
sudo mkdir -p /mnt/tinycore/tce
sudo mkdir -p /mnt/tinycore/home/tc
sudo mkdir -p /mnt/tinycore/opt
```

 ## 4\. Gerekli TCE paketlerini yükle

```
tce-load -wi liblvm2
tce-load -wi grub2-multi
tce-load -wi openssh
```

 ## 5\. GRUB kur

```
sudo grub-install \
  --target=i386-pc \
  --boot-directory=/mnt/tinycore/boot \
  /dev/sda
```

```
sudo mkdir -p /mnt/tinycore/boot/grub

sudo tee /mnt/tinycore/boot/grub/grub.cfg > /dev/null <<'EOF'
set timeout=3
set default=0

menuentry "Tiny Core Linux" {
    linux /boot/vmlinuz loglevel=3 tce=sda1/tce home=sda1/home/tc opt=sda1/opt
    initrd /boot/corepure64.gz
}
EOF
```

 ## 6\. SSH'ı açılışta başlat

 SSH extension'ı kurulduktan sonra:

```
vi sshd_config
sudo mkdir -p /mnt/tinycore/etc/init.d
sudo sh -c 'echo "/usr/local/etc/init.d/openssh start" > /mnt/tinycore/etc/init.d/openssh'
sudo chmod +x /mnt/tinycore/etc/init.d/openssh
```

 Tiny Core açıldıktan sonra SSH servisini başlat:

```
sudo /usr/local/etc/init.d/openssh start
```

 IP adresini öğren:

```
ip addr
```

 Başka makineden:

```
ssh tc@IP_ADRESI
```

 ## 7\. Diskten boot et

 QEMU'yu kapatıp ISO olmadan başlat:

```
qemu-system-x86_64 \
  -m 512M \
  -drive file=tinycore.qcow2,format=qcow2
```

sshd ayarlarını yap:

```
sudo cd /usr/local/etc/ssh
sudo cp sshd_config* sshd_config
sudo reboot
```


 Persistence:

```
tce=sda1/tce
home=sda1/home/tc
opt=sda1/opt
```
