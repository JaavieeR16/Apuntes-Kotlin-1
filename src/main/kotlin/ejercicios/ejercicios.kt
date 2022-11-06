package ejercicios

//variables y constantes.
fun variablesYConstantes(){

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

//Tipos de datos.
fun tiposDeDatos(){

    //String

    val myString: String = "¡Primer String!"

    val myString2 = "¡Segundo String!"

    val myString3 = myString + " " + myString2

    println(myString3)

    //Enteros (Byte, Short, Int, Long)

    val myInt: Int = 1

    val myInt2 = 2

    val myInt3 = myInt + myInt2

    println(myInt3)

    //Decimales (Float, Double)

    val myDouble: Double = 1.5

    val myDouble2 = 2.5

    val myDouble3: Int = 1

    val myDouble4 = myDouble + myDouble2 + myDouble3

    println(myDouble4)

    val myFloat: Float = 3.5f

    val myFloat2 = 4.5f

    val myFloat3 = myFloat + myFloat2

    println(myFloat3)

    //Boolean (Bool)

    val myBool: Boolean = true

    val myBool2 = false

    println(myBool == myBool2)

    println(myBool != myBool2)

    println(myBool && myBool2)

    println(myBool || myBool2)
}

fun sentenciaIf(){

    val myNumber = 12

    if (myNumber <= 10) {
        println("$myNumber es menor o igual que 10")
    }else{
        println("$myNumber es mayor que 10")
    }

}
