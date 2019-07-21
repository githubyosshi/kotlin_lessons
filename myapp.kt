// comento
/* comento
coment
 */
// fun main(args: Array<String>) {
//   println("Hello World")
// }

// 関数
// fun sayHi() {
//  println("hi!")
// }
// fun main(args: Array<String>) {
//   sayHi()
// fun sayHi(name: String = "taguchi", age: Int = 23) {
//   println("hi! $name ($age)")
// }
// fun main(args: Array<String>) {
//   sayHi("tom, 22")     // 引数
//   sayHi("bob, 20")
//   // sayHi()              // taguchi, 23
//   sayHi(age = 19, name = "steve")

// fun sayHi():  Unit (     // 何もない時に型で省略可能
// println("hi")
// }
// fun sayHi(): String {           // 型を指定
//   return "hi!"               // 値を返す
// }
// fun sayHi(): String = "hi!"
// fun sayHi() = "hi!"            // 自明なので型推論で省略可能

// fun main(args: Array<String>) {
//   val msg = sayHi()
//   println(msg)
// }

// Class
// - data: property
// - fun: method
// class User {
//   var name = "Me!"
//   fun sayHi() {
//       /*println("hi ${this.name}")*/
//       println("hi $name")
//   }
// }
// fun main(args: Array<String>) {
   /* val user: User = User() */
//    val user = User()      //  クラスのインスタンス　型推論記法
//    println(user.name)
//    user.sayHi()
//    user.name = "Me Me!"
//    println(user.name)
//    user.sayHi()
// }

// class User(var name: String) {  // コントランス引数
   /*var name = name*/
//   var team = "red"
//   init {
//      println("instance created, name: $name, team: $team")
//   }
//  fun sayHi() {
//    println("hi $name")
//   }
// }
// fun main(args: Array<String>) {
//    val tom = User("tom")
//    println(tom.name)
//    tom.sayHi()
//    val bob = User("bob")
//    println(bob.name)
//    bob.sayHi()
// }

//  プロパティのgetter,setter
// class User(var name: String) {
//    var team = "red"
        // getter
        /*get() {
           return field.toUpperCase()      // 大文字で返す
        }*/
        // get() = field.toUpperCase()
        // setter
  //     set(value) {
  //        if (value != "") {
  //           field = value
  //        }
  //     }
  //  fun sayHi() {
  //      println("hi $name")
  //    }
  //  }
  // fun main(args: Array<String>) {
  //     val tom = User("tom")
  //     println(tom.team)  //  RED
  //     tom.team = "blue"
  //     println(tom.team)  //BLUE
  //     tom.team = ""
  //     println(tom.team)   //BLUE
  // }

// 継承
// User親クラスまたはスーパークラス -> AdminiUser子クラスまたはサブクラス
// class AdminUser(name: String): User(name) {
//   fun sayHello() {
//     println("Hello $name")
//   }
//   override fun sayHi() {       //親クラスの値を上書き
//     println("hi $name")
//   }
// }
// open class User(var name: String) {
//    open fun sayHi() {            // 上書き許可
//        println("[admin] hi $name")
//    }
// }
// fun main(args: Array<String>) {
//    val bob = AdminUser("bob")
//   println(bob.name)
//   bob.sayHello()   // hello
//   bob.sayHi()        // [admin] hi bob
// }

// アクセス修飾子
// - public どこからでも
// - protected そのクラス＋サブクラス
// - private そのクラス
class AdminUser(name: String): User(name) {
   fun sayHello() {
      println("hello $name")  // error
   }
  override fun sayHi() {
      println("[admin] hi $name")   // error
  }
}
/* open class User(public var name: String) { */
/* open class User(protected var name: String) { */
open class User(private var name: String) {
    open fun sayHi() {
        println("hi $name")
   }
}
fun main(args: Array<String>) {
   val bob = AdminUser("bob")
   println(bob.name)     // error
   bob.sayHello()
   bob.sayHi()
}
// 変数
// - val  再代入できない
// - var  再代入できる
  // val msg: String = "Hello World"
  // val msg = "Hello World" // 型推論
  // var msg = "Hello World"
  // println(msg)
  // msg = "Hello Word 2"
  // println(msg)

  // String, Char
  // val msg: String = "Hello World"
  // val c: Char = 'a'

  // Byte, Short, Int, Long
  // val i: Int = 100
  // val i: Long = 5555555555555L

  // Float, Double
  // val d: Double = 234.523
  // val f: Float = 12.344F

  // Boolean (true / false)
  // val flag: Boolean = true

  // + - * / %
// val x = 10
// println(x / 3)    // 3
// println(x / 3.0)  // 3.333....
// println(x % 3)    // 1

// ++ --
// var y = 5
// y++
// println(y)     // 6
// y--
// println(y)     // 5

// var z = 4
// z = z + 12
// println(z)
// z += 12
// println(z)

// AND OR NOT
// && || !
// val flag = true
// println(!flag)  // false

// println("hello " + "world")
// val name = "taguchi"
// println("my name is $name")
// println("my score is ${12 + 32}")
// //   \n: 改行
// //   \t:  タブ
// println("hello\n  wor\tld")

// val score = 85
// > >= < <= == !=
// if (score > 85) {
// println("Great!")
// } else if (score > 60) {
// println("Good!")
// } else {
// println("so so ...")
// }

// val result = if (score > 80) "Great" else "so so ..."
// println(result)

// val num = 3
// when (num) {
//    0 -> println("Zero")
//    1 -> println("One")
//    2, 3  ->  println("Two or Tree")
//    in 4..10 -> println("Many")
//   else -> println("other")
// }
// val num = 5
// val result = when (num) {
//   0 -> "Zero"
//   1 -> "One"
//   2, 3 -> "Two or Tree"
//   in 4..10 -> "Many"
//  else -> "other"
// }
//  println(result)

// while
// 0..9
// var i = 0
// while (i < 10) {
//   println("loop: $i")t 1

//   i++
// }
// var i = 100           //  whileは実行されず、doが一度だけ実行され100が表示
// while (i < 10) {
//   println("loop: $i")
//   i++
// }
// do {
//   println("loop2: $i")
//   i++
// } while (i < 10)

// for (変数 in データの集合) 処理
// for (i in 0..9) {
//    println(i)
// }
// break  ループを抜ける
// for (i in 0..9) {
//   if (i == 5) break
//   println(i)
// }
// continue   それ以降は実行せず、次のループへ移る
// for (i in 0..9) {
//   if (i == 5) continue     // 5は表示されない
//   println(i)
//   }