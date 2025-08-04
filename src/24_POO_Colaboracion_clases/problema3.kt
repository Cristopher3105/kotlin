package `24_POO_Colaboracion_clases`

class Motor {
    private var encendido = false

    fun encender() {
        encendido = true
        println("El motor ha sido encendido.")
    }

    fun apagar() {
        encendido = false
        println("El motor ha sido apagado.")
    }

    fun estado(): String {
        return if (encendido) "encendido" else "apagado"
    }

    fun estaEncendido(): Boolean {
        return encendido
    }
}

class Carro(private val motor: Motor) {
    fun conducir() {
        if (motor.estaEncendido()) {
            println("El carro está en movimiento.")
        } else {
            println("No se puede conducir. El motor está apagado.")
        }
    }

    fun estadoGeneral() {
        println("El motor está ${motor.estado()}.")
    }
}

fun main() {
    val motor = Motor()
    val carro = Carro(motor)

    carro.estadoGeneral()
    carro.conducir()

    motor.encender()
    carro.estadoGeneral()
    carro.conducir()

    motor.apagar()
    carro.estadoGeneral()
    carro.conducir()
}