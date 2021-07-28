package model.Materials

object Copper extends Material{
  override val id: Int = 29
  override val name: String = "Copper"
  override val passable: Boolean = true
  override val walkable: Boolean = true
}
