// Pattern Matching. Son los switch. No existe el 'break'

var color = "azul"

// Podemos usar el '|' para usar mas casos
// Podemos usar if para evaluar en cada 'case'
// Parece que en los case no podemos usar 'range'
color match {
  case "red" | "rojo" => println("Lo pintamos de color rojo.")
  case "green" | "verde" => println("Lo pintamos de color verde.")
  case color if(color == "blue" || color == "azul") => println("Lo pintamos de color azul.")
  case _ => println("No sabemos que color es ese.") // Esta es la forma de usar el default
}