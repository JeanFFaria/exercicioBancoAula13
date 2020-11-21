package dh.android.aula13

class ContaCorrente(var taxaDeOperacao: Double, numConta: Int, saldo:Double):ContaBancaria(numConta,saldo), Imprimivel{
    override fun saque(valor: Double) {
        if((valor+taxaDeOperacao)<=saldo){
        saldo-=(valor+taxaDeOperacao)
            println("Saque de valor R$$valor em sua conta com taxa de operação de $taxaDeOperacao. Saldo atual $saldo")
        } else
            println("Saldo insuficiente")
    }

    override fun depositar(valor: Double) {
        saldo+=valor
        saldo-=taxaDeOperacao
            println("Deposito de valor R$$valor em sua conta com taxa de operação de $taxaDeOperacao. Saldo atual $saldo")
    }

    override fun mostrarDados() {
      println("Essa conta corrente possui o número $numConta, o saldo atual é de R$$saldo e possui uma tx de operação de $taxaDeOperacao")
    }
}