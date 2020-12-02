package dh.android.aula10

abstract class IngressoVIP (valor: Double): Ingresso(valor){
    abstract var valorAdic: Double
    override fun imprimeValor() {
        println("O valor do Ingresso VIP é R$${valor+valorAdic}")
    }
}