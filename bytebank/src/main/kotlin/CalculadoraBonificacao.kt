class CalculadoraBonificacao {

    var total: Double = 0.0


    fun registra(funcionario: Funcionario) {
        this.total += funcionario.getBonificacao()
    }
    fun registra(gerente: Gerente) {
        this.total += gerente.getBonificacao()
    }
    fun registra(diretor: Diretor) {
        this.total += diretor.getBonificacao()
    }
}