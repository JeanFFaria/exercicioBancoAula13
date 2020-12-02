package dh.android.aula09

class Professor(val nome: String, val RD: Int) {

    open val listaDeChamada = mutableListOf<Aluno>()

    fun darAula(aula: Aula, curso: Curso) {
        println("Eu, professor $nome, dou aula de ${aula.materia.nome} no curso de ${curso.nome}")
    }

    fun fazerChamada(aluno: Aluno) {
        listaDeChamada.add(aluno)
        println("Aluno ${aluno.nome} presente")
    }

    fun imprimirListaDeChamada() {
        for (aluno in listaDeChamada) {
            println(aluno.nome)
        }
    }
}
