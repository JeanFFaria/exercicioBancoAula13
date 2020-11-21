package dh.android.aula13

abstract class ContaBancaria(val numConta:Int, var saldo: Double) {

    abstract fun saque (valor:Double)

    abstract fun depositar (valor: Double)
}