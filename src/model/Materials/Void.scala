package model.Materials

object Void extends Material{
  override val id: Int = 0
  override val name: String = "Void"
  override val passable: Boolean = false
  override val walkable: Boolean = false
}
