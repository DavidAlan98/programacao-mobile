fun main() {
    var somaPares = 0  // Inicializa a variável para armazenar a soma

    // Loop de 1 a 100
    for (i in 1..100) {
        // Verifica se o número atual (i) é par
        if (i % 2 == 0) {
            somaPares += i  // Adiciona o número par à soma
        }
    }

    // Exibe a soma dos números pares
    println("A soma dos números pares de 1 a 100 é: $somaPares")
}
