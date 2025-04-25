package estructura_repetitiva_while

fun main() {
    print("ingrese el numero de valores")
    val n= readln().toInt()
    var pares=0
    var impares=0
    var i =0
    while (i<n){
        print("ingrese el valor ${i+1}:")
        val valor = readln().toInt()
        if (valor %2 == 0) {
            pares++
        }else{
            impares++
        }
        i++
    }
    print("valores pares: $pares\n")
    print("valores impares : $impares")


}