package dh.android.aula05

var numero = intArrayOf(1,2,3,4)

fun main() {
    var soma = 0
    for (i in numero) {
        if (i % 2 == 0) {
            soma += i
        }
        }
        println(soma)
    }