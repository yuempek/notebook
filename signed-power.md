Bu dönüşümde, signed power (işaret koruyan üs) fonksiyonu cebirsel olarak yeniden düzenlenerek mutlak değer ve işaret fonksiyonu kullanımı ortadan kaldırılır. 
Mutlak değer ve işaret fonksiyonu tanımları yerine yazılıp üs kuralları uygulandığında ifade $x(x^2)^p$ biçimine indirgenir. Burada $p=(n-1)/2$ olarak tanımlanır. 
Böylece signed power fonksiyonu, yalnızca çarpma ve üs alma işlemleriyle ifade edilebilir.

$$
\operatorname{spow}(x) = |x|^n \cdot \operatorname{sign}(x) \\[10pt]

\operatorname{sign}(x) = \frac{x}{|x|} \\[10pt]

\operatorname{spow}(x) = \frac{|x|^n}{|x|}\cdot x \\[10pt]

|x| = (x^2)^{\frac{1}{2}} \\[10pt]

\operatorname{spow}(x) = \frac{(x^2)^{\frac{n}{2}}}{(x^2)^{\frac{1}{2}}}\cdot x \\[10pt]

\operatorname{spow}(x) = (x^2)^{\frac{n-1}{2}}\cdot x \\[10pt]

p = \frac{n-1}{2}
$$

p değeri bir reel değer olarak alındığında:

$$
\boxed{\operatorname{spow}(x) = x\cdot(x\cdot x)^p}
$$


