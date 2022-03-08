package Animal
class Cachorro (nome: String,  idade: Int) : Animal(nome, idade){
    override fun emitirSom(){
        println("Au AU!")
    }
}
/*class animal (val nome: String, var idade: String, som: String, correr: String
              ) {
    fun nome(){
    println("nome")
}
    fun idade() {
        println("idade")
    }
    fun som() {
        println("som")}

    fun correr(){
        println("correr")

    }

}*/