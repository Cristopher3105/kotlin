package `26_POO_Metodos_set_y_get`


class Jardin(largo: Double, ancho: Double, tipoZacate: Int) {

    var largo: Double = 1.0
        set(value) {
            field = if (value > 0) value else 1.0
        }
        get() = field

    var ancho: Double = 1.0
        set(value) {
            field = if (value > 0) value else 1.0
        }
        get() = field

    var tipoZacate: Int = 1
        set(value) {
            field = if (value in 1..3) value else 1
        }
        get() = field

    init {
        this.largo = largo
        this.ancho = ancho
        this.tipoZacate = tipoZacate
    }

    val area: Double
        get() = largo * ancho

    private fun costoManoObra(): Double = area * 500

    private fun costoZacate(): Double = area * when (tipoZacate) {
        1 -> 1000.0
        2 -> 1500.0
        3 -> 2000.0
        else -> 1000.0 // No debería ocurrir
    }

    private fun subtotal(): Double = costoManoObra() + costoZacate()

    private fun impuesto(): Double = subtotal() * 0.13

    private fun total(): Double = subtotal() + impuesto()

    private fun nombreZacate(): String = when (tipoZacate) {
        1 -> "CRIOLLO"
        2 -> "AMERICANO"
        3 -> "SINTÉTICO"
        else -> "CRIOLLO"
    }

    fun imprimirDetalle() {
        println("Detalle del Jardín Enzacatado")
        println("Largo: $largo m")
        println("Ancho: $ancho m")
        println("Área total: $area m²")
        println("Tipo de zacate: ${nombreZacate()}")
        println("Costo mano de obra: ₡${costoManoObra()}")
        println("Costo zacate: ₡${costoZacate()}")
        println("Subtotal: ₡${subtotal()}")
        println("Impuesto (13%): ₡${impuesto()}")
        println("Total a pagar: ₡${total()}")
        println("───────────────────────────────")
    }
}
fun seleccionarTipoZacate(): Int {
    println("Seleccione el tipo de zacate:")
    println("1. Criollo (₡1000/m²)")
    println("2. Americano (₡1500/m²)")
    println("3. Sintético (₡2000/m²)")
    print("Ingrese el número correspondiente: ")

    val input = readLine()?.toIntOrNull()
    return if (input in 1..3) input!! else {
        println("⚠️ Opción inválida. Se asignará tipo CRIOLLO por defecto.")
        1
    }
}

fun main() {
    println("Configuración del jardín")
    print("Ingrese el largo del jardín (m): ")
    val largo = readLine()?.toDoubleOrNull() ?: 1.0

    print("Ingrese el ancho del jardín (m): ")
    val ancho = readLine()?.toDoubleOrNull() ?: 1.0

    val tipoZacate = seleccionarTipoZacate()

    val jardin = Jardin(largo, ancho, tipoZacate)
    jardin.imprimirDetalle()
}