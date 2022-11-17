fun testaContasDiferentes() {
    val thiago = Analista(
        nome = "Thiago Macedo",
        cpf = "123.456.789.00",
        salario = 1000.0
    )
    println()
    println("nome: ${thiago.nome}")
    println("cpf: ${thiago.cpf}")
    println("salario: R$${thiago.salario}")
    println("bonificação: R$${thiago.getBonificacao()}")


    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println()
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: R$${fran.salario}")
    println("bonificação: R$${fran.getBonificacao()}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("não foi possivel autenticar")
    }


    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )
    println()
    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: R$${gui.salario}")
    println("bonificação: R$${gui.getBonificacao()}")
    println("plr: R$${gui.plr}")

    if (gui.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("não foi possivel autenticar")
    }

    //testaComportamentoConta()
    val calculadora = CalculadoraBonificacao()
    calculadora.registra(thiago)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println("total de bonificação: R$${calculadora.total}")
}
