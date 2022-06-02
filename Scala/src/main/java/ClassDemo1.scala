object ClassDemo1 {
  def main(args: Array[String]): Unit = {

    val p = Person("zs",9)

  }

  class Person(var name:String,var age:Int){
    println(name,age)
  }

  object Person{
    def apply(name:String,age:Int) = new Person(name,age)
  }

}






