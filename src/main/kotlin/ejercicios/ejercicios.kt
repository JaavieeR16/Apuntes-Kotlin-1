package ejercicios

//variables y constantes
fun ejercicio1(){

    //Variables

    var myFirstVariable = "¡Primera variable!"

    var myFirstNumber = 1

    println(myFirstVariable)

    println(myFirstNumber)

    myFirstVariable = "¡Primera variable modificada!"

    println(myFirstVariable)

    var mySecondVariable = "¡Segunda variable!"

    println(mySecondVariable)

    mySecondVariable = myFirstVariable

    println(mySecondVariable)

    myFirstVariable = "¡Primera variable modificada v2!"

    println(myFirstVariable)

    //Constantes

    val myFirstConstant = "¡Primera constante!"

    println(myFirstConstant)

    val mySecondConstant = myFirstVariable

    println(mySecondConstant)
}
