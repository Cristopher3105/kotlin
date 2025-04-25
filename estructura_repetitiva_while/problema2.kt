package estructura_repetitiva_while


fun main() {
    print("ingrese el numero de personas")
    val n = readln().toInt()
    var sumaAlturas = 0.0
    var i =0
    while(i<n){
        print("ingrese la altura de la persona ${i+1}(en metros): ")
        val altura = readln().toInt()
        sumaAlturas += i++

    }

val alturaPromedio = sumaAlturas / n
    print("la altura promedio es: $alturaPromedio metros")
}
