class Conta(
    var titular: String,
    val numero: Int
) {

    var saldo = 0.0
        private set

    fun imprimeSaldo() {
        println("Saldo atualizada do(a) $titular é de R$ $saldo")
    }

    fun deposita(valor: Double) {
        if (!validaValor(valor)) return
        println("Depositando R$ $valor na conta do $titular.")
        saldo += valor
        imprimeSaldo()
    }

    fun saca(valor: Double): Boolean {
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

    fun transfere(valor: Double, destino: Conta) {
        if (!validaValor(valor)) return
        println("Transferindo R$ $valor de: $titular para: ${destino.titular}")
        if (saca(valor)) {
            destino.deposita(valor)
            imprimeSaldo()
        } else {
            println("Saldo R$ $saldo, é insuficiente para transferir R$ $valor")
        }
    }

    fun validaValor(valor: Double): Boolean {
        return (valor > 0.0)
    }

//    fun getTitular(): String {
//        return titular
//    }
//
//    fun setTitular(nome: String) {
//        if (nome.isEmpty() || nome.equals("")) return
//        titular = nome
//    }
//
//    fun getNumero(): Int {
//        return numero
//    }
//
//    fun setNumero(num: Int) {
//        if (num <= 0) return
//        numero = num
//    }
//
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        saldo = valor
//    }

}