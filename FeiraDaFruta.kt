fun main() {

    val frutas = mutableListOf("Maçã", "Banana", "Uva", "Laranja", "Morango")
    while (frutas.isNotEmpty()) {
        println("\nFrutas disponíveis: ${frutas.joinToString()}")
        print("Digite uma fruta ou PARE: ")
        val fruta = readln()
        if (fruta.equals("PARE", ignoreCase = true)) break
        if (fruta in frutas) {
            frutas.remove(fruta)
            println("Fruta foi retirada da lista")
        } else {
            println("Fruta indisponível no nosso mercado")
        }
    }
    println(
        if (frutas.isEmpty()) "Lista de compras finalizada"
        else "Frutas restantes: ${frutas.joinToString()}"
    )
}