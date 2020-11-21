package dh.android.aula05

var array = intArrayOf(1,2,3,4,5,6,7)

fun main() {
    var emptyArray = mutableListOf<Int>()
    for (i in array) {
        if (i % 2 == 0) {
            emptyArray.add(i)
        }
    }
    print(emptyArray)
}