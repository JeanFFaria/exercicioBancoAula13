package dh.android.aula05

fun comparaNumInt (numA:Int, numB:Int): Boolean {
    if (numA < numB) {
        return true
    } else {
        return false
    }
}


fun main(){
    comparaNumInt(2,3)
}