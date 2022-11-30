fun main() {

    println("Bem vindo ao Bytebank\n")

    val gerente = Gerente(
        "Fran",
        "222.222.222-22",
        5000.0,
        2222
    )

    val  diretor = Diretor(
        "Thiago",
        "111.111.111-11",
        10000.0,
        1111,
        20.0
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 2222)
    sistema.entra(diretor, 1111)
}

