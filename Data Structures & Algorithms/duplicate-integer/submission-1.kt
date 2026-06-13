class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val s = mutableSetOf<Int>()
        for(i in nums) {
            if(i in s) {
                return true
            } else {
                s.add(i)
            }
        }
        return false
    }
}
