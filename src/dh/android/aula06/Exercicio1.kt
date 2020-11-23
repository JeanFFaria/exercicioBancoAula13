package dh.android.aula06

fun main() {
    val clienteJean = Cliente("Jean","Faria")
    val contaJean = Conta(789,100.0,clienteJean)

    contaJean.depositoConta(100.0)
    contaJean.saqueConta(50.0)

}