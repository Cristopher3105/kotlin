package `24_POO_Colaboracion_clases`

class Cliente(var nombre: String, var monto: Float){
    fun depositar(monto: Float) {

    }
    fun extraer(monto: Float){
        this.monto -= monto
    }
    fun imprimr(){
        println("$nombre tiene depositado la suma de $monto")
    }

    fun imprimir() {
    }
}
class banco{
    val Cliente1: Cliente = Cliente("juan",0f)
    val Cliente2: Cliente = Cliente("Ana",0f)
    val Cliente3: Cliente = Cliente("Luis",0f)
    fun operar(){
        Cliente1.depositar(100f)
        Cliente2.depositar(150f)
        Cliente3.depositar(200f)
        Cliente3.extraer(150f)

    }
    fun depositosTotales(){
        val total=Cliente1.monto + Cliente2.monto + Cliente3.monto + Cliente3.monto
        println("el total de diero del banco es: $total")
        Cliente1.imprimir()
        Cliente2.imprimir()
        Cliente3.imprimir()
    }
}
fun main(){
    val banco1 = banco()
    banco1.operar()
    banco1.depositosTotales()

}