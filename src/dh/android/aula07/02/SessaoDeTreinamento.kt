package dh.android.aula07.`02`

class SessaoDeTreinamento {
    fun treinarA (jogadorDeFutebol: JogadorDeFutebol){
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        println("experiencia inicial ${jogadorDeFutebol.experiencia}")
        jogadorDeFutebol.experiencia++
        println("experiencia final ${jogadorDeFutebol.experiencia}")

    }
}