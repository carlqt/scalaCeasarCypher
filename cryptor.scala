package cryptor

class Cryptor(input: String, index: Int){
  private val list = "abcdefghijklmnopqrstuvwxyz".toCharArray

  def encrypt {
    var temp: Int = 0
    val cypheredOutput = input.collect { case c =>
      temp = list.indexOf(c) + index
      list(temp)
    }

    println(s"Your new string is: $cypheredOutput")
  }

  def test {
    println("Test complete")
  }
}
