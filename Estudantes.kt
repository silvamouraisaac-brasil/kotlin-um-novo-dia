fun main() {

    val estudantes = mutableListOf<String>()
    while (true) {
        print("Digite o nome do estudante (ou PARE para encerrar): ")
        val nome = readln()
        if (nome.uppercase() == "PARE") {
            break
        }
        estudantes.add(nome)
    }
    println("\nQuantidade de estudantes cadastrados: ${estudantes.size}")
    println("\nLista de estudantes:")
    for (estudante in estudantes) {
        println(estudante)
    }
}