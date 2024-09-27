
fun main() {
    // Solicita um número inteiro ao usuário
    print("Digite um número inteiro: ")
    val numero = readLine()?.toIntOrNull()?:0 // Converte a entrada para inteiro ou retorna null se a conversão falhar

    // Verifica se a entrada é válida
    if (numero != null) {
        // Estrutura when para verificar se o número é positivo, negativo ou zero
        when {
            numero > 0 -> println("O número é positivo.")  // Número positivo
            numero < 0 -> println("O número é negativo.")  // Número negativo
            else -> println("O número é zero.")  // Caso contrário, o número é zero
        }
    } else {
        // Se a entrada for inválida, exibe uma mensagem de erro
        println("Entrada inválida, por favor, insira um número inteiro.")
    }
}

