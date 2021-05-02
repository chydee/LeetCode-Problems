class Solution {
    fun romanToInt(s: String): Int {
        val map: HashMap<Char, Int> = HashMap<Char, Int>()
        map['I'] = 1; map['V'] = 5; map['X'] = 10;
        map['L'] = 50; map['C'] = 100; map['D'] = 500
        map['M'] = 1000;
        var numeral = 0
        for (j in 0 until s.length - 1) {
            if (map[s[j]]!! < map[s[j + 1]]!!) {
                numeral -= map[s[j]]!!
            } else {
                numeral += map[s[j]]!!
            }
        }
        return numeral + map[s[s.length - 1]]!!
    }
}
