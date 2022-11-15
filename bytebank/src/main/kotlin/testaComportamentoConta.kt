fun testaComportamentoConta() {
    val contaThiago = Conta(titular = "Thiago Macedo", numero = 1000)
    contaThiago.deposita(valor = 0.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(valor = 300.0)

    println("Titular: ${contaThiago.titular}")
    println("Numero da conta: ${contaThiago.numero}")
    println("Saldo: R$ ${contaThiago.saldo}")

    println("Titular: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numero}")
    println("Saldo: R$ ${contaFran.saldo}")

    println()
    contaThiago.deposita(55.0)
    contaFran.deposita(26.0)

    println()
    contaThiago.saca(75.0)
    contaFran.saca(200.0)

    println()
    contaThiago.transfere(170.0, contaFran)
}