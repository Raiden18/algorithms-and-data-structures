private val arraySort = arrayOf(4, 1, 9, 5, 7, 8, 1)

private fun main() {
    //Try any type of sort
}

private fun tryBubbleSort() {
    arraySort.printValues("Array before sort ")
    arraySort.bubbleSort()
    arraySort.printValues("Array after bubble sort ")
}

private fun trySelectionSort() {
    arraySort.printValues("Array before sort ")
    arraySort.selectionSort()
    arraySort.printValues("Array after bubble sort ")
}

private fun tryInsertionSort() {
    arraySort.printValues("Array before sort ")
    arraySort.insertionSort()
    arraySort.printValues("Array after bubble sort ")
}

//O(N^2) comparisons and and swaps
//Swap item with next to item if it one is bigger.
//Items accumulate on the right
private fun Array<Int>.bubbleSort(): Array<Int> {
    for (indexOut in 0 until size) {
        for (indexIn in indexOut until size) {
            val temp = this[indexOut]
            val nextItem = this[indexIn]
            if (temp > nextItem) {
                this[indexOut] = nextItem
                this[indexIn] = temp
            }
        }
    }
    return this
}

//O(N) comparision but O(N^2) swaps. Selection sor improves on bubble sort.
//Find the min value and swap it with the most left item
//Items accumulates on the left
private fun Array<Int>.selectionSort(): Array<Int> {
    for (indexOut in 0 until size) {
        var indexMinValue = indexOut
        for (indexIn in indexOut until size) {
            if (this[indexOut] > this[indexIn]) {
                indexMinValue = indexIn
            }
        }
        val temp = this[indexOut]
        this[indexOut] = this[indexMinValue]
        this[indexMinValue] = temp

    }
    return this
}

//If arraySort starts in decrease order it needs to swap O(N^2) swaps and comparisons
private fun Array<Int>.insertionSort(): Array<Int> {
    for (indexOut in 1 until size) {
        var indexIn = indexOut
        println(indexOut)
        while (indexIn > 0 && this[indexIn - 1] > this[indexIn]) {
            val temp = this[indexIn - 1]
            this[indexIn - 1] = this[indexIn]
            this[indexIn] = temp
            indexIn--
        }
    }
    return this
}




