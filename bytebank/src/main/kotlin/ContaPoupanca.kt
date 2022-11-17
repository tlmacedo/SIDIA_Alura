class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double): Boolean {
        if (!validaValor(valor)) return false
        println("Sacando R$ $valor na conta do $titular.")
        if (saldo >= valor) {
            saldo -= valor
            imprimeSaldo()
            return true
        } else {
            println("Saldo R$ $saldo, é insuficiente para sacar R$ $valor")
        }
        return false

    }


}