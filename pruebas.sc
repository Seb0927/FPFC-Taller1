import Recursion.{mcdTFA, mcdEBez, fibonacciA, fibonacciI}

//Pruebas mcdTFA

mcdTFA(List(2), List(1), List(5)) //mcd(25,5)
mcdTFA(List(1,2), List(2,1), List(2,5)) //mcd(10,20)
mcdTFA(List(3,1,1), List(2,0,3), List(2,3,5)) //mcd(120,500)
mcdTFA(List(2,0,3), List(3,1,1), List(2,3,5)) //mcd(500,120)
mcdTFA(List(2,1,0,1), List(3,1,1,0), List(2,3,5,7)) //mcd(84, 120)

//Pruebas mcdEBez

mcdEBez(1, 0)
mcdEBez(0, 1)
mcdEBez(963, 657)
mcdEBez(657, 963)
mcdEBez(42,550)
mcdEBez(550,42)

//Pruebas fibonacciA

fibonacciA(0)
fibonacciA(1)
fibonacciA(2)
fibonacciA(6)
fibonacciA(10)

//Pruebas fibonacciI

fibonacciI(0)
fibonacciI(1)
fibonacciI(2)
fibonacciI(6)
fibonacciI(10)

