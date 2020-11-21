package dh.android.aula05

fun eInteiroEmaiorQueDez (numInt: Int): Boolean{
    if(numInt % 2 == 0 && numInt > 10){
        return true
//        println("true")
    } else {
//        println("false")
        return false
    }
}

fun main(){
    eInteiroEmaiorQueDez(20)
    eInteiroEmaiorQueDez(5)
}

