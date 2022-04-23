fun printText() {
    val text = "hello Kotlin."
    println(text)

}

class User {
    var name: String = ""
}


val id: Int = 100
var name: String = "takehata"

fun countLength(str: String):Int {
    return str.length
}

fun ifExample(num: Int) {
    if(num < 100) {
        println("less than 100")
    } else if (num === 100) {
        println("Equal to 100")
    } else {
        println("Greater than 100")
    }
}

fun whenExample(num: Int) {
    when(num) {
        100 -> {
            println("Equal to 100")
        }
        200 -> {
            println("Equal to 200")
        }
        else -> {
            println("undefined value")
        }
    }
}

fun whenExample2(num: Int) {
    when {
        num < 100 -> {
            println("less than 100")
        }
        num === 100 -> {
            println("Equal to 100")
        }
        else -> {
            println("Great then 100")
        }
    }
}

fun hoge() {
    var i = 1
    while (i < 10) {
        println("i is $i")
        i++
    }
}

fun hoge2() {
    for(i in 1 until 10 step 2) {
        println("$i")
    }
}

fun hoge3() {
    val list = listOf(1,2,5,6,10)
    for(i in list) {
        println("i is $i")
    }
}

class Human(val name: String) {
    fun showName() {
        println(name)
    }
}
open class Animal(val name: String) {
    fun showName() = println("name is $name")
    open fun cries() = println("")
}

class Dog(name:String): Animal(name) {
    override fun cries() = println("bowwow")
}


// 他のファイルから継承できなくなる 同ファイルでは継承可能
sealed class Platform {
    abstract fun showName()
}

class AndroidPlatform: Platform() {
    override fun showName() {
        println("Android.")
    }
}

interface Greeter {
    fun hello()
}

class GreeterImpl: Greeter{
    override fun hello() {
        println("Hello")
    }
}

fun main() {
// コレクション
// Set
//    val set: Set<String> = setOf("one","two","three")
//    println(set.contains("for"))
    val mutableSet:MutableSet<String> = mutableSetOf("one","two","three")
    mutableSet.add("for")
    println(mutableSet)

// Map
// デフォルトはimmutable
//    val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
//    println(map[2])
//
//    // containsKey keyを引数にbooleanを返す
//    println(map.containsKey(1))
//
//    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
//    mutableMap[4] = "for"
//    println(mutableMap)
// List
//    val intList: List<Int> = listOf<Int>(1,2,3)
//    println(intList[1])
//
//    val stringList: List<String> = listOf<String>("one","two","three")
//    println(stringList)

    // ListOfとmutableListOfがある
//    val mutableList: MutableList<Int> = mutableListOf(1,2,3)
//    println(mutableList)
//    mutableList.add(4)
//    println(mutableList)
//    val immutableList: List<Int> = listOf(1,2,3)
//    immutableList.add(4) エラー
//    val greeterImpl = GreeterImpl()
//    greeterImpl.hello()
//    val androidPlatform = AndroidPlatform()
//    androidPlatform.showName()
//    val dog = Dog("犬")
//    dog.cries()
//    val animal = Animal("mochizuki")
//    animal.cries()
//    val human = Human("Takehata")
//    human.showName()
//    hoge3()
//    hoge2()
//    hoge()
//    whenExample2(10)
//    whenExample2(100)
//    whenExample2(1000)
//    whenExample(100)
//    whenExample(
//        200)
//    whenExample(300)
//    ifExample(10)
//    println(id)
//    println(countLength("こちらはほげ"))
}