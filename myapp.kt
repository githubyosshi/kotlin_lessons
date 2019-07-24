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
// class AdminUser(name: String): User(name) {
//    fun sayHello() {
//       println("hello $name")  // error
//    }
//   override fun sayHi() {
//       println("[admin] hi $name")   // error
//   }
// }
/* open class User(public var name: String) { */
/* open class User(protected var name: String) { */
// open class User(private var name: String) {
//     open fun sayHi() {
//         println("hi $name")
//    }
// }
// fun main(args: Array<String>) {
//    val bob = AdminUser("bob")
//    println(bob.name)     // error
//    bob.sayHello()
//    bob.sayHi()
// }

// 拡張
// fun User.sayHello() {
//   println("hello $name")
// }
// fun User.sayHi() {
//   println("[ext] hi $name")
// }
// val User.myName: String
//   get() = "I am $name"
// class User(var name: String) {
//   fun sayHi() {
//       println("hi $name")
//   }
// }
// fun main(args: Array<String>) {
//   val tom = User("tom")
//    tom.sayHello()    // hello tom
//    tom.sayHi()    // hi tom
//    println(tom.myName)    // i am tom
// }

// 抽象クラス -> 具象クラス
// user -> Japanese American
// abstract class User {
//     abstract fun sayHi()
// }
// class Japanese: User() {
//     override fun sayHi() {
//          println("こんにちは！")
//   }
// }
// class American: User() {
//    override fun sayHi() {
//        println("Hi!")
//    }
// }
// fun main(args: Array<String>) {
//    val tom = American()
//    val aki = Japanese()
//    tom.sayHi()
//    aki.sayHi()
// }

// Interface
// interface Sharable {
    //  抽象プロパティ
    // val version: Double
    //  抽象メソッド
    // fun share()
    //  メソッド
//    fun getInfo() {
//        println("Share I/F ($version)")
//   }
// }
// class User: Sharable {
//   override val version = 1.1
//   override fun share() {
//      println("Sharing...")
//   }
// }
// fun main(args: Array<String>) {
//     val user = User()
//     user.share()
//     user.getInfo()
// }

// generics
/*class MyInteger {
  fun getThree(x: Int) {
      println(x)
      println(x)
      println(x)
  }
}*/
// class MyData<T> {
//    fun getThree(x: T) {
//        println(x)
//        println(x)
//        println(x)
//    }
// }
// fun main(args: Array<String>) {
   /*val mi = MyInteger()
   mi.getThree(55)*/
  //  val i = MyData<Int>()
  //  i.getThree(32)
  //  val s = MyData<String>()
  //  s.getThree("hello")
// }

// data class
// data class Point(val x: Int, val y: Int)
// fun main(args: Array<String>) {
//   val p1 = Point(3, 5)
//   val p2 = p1.copy()
//   /*val p2 = Point(3, 5)*/
//   println(p1)
//   println(if (p1 == p2) "same" else "not same")
//   val (x, y) = p1
//   println("$x:$y")
// }

// Collection
/*
- List (Immutable変更されない/Mutable変更可) 順番を持つデータ
- Set (Immutable/Mutable) ランダムで重複が無い
- Map (Immutable/Mutable) キーと値で管理
*/
// fun main(args: Array<String>) {
    /*val sales: List<Int> = listOf(20, 30 ,40)*/      // 変数<型>
   /*val sales = ListOf(20, 30 ,40)*/
//    val sales = mutableListOf(20, 30, 40)
//    println(sales[1])  //  0番目、１番目の30が表示
//    sales[1] = 50
//    println(sales.size)  // 3（個数）
//    for (sale in sales) {
//        println(sale)
//    }
// }

// Collection
/*
- List (Immutable/Mutable)
- Set (Immutable/Mutable)
- Map (Immutable/Mutable)
*/
// fun main(args: Array<String>) {
  /*val answers: Set<Int> = setOf(5, 3, 8, 5)*/
  /*val answers = setOf(5, 3, 8, 5)*/   // 型推論
  // val answers = mutableSetOf(5, 3, 8, 5)
  // answers.add(15)
  // answers.remove(3)
  // println(answers)   // 全ての要素を確認
  /*println(answers.contains(3))   // ３が含まれているのでtrue*/
  /*val set1 = setOf(1, 3, 5, 8)
  val set2 = setOf(3, 5, 8, 9) 
  println(set1.intersect(set2))         // 積集合
  println(set1.union(set2))              //  和集合
  println(set1.subtract(set2))*/         // 差集合
// }

// Collection
/*
- List (Immutable/Mutable)
- Set (Immutable/Mutable)
- Map (Immutable/Mutable)
*/
// fun main(args: Array<String>) {
   /*val users: Map<String, Int> = map0f("taguchi" to 40,"fkoji " to 80, "dot install" to 60)   */       // <キーと値の型>
  /*val users = mapOf("taguchi" to 40, "fkoji" to 80, "dot install" to 60)*/
  // val users = mutableMapOf("taguchi" to 40, "fkoji" to 80, "dotinstall" to 60)
  /*println(users["taguchi"])    // 40*/
  // users["taguchi"] = 55
  /*println(users.size)  // 要素数3
  println(users.keys)           //キーだけ取り出し
  println(users.values)*/      //値だけ取り出し
  // println(users.entries)        //全て取り出し
// }

// fun main(args: Array<String>) {
//    val prices = listOf(53.2, 48.2, 32.8)
//    prices
       /*.map { n -> n * 1.08 }     //  引数 → 処理*/
      //  .map { it * 1.08 }                //   引数が一つの場合はit暗黙の引数が使える
       /*.filter { n -> n > 50 } */
  //      .filter { it > 50 }
  //      .forEach { println(it) }        // 表示
  //  }

// 例外処理
class MyException(message: String): Throwable(message)
fun div(a: Int, b: Int) {
   try {
      if (b < 0) {
        throw MyException("not minus!")
      }
      println(a / b)
  } catch (e: ArithmeticException) {
    println(e.message)
  } catch (e: MyException) {
    println(e.message)
  } finally {
    println(" -- end -- ")
  }
}
fun main(args: Array<String>) {
   div(3, 0)
   div(3, -3)
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