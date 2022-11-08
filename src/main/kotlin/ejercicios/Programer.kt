package ejercicios

class Programer (val name:String, var age:Int, val languages: Array<Language>, val friends: Array<Programer>? = null){

    enum class Language {

        KOTLIN,
        JAVA,
        HTML5

    }

    fun code(){

        for (language in languages){

            println("Estoy programando en $language")

        }

    }

}