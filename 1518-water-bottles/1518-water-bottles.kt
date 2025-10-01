class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {

        var emptyBottles = numBottles
        var count = numBottles

        while (emptyBottles >= numExchange){
            val exchanged = (emptyBottles/numExchange).toInt()
            var nonChanged = emptyBottles % numExchange
            emptyBottles = exchanged + nonChanged
            count = count + exchanged
        }
        return count
    }
}