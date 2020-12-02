package dh.android.aula10

class IngressoNormal(valor: Double):Ingresso(valor) {
    override fun imprimeValor() {
        println("O valor do ingresso normal é R$$valor")
    }
}