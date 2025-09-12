package `29_POO_Objeto_nombrado`
object Mayor {
    fun maximo(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun maximo(a: Float, b: Float): Float {
        return if (a > b) a else b
    }

    fun maximo(a: Double, b: Double): Double {
        return if (a > b) a else b
    }
}

fun main() {
    println("Mayor entre 5 y 8 (Int): ${Mayor.maximo(5, 8)}")
    println("Mayor entre 3.5f y 2.8f (Float): ${Mayor.maximo(3.5f, 2.8f)}")
    println("Mayor entre 7.2 y 7.25 (Double): ${Mayor.maximo(7.2, 7.25)}")
}
