package com.example.test

class Math {

//    private val integerChars = '0'..'9'
//    private fun String.isInteger() = this.all { it in integerChars }


    fun add(a: String, b: String): String {
        var result = ""
        if (a.isInteger() && b.isInteger()) {
            result = (a.toInt() + b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            result = "type only integers!"
        } else {
            result = "type only digits!"
        }
        return result
    }

    private fun String.isInteger() = this.toIntOrNull()?.let { true } ?: false

    fun divide(a: String, b: String): String {
        var result = ""
        if (a.isInteger() && b.isInteger() && b != "0" && isEvenlyDiviable(a.toInt(), b.toInt())) {
            result = (a.toInt() / b.toInt()).toString()
        } else if (b == "0") {
            result = "0!"
        } else if (!isEvenlyDiviable(a.toInt(), b.toInt())) {
            result = (a.toDouble() / b.toDouble()).toString()
        } else {
            result = "type only digits!"
        }
        return result
    }

    private fun isEvenlyDiviable(a: Int, b: Int): Boolean {
        return a % b == 0
    }
}