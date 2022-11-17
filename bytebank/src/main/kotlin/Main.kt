fun main() {

    println("Bem vindo ao Bytebank\n")

    val contaCorrente = ContaCorrente(
        titular = "Corrente",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Poupanca",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    contaCorrente.transfere(100.0, contaPoupanca)
    contaPoupanca.transfere(100.0, contaCorrente)

}

