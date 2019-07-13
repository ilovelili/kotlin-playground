package playkotlin

fun showFirstChar(input: String): Char {
    if (input.isEmpty()) {
        return ' '
    }

    return input.first()
}