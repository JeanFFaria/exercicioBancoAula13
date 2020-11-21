package dh.android.aula05

fun analiseTexto (textoA: String, textoB: String): Boolean{
    if(textoA == textoB){
//        println("true")
        return true
    } else{
//        println("false")
        return false
    }
}

fun main(){
    analiseTexto("Jean","JeanC")
}