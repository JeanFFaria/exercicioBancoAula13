package dh.android.aula07.`02`

fun main() {
    val jogador1 = JogadorDeFutebol("Jean",20,20,20,10)
    val jogador2 = JogadorDeFutebol("Carol", 15,15,15,15)
    val treino = SessaoDeTreinamento()

//    jogador1.correr()
//    jogador2.fazerGol()

    treino.treinarA(jogador1)

}