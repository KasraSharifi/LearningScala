class Car {
  var topClassExtraCost = 0
  private var roadTax = 100
  def cost(basicCost : Int) = basicCost + topClassExtraCost + roadTax
  def checkTax() = {
    roadTax = 10
    roadTax
  }
}
object DemoClassObject {
  def main(args: Array[String]): Unit = {
    println("Hello abc")

    var bmw = new Car
    bmw.topClassExtraCost = 500
    var result = bmw.cost(basicCost = 10000)
    var result2 = bmw.cost(basicCost = 10000)
    println("Total cost of the car is " + result2)
    println("Total cost of the car is " + result)
//    println("The value of Road Tax is " + bmw.checkTax())
    var result3 = bmw.cost(basicCost = 10000)
    println("Total cost of the car is " + result3)
  }



}
