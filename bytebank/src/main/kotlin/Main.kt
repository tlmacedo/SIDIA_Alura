fun main() {
    println("Bem vindo ao Bytebank\n")

    val contaThiago = Conta()
    contaThiago.titular = "Thiago Macedo"
    contaThiago.numero = 1000
    contaThiago.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0


    println("Titular: ${contaThiago.titular}")
    println("Numero da conta: ${contaThiago.numero}")
    println("Saldo: R$ ${contaThiago.saldo}")

    println("Titular: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numero}")
    println("Saldo: R$ ${contaFran.saldo}")


    contaThiago.deposita(55.0)
    contaFran.deposita(26.0)

    println()
    println()
    contaThiago.saca(75.0)
    contaFran.saca(200.0)

    //keepsyms=1 alcid=1 amfi_get_out_of_my_way=0x1

}

class Conta {

    var titular = ""
    var numero = 0
    var saldo = 0.0


    fun imprimeSaldo() {
        println("Saldo atualizada do(a) $titular é de R$ $saldo")
    }

    fun deposita(valor: Double) {
        println("Depositando R$ $valor na conta do $titular.")
        saldo += valor
        imprimeSaldo()
    }

    fun saca(valor: Double) {
        println("Sacando R$ $valor na conta do $titular.")
        if (saldo >= valor) {
            saldo -= valor
            imprimeSaldo()
        } else {
            println("Saldo R$ $saldo, é insuficiente para sacar R$ $valor")
        }
    }

}

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")


    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta João: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

}


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

