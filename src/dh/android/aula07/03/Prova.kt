package dh.android.aula07.`03`

class Prova(var dificuldade: Int, var energiaNecessaria: Int){
//    fun podeRealizar(atleta: Atleta): String{
//        if (atleta.nivel >= dificuldade){
//            return "true"
//        } else {
//            return "false"
//        }
//    } DEVERIA SER ASSIM, MAS SE USO RETURN O TERMINAL NAO GERA NENHUMA MSG
    fun podeRealizar(atleta: Atleta){
        if (atleta.nivel >= dificuldade){
            println("true")
        } else {
            println("false")
        }
    }
}