package model.Enviro

import play.api.libs.json.{JsValue, Json}

import scala.collection.immutable.Map
//Chunks have their origin at the TOPLEFT most tile
class worldMap(val chunkSize:Int, val mapSize: Int)
{
  def gameState: JsValue =
    {

      val outPut: Map[String, JsValue]=
      {
      Map("worldData" -> Json.toJson(this.chunks.map(x => Json.toJson(x.map
      (y => Json.toJson(y.gameState()))))))
      }
      return Json.toJson(outPut)

    }
  var chunkLoaders:Array[(Int,Int)]=Array.empty
  val orthoChunkCount = mapSize/chunkSize //The Total Number of chunks a world should contain
  var chunks:Array[Array[Chunk]] = Array.ofDim(chunkSize,chunkSize)//The currently loaded chunks
  if (chunkSize <= 4) {throw new RuntimeException("Chunk size too small")}
  if (mapSize < chunkSize) {throw new RuntimeException("Chunk size cannot be smaller then mapSize")}
  if (mapSize % chunkSize != 0) {throw new RuntimeException("mapSize must be divisible by chunkSize")}


  def GenerateNeighborLookUp(chunk: Chunk):Predef.Map[String, (Int,Int)]=
  { val xloc=chunk.xloc
    val yloc=chunk.yloc
    val neighbors:Map[String, (Int,Int)]=
      Map(
        "west"->(xloc-chunkSize,yloc),
        "east"->(xloc+chunkSize,yloc),
        "north"->(xloc,yloc+chunkSize),
        "south"->(xloc,yloc-chunkSize),
        "northwest"->(xloc-chunkSize,yloc+chunkSize),
        "northeast"->(xloc+chunkSize,yloc+chunkSize),
        "southwest"->(xloc-chunkSize,yloc-chunkSize),
        "southeast"->(xloc+chunkSize,yloc-chunkSize)
        )

    neighbors
  }


  def GenerateChunks: Unit = {
    {
      for(x <- 0 until orthoChunkCount ; y <- 0 until orthoChunkCount)
      {
        chunks(x)(y)= new Chunk(x,y,chunkSize)

      }
    }
  }
  /*Generates all of the chunks on the map does not populate or fill them with anything
  populateChunks should be called afterwords
  */

  def populateChunks: Unit=
  {
    for(x <- 0 until orthoChunkCount ; y <- 0 until orthoChunkCount)
    {chunks(x)(y).GenerateContents}
  }

  def locateChunk(x:Int,y:Int):(Int, Int)={(x/chunkSize,y/chunkSize)}
  /*returns a 2Tuple of the origin of the chunk were the x and y would be located
 regardless of if the chunk physically exists or not
   */
  def loadChunkFrom_PS(originCords:(Int,Int),filePath:String):String={""}
  def saveChunkTo_PS(chunk: Chunk,filePath:String):Unit={}

  def alterChunk(cords:(Int,Int),Command:String):Unit={}
  def updateChunkLoaders():Unit={}
  def addChunkLoader(cords:(Int,Int)):Unit={}//add the chunk
  def removeChunkLoader(cords:(Int,Int))={}


}
