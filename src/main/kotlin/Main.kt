fun main(args: Array<String>) {
    //literais, integer,strings,character
    val numero = 1_000_00
    val texto = "ola,como voces estao"
    val caractere='A'
    val espaco= " "
    var boolean = true
    boolean= false
   /*/
    println ("numero: "+numero)
    println("texto: $texto")
    println ("caractere: "+caractere)
    println ("espaco: "+$espaco)
    println ("boolean: "+$boolean)

    */
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}