package `2`.Entrada_de_datos


  /* realizar un programa que lea por teclado  cuatro valores numericos enteros e informar su suma y promedio
   */
  fun main() {
      println("ingrese un numero")
      val v1: Int = readln().toInt()
      println("ingrese un numero")
      val v2: Int = readln().toInt()
      println("ingrese un numero")
      val v3: Int = readln().toInt()
      println("ingrese un numero")
      val v4: Int = readln().toInt()
      val suma: Int = v1 + v2 + v3 + v4
      val promedio: Int = suma /4
      println("la suma d los cuatro numeros es $suma")
      println("el promedio es $promedio")


  }
