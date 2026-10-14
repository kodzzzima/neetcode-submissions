class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Ключ — само число, значение — его индекс в массиве
        val numsMap = mutableMapOf<Int, Int>()
        
        nums.forEachIndexed { index, item ->
            val complement = target - item
            
            // Если дополнение уже есть в карте, мы нашли пару
            if (numsMap.containsKey(complement)) {
                return intArrayOf(numsMap[complement]!!, index)
            }
            
            // Если нет, сохраняем текущее число и его индекс
            numsMap[item] = index
        }

        return intArrayOf()
    }
}