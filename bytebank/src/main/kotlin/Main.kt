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


    println("Depositando na conta do Thiago")
    deposita(contaThiago, 55.0)
    deposita(contaFran, 26.0)

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
    println("Saldo atualizada do(a) ${conta.titular} é de R$ ${conta.saldo}")
}

class Conta {

    var titular = ""
    var numero = 0
    var saldo = 0.0

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
