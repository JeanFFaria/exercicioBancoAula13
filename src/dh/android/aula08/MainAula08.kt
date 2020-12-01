package dh.android.aula08

fun main() {
    val cliente1 = Cliente(123,"Jean","49123456-1","123.456.789-12")
    val contaPoup1 = ContaPoupanca(100.0,5)
    val contaCorrente1 = ContaCorrente(100.0,150.0)
    val cheque1 = Cheque("Itaú",100.0,"01/01/2021")

//    contaPoup1.depositar(1000.0)
//    contaPoup1.sacar(10.0)
//    contaPoup1.recolherJuros()

    contaCorrente1.depositar(100.0)
    contaCorrente1.depositarCheque(cheque1)
    contaCorrente1.sacar(500.0)
}