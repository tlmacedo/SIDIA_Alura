class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
), Autenticavel {

    override fun getBonificacao(): Double {
        return salario + plr
    }

}