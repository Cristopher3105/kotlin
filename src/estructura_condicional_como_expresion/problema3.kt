package estructura_condicional_como_expresion

fun main() {
    print("ingrese un valor del triangulo")
    val lado1 = readln().toInt()
    print("ingrese el segundo lado del triangulo:")
    val lado2 = readln().toInt()
    print("ingrese el tercer lado del triangulo:")
    val lado3 = readln().toInt()
    if(lado1 + lado2 > lado3) {
        if (lado1== lado2 && lado2 == lado3)
            print(" el triangulo es equilatero")
        else if (lado1 == lado2 || lado2 == lado3|| lado1==lado3)
            print("el triangulo es isosceles")
        else
            print("el triangulo es escaleno")
    }
}