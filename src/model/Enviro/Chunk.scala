package model.Enviro
import model.Materials

import scala.collection.immutable.Map
import play.api.libs.json.{JsValue, Json}
class Chunk(val xloc:Int,val yloc:Int,val chunkSize:Int)
{

  var isActive:Boolean=false
  var contents:Array[Array[Tile]] = null

  def GenerateContents: Unit = {
  { isActive=true
    contents = Array.ofDim(chunkSize,chunkSize)
    for(i <- 0 until chunkSize ; j <- 0 until chunkSize)
      {
        if(i==0 || i == chunkSize-1 || j==0 || j==chunkSize-1)
          {contents(i)(j) = new Tile(Materials.Copper)}
        else
          {contents(i)(j) = new Tile(Materials.Dirt)}
      }
  }
  def DestroyContents: Unit ={
    contents=null
    isActive=false
  }
  }

  def gameState():String =
  {
    var outPut: Map[String, JsValue]= Map.empty
    if (isActive==true)
    {
      outPut =
        Map(
          "chunkDims" -> Json.toJson(Map("x" -> this.xloc, "y" -> this.yloc, "chunkSize" -> this.chunkSize))
          , "tiles" -> Json.toJson(this.contents.map(i => Json.toJson(i.map(j => Json.toJson((j.id))))))
        )
    }
    else{outPut=Map.empty}
    return Json.stringify(Json.toJson(outPut))
  }


}
