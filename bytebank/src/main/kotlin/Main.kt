import java.util.DoubleSummaryStatistics

fun main() {

    println("Bem vindo ao Bytebank\n")

    val contaThiago = Conta(titular = "Thiago Macedo", numero = 1000)
    contaThiago.deposita(valor = 0.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(valor = 300.0)

    println("Titular: ${contaThiago.titular}")
    println("Numero da conta: ${contaThiago.numero}")
    println("Saldo: R$ ${contaThiago.saldo}")

    println("Titular: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numero}")
    println("Saldo: R$ ${contaFran.saldo}")

    println()
    contaThiago.deposita(55.0)
    contaFran.deposita(26.0)

    println()
    contaThiago.saca(75.0)
    contaFran.saca(200.0)

    println()
    contaThiago.transfere(170.0, contaFran)

}

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

//fun testaCopiasEReferencias() {
//
//    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")
//
//
//    val contaJoao = Conta()
//    contaJoao.titular = "João"
//
//    var contaMaria = contaJoao
//    contaMaria.titular = "Maria"
//
//    println("titular conta João: ${contaJoao.titular}")
//    println("titular conta Maria: ${contaMaria.titular}")
//
//}


//    for (i in 1 ..10 step 2) {
//
//        if (i == 7)
//            break
//
//        val titular = "Thiago Macedo $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular: $titular")
//        println("Número da conta: $numeroConta")
//        println("Saldo: R$ $saldo\n")
//
//
//    }

