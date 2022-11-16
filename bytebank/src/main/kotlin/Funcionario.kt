open class Funcionario(
    val nome: String,

    val cpf: String,
    val salario: Double,
) {

    open fun getBonificacao(): Double {
        return salario * 0.1
    }

}