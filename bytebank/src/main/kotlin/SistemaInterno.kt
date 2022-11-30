class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha))
            println("${admin.nome} Seja-bem vindo ao ByteBank")
        else
            println("${admin.nome} houve falha na autenticação")
    }
}