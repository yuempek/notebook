Bu dönüşümde, signed power (işaret koruyan üs) fonksiyonu cebirsel olarak yeniden düzenlenerek mutlak değer ve işaret fonksiyonu kullanımı ortadan kaldırılır. 
Mutlak değer ve işaret fonksiyonu tanımları yerine yazılıp üs kuralları uygulandığında ifade $x(x^2)^p$ biçimine indirgenir. Burada $p=(n-1)/2$ olarak tanımlanır. 
Böylece signed power fonksiyonu, yalnızca çarpma ve üs alma işlemleriyle ifade edilebilir.

$$
spow(x) = |x|^n \cdot sign(x)
$$

$$
sign(x) = \frac{x}{|x|}
$$

$$
spow(x) = \frac{|x|^n}{|x|}\cdot x
$$

$$
|x| = (x^2)^{\frac{1}{2}}
$$

$$
spow(x) = \frac{(x^2)^{\frac{n}{2}}}{(x^2)^{\frac{1}{2}}}\cdot x
$$

$$
spow(x) = (x^2)^{\frac{n-1}{2}}\cdot x
$$

$$
p = \frac{n-1}{2}
$$

p değeri bir reel değer olarak alındığında:

$$
\boxed{spow(x) = x\cdot(x\cdot x)^p}
$$


