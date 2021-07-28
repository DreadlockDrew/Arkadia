package model.Materials

object Water extends Material{
  override val id: Int = 200
  override val name: String = "Water"
  override val passable: Boolean = true
  override val walkable: Boolean = false
}
