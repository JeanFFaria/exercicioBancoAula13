package dh.android.aula08

open class Conta(var saldo: Double, cliente: Cliente) {
    open fun depositar(valor: Double) {
        saldo += valor
    }

    open fun sacar(valor: Double){
    }

    open fun consultaSaldo (){
        println("Seu saldo atual é  $saldo")
    }
}