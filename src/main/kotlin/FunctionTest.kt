fun myFunction(function:()->Unit) {
    println("I am inline function - A")
    function
    println("I am inline function - B")
}
val sum  = {num1:Int,num2:Int->num1+num2}

fun multiply(a: Int,b:Int,myLambda: (Int)->Unit){
    val add = a+b
    println(add)
}

fun student(code:Int = 101,name:String = "Mark", age: Int = 40): String = ("ID: $code Name:$name Age:$age")
fun getName(firstName: String,lastname:String): String = firstName + " " + lastname
fun addNumber(n1:Double,n2:Double):Double {
    val sum = n1 + n2
    return sum
}
fun add(a:Int, b:Int):Int{
//    println(a + b)
    return a + b
}

fun mathRoot(){
    val number = 9.0
    val result= Math.sqrt(number)
    println("The root of $number = $result")
}
fun mathPower(){
    var a = 3.0
    var b = 2.0
    var result = Math.pow(a,b)
    println("The power fo $a^$b = $result")
}

