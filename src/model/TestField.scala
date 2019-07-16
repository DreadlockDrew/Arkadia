package model

object TestField {

  def main(args: Array[String]): Unit = {
    val testChunk = new Chunk(0,0,10)
    testChunk.GenerateContents


    for(i <- 0 until testChunk.chunkSize)
      {
        for(j <-0 until testChunk.chunkSize)
          {
            print( testChunk.contents(i)(j).name + " | ")
          }
        println("")
      }


  }
}
