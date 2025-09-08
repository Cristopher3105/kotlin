package `28_POO_num_class`

enum class TipoCarta {
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}
class Carta(val tipo: TipoCarta, val valor: Int){
    fun imprimir(){
        println("carta: $tipo y su valor es $valor")

    }
}
fun main(){
    val carta1 = Carta(TipoCarta.PICA,4)
    carta1.imprimir()
    val carta2 = Carta(TipoCarta.CORAZON,1)
    carta1.imprimir()
}