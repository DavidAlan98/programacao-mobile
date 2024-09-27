fun main() {
    // Solicita um número inteiro ao usuário
    print("Digite um número inteiro: ")
    val inteiro = readLine()?.toIntOrNull()  // Converte a entrada para inteiro ou retorna null se a conversão falhar

    // Solicita um número decimal ao usuário
    print("Digite um número decimal: ")
    val decimal = readLine()?.toDoubleOrNull()  // Converte a entrada para decimal (Double) ou retorna null se a conversão falhar

    // Verifica se os valores inseridos não são nulos
    if (inteiro != null && decimal != null) {
        val inteiroParaDecimal: Double = inteiro.toDouble()  // Converte o inteiro para decimal (Double)
        val decimalParaInteiro: Int = decimal.toInt()  // Converte o decimal para inteiro

        // Exibe os valores convertidos e seus tipos de dados
        println("Número inteiro convertido para decimal: $inteiroParaDecimal (Tipo: ${inteiroParaDecimal::class.simpleName})")
        println("Número decimal convertido para inteiro: $decimalParaInteiro (Tipo: ${decimalParaInteiro::class.simpleName})")
    } else {
        // Se as entradas forem inválidas, exibe uma mensagem de erro
        println("Entrada inválida, por favor, insira números válidos.")
    }
}