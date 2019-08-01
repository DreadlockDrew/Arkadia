package model

object TestField {

  def ProtoGenerateContents(chunk: Chunk): Unit ={
    for(row <- 0 until chunk.chunkSize ; column <- 0 until chunk.chunkSize)
    {
      if(row==0 || row == chunk.chunkSize-1 || column==0 || column==chunk.chunkSize-1)
      {chunk.contents(row)(column) = new UnobtainiumWall}
      else
      {chunk.contents(row)(column) = new UnobtainiumPath}
    }
  }

  def ProtoPrintChunkContents(specification:String,chunk: Chunk): Unit =
  {
   if ( specification == "name")
     {    for(i <- 0 until chunk.chunkSize)
     {
       for(j <-0 until chunk.chunkSize)
       {
         print( chunk.contents(i)(j).name + " | ")
       }
       println("")
     }}

  }

  def main(args: Array[String]): Unit = {
    val testChunk = new Chunk(0,0,10)

    ProtoGenerateContents(testChunk)
    ProtoPrintChunkContents("name",testChunk)




  }
}
