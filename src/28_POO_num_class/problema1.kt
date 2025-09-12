package `28_POO_num_class`

enum class Pais(val habitantes: Int) {
    ARGENTINA(46000000),
    BRASIL(214000000),
    CANADA(39000000),
    MEXICO(126000000),
    COSTA_RICA(5200000)
}

fun main() {
    val pais = Pais.MEXICO
    println("País: ${pais.name}, Habitantes: ${pais.habitantes}")
}
