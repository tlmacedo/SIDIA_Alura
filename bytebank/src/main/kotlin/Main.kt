fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank\n")

    var i = 0
    while (i < 5) {
        i++
        val titular = "Thiago Macedo $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: R$ $saldo\n")

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

}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva.")
        saldo == 0.0 -> println("conta é neutra.")
        else -> println("conta é negativa.")
    }
}