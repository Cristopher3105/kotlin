package `25_POO_Modificadores_private_y_public`

class CuentaBancaria{
    private var saldo: Int = 1000

    fun depositar (){
        var monto: Int = 0
        print("Cuanto deseea depositar?")
        monto = readln().toInt()
        var validacion: Boolean = montoValido(monto)
        if (validacion == true){
            saldo += monto
        }else{
            print("Error no se puede depositar esa cantidad")
        }
    }

    fun retirar(){
        var monto: Int = 0
        print("Cuanto deseea retirar?")
        monto = readln().toInt()
        var validacion: Boolean = puedeRetirar(monto)
        if (validacion == true){
            saldo -= monto
        }else{
            print("Error no puede retirar esa cantidad")
        }
    }

    fun consultarSaldo(){
        println("Su saldo es de ₡$saldo")
    }

    private fun montoValido(monto: Int): Boolean {
        var validacion: Boolean
        if (monto > 0) {
            validacion = true
        }else{
            validacion = false
        }
        return validacion
    }

    private fun puedeRetirar(monto: Int ): Boolean{
        var validacion: Boolean
        if (monto > 0 && saldo >= monto){
            validacion = true
        }else{
            validacion = false
        }
        return validacion
    }

}
fun main(){
    val cuentabancaria1 = CuentaBancaria()
    var menu: Int = 0
    do {
        println("Digite 1 para depositar")
        println("Digite 2 para retirar")
        println("Digite 3 para consultar saldo")
        println("Digite 4 para salir")
        menu = readln().toInt()
        if(menu == 1){
            cuentabancaria1.depositar()
        }
        if(menu == 2){
            cuentabancaria1.retirar()
        }
        if(menu == 3){
            cuentabancaria1.consultarSaldo()
        }
    }while(menu != 4)

}
