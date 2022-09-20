// Las colecciones a rasgos generales podemos divirlas en:
// Seq - Set - Map

// List. Conjunto de elementos ordenados del mismo tipo.
var lista1 = List("Carlos","Javier","Alberto","Ivan","Juan","Antonio", "Jose")
var lista2 = List("Ivan", "Frias", 25, true, 164.5)
var lista3 = List[String]("Alberto","Lucas","Jose") // Bloqueamos la lista para que solo se puedan datos de tipo 'String'

// Crear una lista vacia
var lista0 = List()

println(lista1) // Lista de tipo 'string'
println(lista2) // Lista de tipo 'any'

// Acceder a posiciones del array
lista1(2)
lista1(4)

// Podemos recorrer las listas con un 'for'
for (item <- lista1){
  println(item)
}


// Metodos y properties de List
lista1.head
lista1.last
lista1.length
lista1.isEmpty // Nos dice si está o no vacío
lista1.reverse // Nos da la vuelta a la lista

// Rellenar una lista con valores repetidos, en este caso nos va a rellenar con 5 veces el nombre de "Ivan"
var lista4 = List.fill(5)("Ivan")
println(lista4)

// Añadir elementos a la lista
lista1 = lista1:+"Alejandro"