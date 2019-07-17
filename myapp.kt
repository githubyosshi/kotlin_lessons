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
fun sayHi(name: String = "taguchi", age: Int = 23) {
  println("hi! $name ($age)")
}
fun main(args: Array<String>) {
  sayHi("tom, 22")     // 引数
  sayHi("bob, 20")
  // sayHi()              // taguchi, 23
  sayHi(age = 19, name = "steve")

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

}