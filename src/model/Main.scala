package model
import model.Enviro._

object Main {

  def main(args: Array[String]):Unit = {
  {
    println("Starting...")
    var testingCords:(Int,Int) = (98,98)

    val worldMap = new worldMap(10,1000)
    worldMap.GenerateChunks
    //worldMap.populateChunks
    //print(worldMap.chunks(0)(0).gameState())
    //print(worldMap.gameState)
    worldMap.locateChunk(testingCords)
  }
  }
  def yieldInstructions(FileName:String):Unit={}
}
