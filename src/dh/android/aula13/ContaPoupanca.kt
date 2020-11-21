package dh.android.aula13

class ContaPoupanca(var limite:Double, numConta: Int, saldo: Double): ContaBancaria(numConta, saldo), Imprimivel {
    override fun saque(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque de valor $valor em sua conta. Saldo atual $saldo")
        } else if (valor > saldo && valor < saldo + limite) {
            var excedente = valor - saldo
            saldo -= valor - excedente
            limite -= excedente
            println("Saque de valor $valor em sua conta. Saldo atual $saldo. Foi necessário utilização de $excedente de seu limite. Saldo do limite $limite")
        } else {
            println("Saldo insuficiente")
        }
    }

    override fun depositar(valor: Double) {
        saldo+=valor
        println("Deposito de valor $valor em sua conta. Saldo atual $saldo")
    }

    override fun mostrarDados() {
        println("Essa conta poupança possui o número $numConta, o saldo atual é de R$$saldo e possui um limite de $limite")
    }


}