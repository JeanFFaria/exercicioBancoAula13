package dh.android.aula07.`03`

fun main() {
    val atleta1 = Atleta("Jean", 10,5)
    val atleta2 = Atleta("Carol",20,20)
    val prova1 = Prova(15,10)

    prova1.podeRealizar(atleta1)
    prova1.podeRealizar(atleta2)
}