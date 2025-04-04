package estructura_condicional_como_expresion

fun main() {

    print("digite su edad:")
    val edad: Int = readln().toInt()
    if (edad <= 13) {
        print("eres un niño")

    }else{
        if(edad >=13)
            print("eres un adolecente")
    }
    if (edad >=18) {
        print("eres adulto")
    }else {
        if (edad >= 17)
            print("eres un adolecente")
    }
}
