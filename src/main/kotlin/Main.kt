const val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789!@#$%^&*()"

fun main() {
    println(generatePassword(12))
}

fun generatePassword(length: Int) = (1..length).map { allowedChars.random() }.joinToString("")