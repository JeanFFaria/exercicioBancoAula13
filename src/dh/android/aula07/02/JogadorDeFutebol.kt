package dh.android.aula07.`02`

class JogadorDeFutebol(val nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    fun fazerGol(){
        energia-=5
        alegria+=10
        gols+=1
        println("GOOOOL do $nome, a energia é $energia, a alegria é $alegria e o número de gols é $gols")
    }

    fun correr(){
        energia-=10
        println("cansei e minha energia agora é $energia")
    }
}