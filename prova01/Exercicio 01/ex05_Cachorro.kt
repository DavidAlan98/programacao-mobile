// Define a classe Cachorro que herda de Animal, e adiciona o atributo raça
class Cachorro(nome: String, idade: Int, val raca: String) : Animal(nome, idade) {

    // Método para o cachorro latir
    fun latir() {
        println("$nome está latindo!")  // Exibe uma mensagem que o cachorro está latindo
    }

    // Sobrescreve o método mostrarInformacoes para exibir também a raça
    override fun mostrarInformacoes() {
        super.mostrarInformacoes()  // Chama o método da classe pai
        println("Raça: $raca")  // Exibe a raça
    }
}