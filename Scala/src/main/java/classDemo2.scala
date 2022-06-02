object classDemo2 {
  def main(args: Array[String]): Unit = {


  }

  class Person(private[this] val name:String,private val age:Int)

  object Person{

    def printPerson = print(new Person("dzy",99))

    def printP(p:Person) = print(p.age)
  }

}
