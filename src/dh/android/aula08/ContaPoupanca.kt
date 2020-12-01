package dh.android.aula08

class ContaPoupanca(saldo: Double, var taxaDeJuros: Int):Conta(saldo) {

    override fun depositar(valor: Double) {
        super.depositar(valor)
    }

    override fun sacar(valor: Double) {
        if(saldo>=valor){
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso. Saldo atual R$$saldo")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun recolherJuros(){
        val juros = saldo * taxaDeJuros/100
        println("Juros recolhidos com sucesso no valor de R$$juros")
    }
}

