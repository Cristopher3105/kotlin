package `19_Arreglos`

fun main(){
    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elementos por teclado
    for(i in 0..4){
        println("ingrese sueldo")
        sueldos[1] = readln().toInt()
    }
    //impresionde sus elementos
    for(i in 0..4){
        println(sueldos[1])
    }
}