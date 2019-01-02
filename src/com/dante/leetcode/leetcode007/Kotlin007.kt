
class Kotlin007 {
    fun reverse(x: Int): Int {
        var startLen = 0
        if (x < 0) {
            startLen = 1
        }
        val str = x.toString()
        if (str.length == 1) {
            return x
        }
        var lastLen = str.length - 1
        var readStr = ""
        while (lastLen >= startLen) {
            readStr += str[lastLen]
            lastLen--
        }
        return try {
            if (startLen == 0) {
                readStr.toInt()
            } else {
                readStr.toInt() * (-1)
            }
        } catch (e: NumberFormatException) {
            0
        }
    }
}