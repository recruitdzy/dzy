import General.armNames

object General {

  private val armNames = "Gun"

  def main(args: Array[String]): Unit = {
    val general = new General
    general.toWar
  }

}
class General{
  def toWar = println(armNames)

}