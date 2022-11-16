class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    override fun getBonificacao(): Double {
        return salario * 0.3
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha)
            return true
        return false
    }
}