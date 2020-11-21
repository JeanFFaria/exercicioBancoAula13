package dh.android.aula13

fun main() {
    val contaCorrente1 = ContaCorrente(5.0,123,0.0)
    val contaPoupanca1 = ContaPoupanca(10.0,456,0.0)

    contaCorrente1.depositar(50.0)
    contaPoupanca1.depositar(100.0)
}