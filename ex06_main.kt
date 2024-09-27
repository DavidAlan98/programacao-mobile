fun main() {
    // Cria três objetos Passaro
    val passaro1 = Passaro("Pardal")
    val passaro2 = Passaro("Gaivota")
    val passaro3 = Passaro("Águia")

    // Cria dois objetos Helicoptero
    val helicoptero1 = Helicoptero("Bell 206")
    val helicoptero2 = Helicoptero("AH-64 Apache")

    // Cria uma lista de voadores (passaros e helicópteros)
    val voadores: List<Voador> = listOf(passaro1, passaro2, passaro3, helicoptero1, helicoptero2)

    // Percorre a lista e chama o método voar para cada objeto
    voadores.forEach { it.voar() }
}