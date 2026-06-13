class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val m = HashMap<Char, Int>()

        for (i in s) {
            if (m[i] == null) {
                m[i] = 1
            } else {
                var a = m[i]!!
                a+=1
                m[i] = a
            }
        }

        for (i in t) {
            if (m[i] == null) return false
            m[i] = m[i]!! - 1
            if (m[i]!! < 0) return false    
        }
        return true
    }
}
