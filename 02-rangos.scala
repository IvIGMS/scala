// Rangos. Creamos un rango
var mi_range = 1 to 5
println(mi_range)

// Tipos de rangos
val range1 = 0 to 5 // Rango cerrado.
val range2 = 0 until 5 // Rango semicerrado.
val range3 = 0 until 20 by 4 // Rango con saltos semicerrado
val range4 = 0 to 20 by 4 // Rango con saltos cerrado.

// También podemos crear rangos con letras.
val range5 = 'c' until 'n'
val range6 = 'D' to 'O'

// Podemos acceder a las posiciones de un rango como si fuese un array
mi_range(0)
println(mi_range(4))

// Usamos nuestro rango en un for
for (i <- mi_range){
  println("Hello")
}