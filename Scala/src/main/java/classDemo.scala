import classDemo.Generals.armNames

object classDemo {
  def main(args: Array[String]): Unit = {
    val general = new General
    general.toWar

  }

  object Generals{
    private val armNames = "Gun"
  }

  class Generals{
    def toWar = println(armNames)
  }

}