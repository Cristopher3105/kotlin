package `14_funciones_con_retorno`

fun largo(nombre: String): Int {
    return nombre.length
}
fun main(){
    println("ingrese un nombre")
    val nombre1 = readln() // Jorge
    println("ingrese otro numero")
    val nombre2 = readln() // Luis
    if (largo(nombre1)== largo(nombre2))
        println("los nombre: $nombre1 y $nombre2 tiene la " +"misma cantidad de caracteres")
    else
        if(largo(nombre1)> largo(nombre2))
            println("$nombre1 es mas largo")
    else
        println("$nombre2 es mas largo")

}