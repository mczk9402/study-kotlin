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

// if文を式にする
fun printOddOrEvenNumberText(num: Int) {
    var text = ""
    if(num % 2 == 1) {
        text = "奇数"
    } else {
        text = "偶数"
    }

    println(text);
}

fun printOddOrEvenNumberText2(num: Int) {
    val text = if (num % 2 == 1) {
        "奇数"
    } else {
        "偶数"
    }

    println(text)
}

fun printOddOrEventNumberText3(num: Int) {
    val text = if(num % 2 == 1) "奇数" else "偶数"
    println(text)
}

fun printOddOrEvenNumberText4(num: Int) {
    val text = when(num) {
        100 -> {
            "Equal to 100"
        }
        200 -> {
            "Equal to 200"
        }
        else -> {
            "Undefined value"
        }
    }

    println(text)
}

//class User1 {
//    var name: String = ""
//
//    fun getName(): String {
//        return this.name
//    }
//
//    fun setName(name: String) {
//        this.name = name
//    }
//}
//
//class User2(id: Int) {
//    val id: Int = id
//    // valで定義したものは後から変更できない
//    var name: String = ""
//}
//
//class User3 {
//    // 遅延初期化tら　後から書き換える varのみ
//    lateinit var name: String
//}

//class User4 {
//    lateinit var name: String
//    val isValidName: Boolean
//    get() = name != ""
//}

//class User5 {
//    var name: String = ""
//    var hoge: String = ""
//
//    set(value) {
//        if (value == "") {
//            field = "Kotlin"
//        } else {
//            field = value
//        }
//    }
//
//    val isValidName: Boolean
//    get() = hoge != ""
//}

class User6 {
    val id: Int = 1
    val name = "Kotlin"

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as User6

        if(id != other.id) return false
        if(name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return 31 * name.hashCode() + id
    }

    override fun toString(): String {
        return "User6(id=$id,name=$name)"
    }
}



fun main() {

    data class User9(val id: Int, val name: String = "default Name", val age: Int)


    val user = User9(id = 1, age = 30)
    println(user.toString())

//    data class User8(val id: Int, val name:String = "Default Name")
//
//    val user = User8(1)
//    println(user.toString())

//    fun printUserInfo (id: Int, name: String = "Default Name") {
//        println("id=$id name=$name")
//    }
//
//    printUserInfo(1,"mochizuki")

//    data class User7(val id: Int, var name: String) {
//        val isValidName: Boolean
//        get() = name != ""
//    }
//
//    val user = User7(1, "mochizuki")
//    // toString クラス名(プロパティ名=値,...)
//    println(user.toString())
//    // componentN  順番を指定してプロパティの値を取得する
//    println(user.component2())
//    // copy関数
//    val update = user.copy(1, "kotlin")
//    println(update)

//    val user = User7(1, "mochizuki")
//    val same = User7(1, "mochizuki")
//    val other = User7(2, "mochizuki")
//    println("user=${user.hashCode()}")
//    println("same=${same.hashCode()}")
//    println("other=${other.hashCode()}")
//    val set = hashSetOf(user)
//    println(set.contains(same))
//    println(user == same)

//    val userA = User6()
//    val userB = User6()

//    println(userA == userB)
//    println(userB)
//    var user = User5()
//    user.hoge = ""
//    println(user.hoge)
//    user.hoge = "mochizuki"
//    println(user.hoge)
//    println(user.isValidName)
//    val user = User4()
//    user.name = "mochizuki"
//    println(user.isValidName)
//    val user = user3()
//    println(user.name)
//    val user = User2(1)
//    user.name = "mochizuki"
//    user.id = 2
//    val user = User1()
//    user.name = "mochizuki"
//    println(user.name)
// printOddOrEvenNumberText(2)
//    printOddOrEvenNumberText2(2)
//    printOddOrEventNumberText3(1)
//    printOddOrEvenNumberText4(300)
// コレクション
// Set
//    val set: Set<String> = setOf("one","two","three")
//    println(set.contains("for"))
//    val mutableSet:MutableSet<String> = mutableSetOf("one","two","three")
//    mutableSet.add("for")
//    println(mutableSet)

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