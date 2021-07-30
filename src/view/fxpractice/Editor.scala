package view.fxpractice

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{Menu, MenuBar, MenuItem, SeparatorMenuItem}
import scalafx.scene.layout.BorderPane

object Editor extends JFXApp{
  stage= new JFXApp.PrimaryStage{
    title="Editor"
    scene= new Scene(1000,1000)
    val menuBar=new MenuBar()
    val fileMenu = new Menu("File")
        val newItem = new MenuItem("New")
        val openItem = new MenuItem("Open")
        val saveItem = new MenuItem("Save")
        val exitMenu = new MenuItem("Exit")
    fileMenu.items=List(newItem,openItem,saveItem,new SeparatorMenuItem(),exitMenu)
    val editMenu=new Menu()
        val copyItem = new MenuItem("copy")
        val cutItem = new MenuItem("cut")
        val pasteItem = new MenuItem("paste")
     editMenu.items=List(copyItem,cutItem,pasteItem)

    val rootPane= new BorderPane
    rootPane.
    //menuBar.menus= List(fileMenu,editMenu)


  }

}
