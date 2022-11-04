fun main() {
    println("Bem vindo ao Bytebank\n")

//    val contaThiago = Conta()
//    contaThiago.titular = "Thiago Macedo"
//    contaThiago.numero = 1000
//    contaThiago.saldo = 200.0
//    println(contaThiago.titular)
//    println(contaThiago.numero)
//    println(contaThiago.saldo)
//
//    val contaFran = Conta()
//    contaFran.titular = "Fran"
//    contaFran.numero = 1001
//    contaFran.saldo = 300.0
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)

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

class Conta {

    var titular = ""
    var numero = 0
    var saldo = 0.0

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
