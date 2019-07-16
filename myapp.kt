// comento
/* comento
coment
 */
// fun main(args: Array<String>) {
//   println("Hello World")
// }

// 変数
// - val  再代入できない
// - var  再代入できる
fun main(args: Array<String>) {
  // val msg: String = "Hello World"
  // val msg = "Hello World" // 型推論
  var msg = "Hello World"
  println(msg)
  msg = "Hello Word 2"
  println(msg)
}