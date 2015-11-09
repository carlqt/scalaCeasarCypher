package cryptor

class Cryptor(input: String, index: Int){
  private val list = "abcdefghijklmnopqrstuvwxyz".toCharArray

  def encrypt {
    var temp: Int = 0
    val output = input.collect { case c =>
      temp = list.indexOf(c) + index
      list(newIndex(temp))
    }

    println(s"Your new string is: $output")
  }

  def test {
    println("Test complete")
  }

  private def newIndex(temp: Int): Int = {
    var i = temp

    if (temp < 26) {
      return temp
    }else {
      i = temp - 26
      newIndex(i)
    }
  }
}
