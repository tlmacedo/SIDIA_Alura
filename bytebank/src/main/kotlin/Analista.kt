class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome, cpf, salario) {

    override fun getBonificacao(): Double {
        return salario * 0.05
    }

}