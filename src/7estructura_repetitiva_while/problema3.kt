package estructura_repetitiva_while

fun main() {
    print("ingrese el numero de empleados")
    val n = readln().toInt()
    var sumaSueldos = 0.0
    var empleadosEntre100y300 = 0
    var empleadosMasDe300 = 0
    var i = 0
    while (i < n) {
        print("ingrese el sueldo del empleado ${i + 1}:")
        val sueldo = readln().toDouble()
        sumaSueldos += sueldo
        if (sueldo >= 100 && sueldo <= 300) {
            empleadosEntre100y300++
        } else if (sueldo > 300) {
            empleadosMasDe300++
        }
        i++
    }
    print("empleados que cobran entre $100 y $300: $empleadosEntre100y300\n")
    print("Empleados que cobran mas de $300: $empleadosMasDe300 \n")
    print("importe total de sueldos: $sumaSueldos")
}
