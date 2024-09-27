// Define a classe Helicoptero que implementa a interface Voador
class Helicoptero(val modelo: String) : Voador {

    // Implementa o método voar para helicópteros
    override fun voar() {
        println("O helicóptero $modelo está voando.")  // Exibe a ação de voar
    }
}