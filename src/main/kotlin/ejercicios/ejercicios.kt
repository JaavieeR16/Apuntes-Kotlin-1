package ejercicios

fun main(args: Array<String>) {
    //variablesYConstantes()
    //tiposDeDatos()
    //sentenciaIf()
    //sentenciaWhen()
    //arrays()
    //maps()
    //loops()
    //nullSafety()
    //funciones()
    //clases()
    //enumClasses()
}

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

//Sentencia If
fun sentenciaIf() {

    val myNumber = 71

    if ((myNumber <= 10 && myNumber > 5) || (myNumber == 53)) {
        println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")
    }else if (myNumber == 60){
        println("$myNumber es igual a 60")
    }else if (myNumber != 70){
        println("$myNumber no es igual a 70")
    }else{
        println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
    }
}

//Sentencia When
fun sentenciaWhen(){

    //When con String

    val country = "Mexico"

    when (country){
        "España", "Mexico", "Argentina", "Perú" -> {
            println("El idioma es español")
        }
        "EEUU" -> {
            println("El idioma es inglés")
        } else -> {
            println("Error en la introducción de datos.")
        }
    }

    //When con Int

    val age = 10

    when (age){
        in 0..2 -> {
            println("Eres un bebé")
        }
        in 3..10 -> {
            println("Eres un niño.")
        }
        in 11..17 -> {
            println("Eres un adolescente.")
        }
        in 18..69 -> {
            println("Eres un adulto.")
        }
        in 70..99 -> {
            println("Eres un anciano.")
        }else -> {
            println("Error en la introducción de datos.")
        }
    }

}

// Arrays
fun arrays() {

    val name = "Javier"

    val surname = "Monroy"

    val company = "Monroy S.L"

    val age = "21"

    //Crear el array

    val myArray = arrayListOf<String>()

    //Añadimos datos de uno en uno

    myArray.add(name)
    myArray.add(surname)
    myArray.add(company)
    myArray.add(age)

    println(myArray)

    //Añadir un conjunto de datos

    myArray.addAll(listOf("Hola","¡Bienvenido al mundo!"))

    println(myArray)

    //Acceso a datos

    val myCompany = myArray[2]

    println(myCompany)

    //Modificar datos

    myArray[5] = "¡Bienvenidos otra vez al mundo!"

    println(myArray)

    //Borrar datos

    myArray.removeAt(4)

    println(myArray)

    //Recorrer datos

    myArray.forEach{
        println(it)
    }

    //Otras operaciones

    myArray.count() //Contar los datos

    myArray.clear() //Limpiar todos los datos

    println(myArray.count())

    myArray.first() //Acceder al primer dato

    myArray.last() //Acceder al ultimo dato

}

//Mapas o diccionarios
fun maps(){

    //Sintaxis

    var myMap: Map<String, Int> = mapOf()

    println(myMap)

    //Añadir elementos

    myMap = mutableMapOf("Javier" to 1, "Pedro" to 2, "Sara" to 3)

    println(myMap)

    //Añadir un valor a nuestro mapa sin eliminar lo de antes

    myMap["Ana"] = 4

    myMap.put("Maria", 5)

    myMap.put("Marcos", 2)

    println(myMap)

    //Actualización de datos
    myMap.put("Javier", 6)

    println(myMap)

    myMap["Marcos"] = 7

    println(myMap)

    //Acceder a los datos

    println(myMap["Javier"])

    //Eliminar datos

    myMap.remove("Marcos")

    println(myMap)

}

//Bucles o Loops
fun loops(){

    //Bucles

    val myArray = listOf("Hola", "Bienvenidos al mundo", "Programacion")
    val myMap = mutableMapOf("Javier" to 1, "Pedro" to 2, "Sara" to 3)

    //For

    for (myString in myArray){
        println(myString)
    }

    for (myElement in myMap){
        println("${myElement.key}-${myElement.value}")
    }

    for (x in 0..10){
        println(x)
    }

    for (x in 0 until 10){
        println(x)
    }

    for (x in 0..10 step 2){
        println(x)
    }

    for (x in 10 downTo 0 step 3){
        println(x)
    }

    val myNumericArray = (0..20)

    for (myNum in myNumericArray){
        println(myNum)
    }

    //While

    var x = 0

    while (x < 10){
        println(x)
        x += 2
    }

}

//Null Safety
fun nullSafety(){

    var myString = "Javier"

    println(myString)

    //Variable null safety

    var mySafetyString:String? = "Javier nullSafety"

    mySafetyString = null

    println(mySafetyString)

    mySafetyString = "Monroy"

    /*if (mySafetyString != null){
        println(mySafetyString!!)
    }else{
        println(mySafetyString)
    }*/

    //Safe call

    println(mySafetyString?.length)

    mySafetyString?.let {
        println(it)
    }

}

//Funciones
fun funciones(){

    sayHello()
    sayHello()
    sayHello()

    sayMyName("Alberto")
    sayMyName("Pedro")
    sayMyName("Sara")

    sayMyNameAndAge("Alberto", 32)
    sayMyNameAndAge("Pedro", 21)
    sayMyNameAndAge("Sara", 17)

    val sumResult = sumTwoNumbers(2, 5)
    println(sumResult)

    println(sumTwoNumbers(15, 9))

    println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))

}

//Función simple
fun sayHello(){

    println("Hola!")

}

//Funciones con parámetros de entrada
fun sayMyName(name: String){

    println("Hola mi nombre es $name")

}

fun sayMyNameAndAge(name: String, age:Int){

    println("Hola mi nombre es $name y mi edad es $age")

}

//Funciones con valor de retorno
fun sumTwoNumbers(firstNumber: Int, secondNumber: Int):Int{

    val sum = firstNumber + secondNumber

    return sum

}

//Clases
fun clases(){

    val javier = Programer("Javier", 21, arrayOf(Programer.Language.KOTLIN, Programer.Language.JAVA))

    println(javier.name)

    javier.age = 22

    javier.code()

    val sara = Programer("Sara", 25, arrayOf(Programer.Language.HTML5), arrayOf(javier))

    sara.code()

    println("${sara.friends?.first()?.name} es amigo de ${sara.name}")

}

//Enun class

enum class Direction (val dir: Int){

    NORTE(1), SUR(-1), ESTE(1), OESTE(-1);

    fun description():String{

        return when (this){
            NORTE -> "La dirección es NORTE"
            SUR -> "La dirección es SUR"
            ESTE -> "La dirección es ESTE"
            OESTE -> "La dirección es OESTE"
        }

    }

}
fun enumClasses(){

    //Asignación de valores

    var userDirection: Direction? = null

    println("Dirección: $userDirection")

    userDirection = Direction.NORTE

    println("Dirección: $userDirection")

    userDirection = Direction.ESTE

    println("Dirección: $userDirection")

    //Propiedades por defecto

    println("Propiedad name: ${userDirection.name}")

    println("Propiedad ordinal: ${userDirection.ordinal}")

    //Funciones

    println(userDirection.description())

    //Inializacion

    println(userDirection.dir)

}

//Clases























