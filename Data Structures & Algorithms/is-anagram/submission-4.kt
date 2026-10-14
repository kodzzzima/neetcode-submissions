class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val countS = mutableMapOf<Char, Int>()
        val countT = mutableMapOf<Char, Int>()

        s.forEach { item ->
            countS[item] = (countS.getOrDefault(item, 0) + 1)
        }

        t.forEach { item ->
            countT[item] = (countT.getOrDefault(item, 0) + 1)
        }

        return countS == countT
    }
}
