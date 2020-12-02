package dh.android.aula10

class CamaroteInferior(valor: Double, val localizacao: String, override var valorAdic: Double):IngressoVIP(valor) {
    override fun imprimeValor() {
        println("A localização de seu ingresso é $localizacao. O valor total de seu ingresso é R$${valor+valorAdic}")
    }
}