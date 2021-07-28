package model.Enviro
import model.Items.Item

import scala.collection.mutable
class Tile(material: model.Materials.Material) {
  val contents:List[Item] = List()//Replace with primitive LinkedList for O(1) insert/remove + cheaper assumed memory allocation
  val id:Int=material.id
  val walkable:Boolean = material.passable//can an organic(landBipedal) traverse over it.
  val passable:Boolean = material.passable

  def updateNeighbors[T<:Tile](targets:List[T]):Unit =
  {
  }
  def updateContents[I<:Item](contents: List[I]):Unit=
  {
  }
}
