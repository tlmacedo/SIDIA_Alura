class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double): Boolean {
        val valorComTaxa = valor + 0.1
        if (!validaValor(valorComTaxa)) return false
        println("Sacando R$ $valorComTaxa na conta do $titular.")
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
            imprimeSaldo()
            return true
        } else {
            println("Saldo R$ $saldo, é insuficiente para sacar R$ $valorComTaxa")
        }
        return false
    }

}