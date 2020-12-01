package dh.android.aula08

class ContaCorrente(saldo: Double,var limiteCE: Double ):Conta(saldo) {

    override fun depositar(valor: Double) {
        super.depositar(valor)
    }

    override fun sacar(valor: Double) {
        if (valor<=saldo){
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso. Saldo atual R$$saldo. Saldo do cheque especial de R$$limiteCE")
        } else if (valor <= saldo + limiteCE){
            val excedente = valor - saldo
            saldo -= (valor - excedente)
            limiteCE -= excedente
            println("Saque de R$$valor com uso de cheque especial realizado com sucesso. Saldo atual R$$saldo. O novo Limite do Cheque Especial é de R$$limiteCE")
        } else{
            println("Saldo insuficiente")
        }
    }


    fun depositarCheque(cheque: Cheque){
        saldo += cheque.valor
        println("Cheque de R$${cheque.valor} do banco ${cheque.bancoEmissor} com data de pagto ${cheque.dataDePagamento} depositado com sucesso. Saldo atual R$$saldo")
    }

}
