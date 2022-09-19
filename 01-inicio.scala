/*

En scala todo es un objeto.
Lo interesante de scala es la mezcla entre POO y Funcional.
En scala siempre se devuelve un valor.

*/

// Hay una herramienta que se llama scaladoc

/*
* Linea 1
* Linea 2
* Linea 3
*/

// Variables y constantes.

var age = 25 // Variable
val name = "Ivan" // Constante

var altura: Double = 164.5
altura = 175.5

// Declarar variables con un valor por defecto. Solo podemos hacerlo con el var. No tiene sentido hacerlo con una constante. Tenemos que hacer que sean mutables.

var mes: String = _ // Por defecto inicializa en 'null'
var dia: Int = _ // Por defecto inicializa en '0'

// Constantes lazy: son como las de swift. No ocupan memoria hasta que se accede a ellas.
// Solo se pueden crear con 'val'.

lazy val favouriteColor = "Yellow"

// Vemos los if en bloque.
var numero = 30

if (numero == 10) {
    println("El numero es 10")
} else if (numero == 20) {
    println("El numero es 20")
} else {
  println("El numero no es nada.")
}
// Podemos crear un expresion y guardarla en una variable, es parecido al operador ternario.
var resultado = if (numero == 30) "El numero es 30" else "El numero es distinto de 30"
println(resultado)

// BUCLES
// Lo bucles while y do while son exactamente como en java y como en otros lenguajes de programación.
// Vamos a ver el 'for'. Los for usan rangos, que los veremos posteriormente.

// El uno y el 5 se incluyen en el rango
for (i <- 1 to 5){ 
  println(i)
}
// El 5 no se incluye en el rango
for (i <- 1 until 5){
  println(i)
}

// Podemos incluso ponerle expresiones para que solo recorra algunos valores del bucle.
for (i <- 1 to 10 if i%2 == 0){
  println(i)
}