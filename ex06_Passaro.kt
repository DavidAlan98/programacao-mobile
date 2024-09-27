// Define a classe Passaro que implementa a interface Voador
class Passaro(val nome: String) : Voador {

    // Implementa o método voar para pássaros
    override fun voar() {
        println("$nome está voando como um pássaro.")  // Exibe a ação de voar
    }
}