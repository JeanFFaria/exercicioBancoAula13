package dh.android.aula05

fun printCemPrimeirosPosImp() {
    for (number in 1..100) {
        if (number % 2 != 0) println(number)
    }
}

fun main(){
    printCemPrimeirosPosImp()
}