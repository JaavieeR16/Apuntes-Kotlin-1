package ejercicios

interface Game {

    val game: String

    fun play()

    fun stream(){

        println("Estoy haciendo Stream de mi juego $game")

    }

}