package ejercicios

open class Person (name:String, age:Int): Work(), Game{

    open fun work(){

        println("Esta persona esta trabajando.")

    }

    override fun goToWork() {

        println("Esta persona va al trabajo.")

    }

    //Game Interface

    override val game: String = "Among Us"

    override fun play() {

        println("Esta persona esta jugando $game.")

    }

}