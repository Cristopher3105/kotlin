package `13_funciones_parametros`

//funcion para verificar si dos clavesson iguales
fun verificarClaves(clave1: String, clave2: String): Boolean {
    return clave1 == clave2
}
//funcion principal
fun main(){
    //pedir al usuario que ingrese la clave dos veces
    println("ingrese su clave")
    val clave1 = readLine() ?:""
    println("ingree su clave nuevamente")
    val clave2 = readLine() ?: ""
    //verificar si las claves coinciden
    if (verificarClaves(clave1, clave2)){
        println("las claves coinciden")

    }else{
        println("las claves no coinciden")
    }
}