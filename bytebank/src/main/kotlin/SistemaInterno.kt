class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha))
            println("Seja-bem vindo ao ByteBank")
        else
            println("houve falha na autenticação")
    }
}