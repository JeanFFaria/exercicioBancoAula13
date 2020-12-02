package dh.android.aula09

fun main() {
    val aluno1 = Aluno(12, "Jean", "Faria")
    val aluno2 = Aluno(34, "Carol", "Ribeiro")
    val professor1 = Professor("João", 55)
    val materia1 = Materia("P.O")
    val materia2 = Materia("P.C.P")
    val aula1 = Aula(materia1, "19:00", "22:00")
    val aula2 = Aula(materia2, "19:00", "22:00")
    val aulasEngProd = listOf<Aula>(aula1, aula2)
    val alunosEngProd = listOf<Aluno>(aluno1, aluno2)
    val curso1 = Curso("Eng Produção", aulasEngProd, alunosEngProd, professor1)


    professor1.darAula(aula1, curso1)
    professor1.fazerChamada(aluno1)
    professor1.fazerChamada(aluno2)
    professor1.imprimirListaDeChamada()
}