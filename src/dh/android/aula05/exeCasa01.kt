package dh.android.aula05

fun analiseInt (numeroA: Int, numeroB: Int, numeroC: Int){
    if (numeroA > numeroB && numeroA > numeroC){
        println(numeroA)
    } else if (numeroB > numeroA && numeroB > numeroC){
        println(numeroB)
    } else {
        println(numeroC)
    }
}

fun main(){
    analiseInt(5,7,3)
}