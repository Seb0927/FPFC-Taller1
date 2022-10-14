package object Recursion {
  /**
   * Ejercicio 1.1.1
   * maximo comun divisor a partir del teorema fundamental de la aritmetica
   * @param ln
   * @param lm
   * @param primos
   * @return mcd
   */
  def mcdTFA(ln:List[Int], lm:List[Int], primos:List[Int]):Int = {

    if (ln.isEmpty) {
      1;
    } else if (ln.head < lm.head) {
      scala.math.pow(primos.head, ln.head).toInt * mcdTFA(ln.tail, lm.tail, primos.tail);
    } else {
      scala.math.pow(primos.head, lm.head).toInt * mcdTFA(ln.tail, lm.tail, primos.tail);
    }

  }

  /**
   * Ejercicio 1.1.2
   * maximo comun divisor a partir del teorema de Euclides con coeficientes de Bezout
   * @param n
   * @param m
   * @return (mcd, x, y)
   */
  def mcdEBez(n:Int, m:Int):(Int,Int,Int) = {

    //Función encargada de ser recursiva
    def encontrarCoeficientes(r0:Int, r1:Int, s0:Int, s1:Int, t0:Int, t1:Int): (Int, Int, Int) ={
      if (r1 == 0){
        return (r0, s0, t0);
      } else {
        def r:Int = (r0 % r1).toInt;
        val q = (scala.math.floor(r0/r1)).toInt;
        val s = (s0 - q * s1).toInt;
        val t = (t0 - q * t1).toInt;
        encontrarCoeficientes(r1, r, s1, s, t1, t);
      }
    }

    if (n>m){
      return encontrarCoeficientes(n, m, 1, 0, 0, 1);
    } else {
      return encontrarCoeficientes(m, n, 0, 1, 1, 0);
    }

  }

  /**
   * Ejercicio 1.2.1
   * fibonacci recursivo de arbol
   * @param n
   * @return resultado fibonacci
   */
  def fibonacciA(n: Int):Int = {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      val particion1 = n-1
      val particion2 = n-2
      return fibonacciA(particion1) + fibonacciA(particion2)
    }
  }

  /**
   * Ejercicio 1.2.2
   * fibonacci iterativo
   * @param n
   * @return resultado fibonacci
   */
  def fibonacciI(n:Int):Int = {

    def fibIterativo(acumulador:Int, n1:Int, n2:Int, contador:Int):(Int) = {
      if (contador == 0){
        return acumulador
      } else {
        return fibIterativo(n1+n2, n2, n1+n2, contador-1)
      }
    }

    return fibIterativo(0, 1, 0, n+1)

  }




}