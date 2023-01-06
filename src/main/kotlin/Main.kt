fun main(args: Array<String>, code: Int){
    val number1 = 10.5
    val number2 = 5.5
    val result:Double

    println("Sum = " + add( 10,5 ))
    mathPower()
    mathRoot()
    result = addNumber(number1,number2)
    println("Sum = $result")
    val name:String
    name = getName( "Mark","Zuckerberg")
    println("Mr." + name)

    val std:String
    std = student( 101,age = 45)
    println(std)

    val myLambda:(Int)->Unit={s:Int-> println(s) }
    multiply( 5, 10,myLambda)

    val total:Int = sum(20,10)
    println(total)

    myFunction ( { println("Inline function parameter")} )

    fun div(a:Int,b:Int) = a+b
    fun calculate(a:Int,b:Int, kFunction2: (Int ,Int) ->Int):Int{
        return a/b
    }
    println( calculate( 50, 10,::div))
}