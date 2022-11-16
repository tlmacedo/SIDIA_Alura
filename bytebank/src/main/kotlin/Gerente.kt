class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha)
            return true
        return false
    }
}