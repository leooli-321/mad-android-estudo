//Função soma quadrado

fun somaDosQuadrados(a: Int, b: Int) : Int {

    //Calcula o quadrado de 'a' e armazena o resultado na variável 'quadradoA'

    val quadradoA = a*a
    val quadradoB = b*b

    val soma = quadradoA + quadradoB

    println("Os números são $a e $b. A soma dos quadrados é $soma.")
    
    return soma
}