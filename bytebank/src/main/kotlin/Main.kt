fun main() {

    println("Bem vindo ao Bytebank\n")

    val thiago = Funcionario(
        nome = "Thiago Macedo",
        cpf = "123.456.789.00",
        salario = 5000.0
    )

    println("nome: ${thiago.nome}")
    println("cpf: ${thiago.cpf}")
    println("salario: R$${thiago.salario}")
    println("bonificação: R$${thiago.bonificacao()}")

    //testaComportamentoConta()

}
