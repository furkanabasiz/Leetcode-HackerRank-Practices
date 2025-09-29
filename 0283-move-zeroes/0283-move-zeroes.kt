class Solution {
    fun moveZeroes(nums: IntArray): Unit {

        var pointer = 0

        for(i in nums.indices){
            if(nums[i] != 0){
                val temp = nums[pointer]
                nums[pointer] = nums[i]
                nums[i] = temp
                pointer ++
            }
        }
    }
}