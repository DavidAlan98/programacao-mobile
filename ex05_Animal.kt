// Define a classe base Animal com os atributos nome e idade
open class Animal(val nome: String, val idade: Int) {

    // Método que exibe as informações do animal
    open fun mostrarInformacoes() {
        println("Nome: $nome")  // Exibe o nome
        println("Idade: $idade")  // Exibe a idade
    }
}