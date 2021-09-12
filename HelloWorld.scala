object HelloWorld {

  def main (args :Array[String]) :Unit ={

    println("HelloWorld")

    var result = add(2,5)
    println("The addition of 2 and 5 using Add is "+ result)

    var result2 = addA(2,5)
    println("The addition of 2 and 5 using AddA is "+ result2)

    var result3 = addB(2,5)
    println("The addition of 2 and 5 using AddB is "+ result3)

    var result4 = addD(2,5)
    println("The addition of 2 and 5 using AddD is "+ result4)
  }


  def add (x:Int, y:Int): Int = {
    var z =  x + y
    return z
  }

  def addA (x:Int, y:Int): Int = {
    var z = x + y
    z
  }

  def addB (x:Int, y:Int) = {
    var z = x + y
    z
  }

  def Addc(x:Int, y:Int) = {
    var z = x+y
    z
  }

  def addD (x: Int, y:Int) = x + y
}
