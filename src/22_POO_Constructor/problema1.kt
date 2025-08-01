package `22_POO_Constructor`

class producto(val nombre: String, var precio: Double = 0.0, var stock: Int = 0) {
    init{
        if ( precio < 0) precio = 0.0
        if ( stock < 0)stock = 0
    }
    fun mostrarInfo() = println("Nombre: $nombre\nPrecio: $precio\nStock: $stock")
    fun hayStock() = if( stock > 0) "elproducto $nombre esta disponible." else "el producto $nombre no esta disponible."

}
fun main(){
    val producto1 = producto("laptop",1000.0, 5)
    producto1.mostrarInfo()
    println(producto1.hayStock())
    val producto2 = producto("celular",500.0, -2)
    producto2.mostrarInfo()
    println(producto2.hayStock())
}