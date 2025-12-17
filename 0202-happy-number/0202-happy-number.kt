class Solution {
    fun isHappy(n: Int): Boolean {
        val list = mutableSetOf<Int>()
        var num = n
        while (num != 1){
            if (num in list) return false
            list.add(num)
            var res = 0
            var temp = num
            while (temp > 0) {
                val rem = temp % 10
                res += rem * rem
                temp /= 10
            }
            num = res
        }
        return true
    }
}