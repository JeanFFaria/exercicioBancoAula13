package dh.android.aula10

class CamaroteSuperior(valor: Double, override var valorAdic: Double, var valorAdicCam: Double, val localizacao: String):IngressoVIP(valor) {
    override fun imprimeValor() {
        println("O valor do Ingresso Camarote Superior é R$${valor+valorAdic+valorAdicCam}. Sua localização é $localizacao")
    }
}