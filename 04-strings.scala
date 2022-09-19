// Vamos a ver algunas operaciones con los strings
var cadena = "Ivan Frias Gil"
println(cadena.length) // Longitud de la cadena
println(cadena.last) // Ultimo caracter
println(cadena.toUpperCase) // Mayus

// Encadenamos algunas funciones.
cadena.toUpperCase.foreach(println)

// Pasar un string a entero
var number_string = "100"
var number = number_string.toInt
var suma = number + 10

// Interpolación de strings. Podemos usar expresiones dentro de las variables
val nombre = "Ivan"
val edad = 25

println(s"Mi nombre es ${nombre.toUpperCase} y tengo $edad años.")