package model.Materials

object Dirt extends Material{
  override val id: Int = 199
  override val name: String = "Dirt"
  override val passable: Boolean = true
  override val walkable: Boolean = true
}
