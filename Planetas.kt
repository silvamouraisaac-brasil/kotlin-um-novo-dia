fun main() {

    val planetas = listOf(
        "Mercúrio", "Vênus", "Terra", "Marte",
        "Júpiter", "Saturno", "Urano", "Netuno", "Plutão"
    )
    println(planetas.joinToString())
    print("Digite um planeta: ")
    val planeta = readln()
    println(
        if (planeta in planetas) "$planeta está na lista!"
        else "$planeta não está na lista."
    )
}