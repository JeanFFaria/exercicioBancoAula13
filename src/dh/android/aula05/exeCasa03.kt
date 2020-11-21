package dh.android.aula05

fun ePar (numInt: Int): Boolean{
    if(numInt % 2 == 0){
        return true
//        println("true")
    } else {
//        println("false")
        return false
    }
}

fun main() {
    ePar(20)
    ePar(5)
}