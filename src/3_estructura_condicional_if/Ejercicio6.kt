package `3_estructura_condicional_if`

fun main(){
    print("ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese segundo valor:")
    val valor2 = readln().toInt()
    if (valor1 > valor2) {
        print("el mayor valor es $valor1")
    }
    else {
        print("el mayor valor es &valor2")
}