class Solution {
    fun lengthOfLastWord(s: String): Int {
        var i = s.length - 1
        var len = 0
        while (i >= 0 && s[i] == ' ') i--
        while (i >= 0 && s[i] != ' ') {
            len++
            i--
        }
        return len
    }
}