package model
import model.Enviro._

object Main {

  def main(args: Array[String]):Unit = {
  {
    println("Starting...")
    var testingCords:(Int,Int) = (5,5)

    val worldMap = new worldMap(10,100)
    worldMap.GenerateChunks
    //worldMap.populateChunks
    //print(worldMap.chunks(0)(0).gameState())
    print(worldMap.gameState)
  }
  }
  def yieldInstructions(FileName:String):Unit={}
}
