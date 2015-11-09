class Cryptor(input: String, index: Int){
  private val list = "abcdefghijklmnopqrstuvwxyz".toCharArray

  def encrypt {
    val cypheredOutput = input.collect { case c =>
      var temp = list.indexOf(c) + index
      list(temp)
    }

    println(s"Your new string is: $cypheredOutput")
  }

  def test {
    println("Test complete")
  }
}
