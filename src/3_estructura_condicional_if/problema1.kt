package `3_estructura_condicional_if`


fun main(){
    print("digite la primera nota,para calcular el promedio")
    val nota1 = readln().toDouble()
    print("digite la segunda nota")
    val nota2 = readln().toDouble()
    print("digite la tercera nota")
    val nota3 = readln().toDouble()

    val prom= nota1 + nota2 + nota3

    if (prom > 7)
        print("promocionado")

}