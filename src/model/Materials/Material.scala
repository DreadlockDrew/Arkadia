package model.Materials

abstract class Material{

  val id: Int
  val name:String
  val passable:Boolean
  val walkable:Boolean
  /*
  val materialTrait:A
  /// Acoustical properties should be done per kg
  val acousticalAbsorption:Int
  val speedOfSound:Int
  val soundReflection:Int
  /// Atomic properties should be done per kg
  val atomicMass:Int
  val atomicNumber:Int
  val atomicWeight:Int
  ///Chemical properties
  val corrosionResitance:Int
  val pH:Float
  val reactivity:Int //TODO change this to something more dynamic?
  val surfaceTension:Int
  //TODO Electrical properties

  //TODO Magnetic Properties

  //Mechanical properties
  val durability:Int
  val brittleness:Int

  //TODO Optical properties
  //TODO Radiological properties
  //TODO Thermal properties

  */

}
