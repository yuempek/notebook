# Portable QEMU on Windows

 ## 1\. Download QEMU Setup

 Download the latest 64-bit Windows build:

 https://qemu.weilnetz.de/w64/

 Extract ****sutup.exe file to a folder with an archive software, for example:

```
C:\Portables\QEMU
```

 Add this folder to your `PATH`.

 Verify:

```cmd
qemu-system-x86_64 --version
qemu-img --version
```

 ## 2\. Create a VM

```cmd
mkdir C:\VM\test
cd C:\VM\test
```

 Create a 10 GB disk:

```cmd
qemu-img create -f qcow2 disk10G.qcow2 10G
```

 Put your ISO in the VM folder, for example:

```cmd
C:\VM\test\ABClinux.iso
```

 ## 3\. Install the OS with NAT Network

```cmd
qemu-system-x86_64.exe ^
  -m 2G ^
  -drive file=disk10G.qcow2,format=qcow2 ^
  -cdrom ABClinux.iso ^
  -netdev user,id=net0 ^
  -device virtio-net-pci,netdev=net0 ^
  -boot d
```

 ## 4\. Start the VM with NAT Network

 After installation, start the VM without the ISO:

```cmd
qemu-system-x86_64.exe ^
  -m 2G ^
  -drive file=disk10G.qcow2,format=qcow2 ^
  -netdev user,id=net0 ^
  -device virtio-net-pci,netdev=net0
```

 ## Portable Layout

```cmd
C\
├── Portables\
    └── QEMU\
└── VM\
    └── test\
        ├── disk10G.qcow2
        └── ABClinux.iso
```

 Copy the entire `Portable-QEMU` folder to another Windows PC to use the VM.
