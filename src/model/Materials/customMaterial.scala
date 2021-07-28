package model.Materials

class customMaterial (materialDef:String) extends Material{
  //All properties should be set by YieldProperties
  override val id: Int = -42
  override val name: String = "-CUSTOM PLACEHOLDER PLEASE DO NOT USE"
  override val passable: Boolean = false
  override val walkable: Boolean = false

  def YieldProperties(FilePath:String,Name:String): String = {"Stand In Value Incorrect"}//This could be altered

}
