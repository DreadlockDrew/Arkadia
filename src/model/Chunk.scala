package model

class Chunk(val xloc:Int,val yloc:Int,val chunkSize:Int){

  var contents:Array[Array[Tile]] = Array.ofDim(chunkSize,chunkSize)

  def GenerateContents: Unit ={
    for(i <- 0 until chunkSize ; j <- 0 until chunkSize)
      {
        if(i==0 || i == chunkSize-1 || j==0 || j==chunkSize-1)
          {contents(i)(j) = new UnobtainiumWall}
        else
        {contents(i)(j) = new UnobtainiumPath}
      }
  }
}
