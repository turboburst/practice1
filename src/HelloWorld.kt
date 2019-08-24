@file:JvmName("newKtFile")
fun main(args: Array<String>){
    var myString: String = ""
    myString = "Hello word ${myString}"
    var num1 = 10
    var num2 = 3
    val r1 = 1..6 step 2
    val r2 = 8 downTo 7 step 2
    var r3 = 7 .. 10 step 2
    r3 = -9..90 step 3
    val r4 = 10.rangeTo(16)
    val r5 = 10.downTo(1) step 3
    println(52 in r3)
    val p = Person("mike")
    p.name = "john"
    println("sdff " + p.name)
    println(TestMethod().getResult(num1, num2))
    println(TestMethod() test("fdd"));
    println("ffff ${TestMethod().getP().name}")
    println("$num1")
    for (item in 1.rangeTo(9) step 2){
        print("$item\t")
    }
    var i:Int = 3
    while(i in 1..9){
        println(i)
        i++
    }
    println(add(5, 6))
    println(max(5.0, 6.0))

    println()
    val maxNum: Int = if(num1 > num2) {
                                println("num1 is bigger")
                                num1
                            } else {
                                println("num2 is bigger")
                                num2
                            }
    println(maxNum)
    println(getSum(4.0, 5.0, 5.6))
    println(5.greaterValue(8))
}

fun add(a: Int, b: Int): Int = a + b
fun max(num1: Double, num2: Double): Double = if(num1 >= num2) num1 else num2

fun Int.greaterValue(num: Int):Int = if(this > num) this else num

@JvmOverloads
fun getSum(num1: Double, num2: Double, num3: Double = 10.0): Double{
    return num1 + num2 * num3;
}

class TestMethod{
    private var p: Person = Person("mighty")
    fun getResult(num1: Int, num2: Int): Int{
        return num1 + num2
    }
    infix fun test(str: String){
        println(str)
    }
    fun getP(): Person {
        return p
    }
}