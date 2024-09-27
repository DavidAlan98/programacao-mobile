fun main() {
    // Solicita um número inteiro ao usuário
    print("Digite um número inteiro: ")

    try {
        // Tenta converter a entrada para um número inteiro
        val numero = readLine()?.toInt()
        println("Número digitado: $numero")  // Exibe o número digitado
    } catch (e: NumberFormatException) {
        // Captura a exceção se a entrada não for um número inteiro
        println("Valor digitado é inválido. Por favor, insira um número inteiro.")
    }
}
