fun main() {
    val array = intArrayOf(5, 3, 8, 2, 1, 4)

    bubbleSort(array)

    for (num in array) {
        print("$num ")
    }
}

fun bubbleSort(array: IntArray) {
    val n = array.size
    var swapped: Boolean

    for (i in 0 until n - 1) {
        swapped = false

        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                swapped = true
            }
        }

        if (!swapped) {
            break
        }
    }
}
