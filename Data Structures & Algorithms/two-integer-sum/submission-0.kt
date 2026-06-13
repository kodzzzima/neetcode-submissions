class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        
        nums.forEachIndexed { index, item ->
            if (map[item] != null) {
                return intArrayOf(map[item]!!, index)
            } else {
                val a = target - item
                map[a] = index
            }
        }
        return intArrayOf()
    }
}
