package dh.android.aula08

open class Conta(var saldo: Double) {
    open fun depositar(valor: Double) {
        saldo += valor
        println("Depósito de R$$valor realizado com sucesso. Saldo atual R$$saldo")
    }

    open fun sacar(valor: Double){
    }

    open fun consultaSaldo (){
        println("Seu saldo atual é R$$saldo")
    }
}