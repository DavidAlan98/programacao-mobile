class Pessoa(val nome: String, val idade: Int, val cidade: String) {

    // Método para exibir todas as informações da pessoa
    fun mostrarInformacoes() {
        println("Nome: $nome")  // Exibe o nome
        println("Idade: $idade")  // Exibe a idade
        println("Cidade: $cidade")  // Exibe a cidade
    }
}