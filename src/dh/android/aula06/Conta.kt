package dh.android.aula06

class Conta (val numeroDaConta: Int, var saldoDaConta: Double, val titular: Cliente) {

    fun saqueConta (valor: Double){
        if (valor <= saldoDaConta){
            saldoDaConta-=valor
            println("Bom dia ${titular.nome} ${titular.sobrenome}, saque de R$$valor realizado com sucesso. Saldo atual R$$saldoDaConta")
        } else{
        println("saque insuficiente")}
    }

    fun depositoConta (valor: Double){
        if(valor<=0){
            println("Valor inválido para depósito")
        } else{
            saldoDaConta+=valor
            println("Depósito realizado com sucesso no valor de R$$valor. Saldo atual R$$saldoDaConta")
        }
    }


}