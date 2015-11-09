import Cryptor

object CeasarCypher {

  def main(args: Array[String]) {
    val cryptor = new Cryptor(args(0), args(1))
    cryptor.encrypt
  }
}
