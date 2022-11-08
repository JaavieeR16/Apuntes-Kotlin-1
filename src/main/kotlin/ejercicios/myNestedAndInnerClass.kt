package ejercicios

class myNestedAndInnerClass {

    val one = 1

    fun returnOne():Int {

        return one

    }

    //Clase anidada - Nested Class

    class myNestedClass {

        fun sum(first:Int, second:Int): Int{
            return first + second
        }

    }

    //Clase interna - Inner Class

    inner class myInnerClass {

        fun sumTwo(number:Int): Int{

            return number + one + returnOne()

        }

    }

}