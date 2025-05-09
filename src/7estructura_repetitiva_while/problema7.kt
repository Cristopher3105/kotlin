package estructura_repetitiva_while

fun main() {
    var sumaLista1= 0
    var sumaLista2= 0
    print("ingrese los 5 valores de la lista1:\n")
    for(i in 1..5) {
        print("valor ${i}:")
        val valor = readln().toInt()
        sumaLista1 += valor
    }
    print("ingrese los 5 valores dee la Lista 2 :\n")
    for(i in 1..5) {
        print("valor ${i}:")
        val valor = readln().toInt()
        sumaLista2 += valor
    }
    if(sumaLista1 >sumaLista2) {
        print("Lista 1 mayor.")
    }else if (sumaLista2 > sumaLista1) {
        print("Lista 2 mayor.")
    }else{
        print("Listas iguales")
    }


}