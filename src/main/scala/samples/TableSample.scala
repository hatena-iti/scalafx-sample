package samples

/*
* Copyright 2013 Intelligent Technology Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import scalafx.application.JFXApp
import scalafx.scene.control.{TableColumn, TableView}
import scalafx.scene.layout.{VBox, Priority}
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.beans.property.{ObjectProperty, StringProperty}
import scalafx.collections.ObservableBuffer

/**
 * Created with IntelliJ IDEA.
 * User: sakura
 * Date: 2013/10/21
 * Time: 18:11
 */
object TableSample extends JFXApp {

  // 列の定義
  val idColumn = new TableColumn[Record, Int]("id") {
    cellValueFactory = f => new ObjectProperty[Int](f.value, "id", f.value.id)
    prefWidth = 80
  }
  val name = new TableColumn[Record, String]("name") {
    cellValueFactory = f => new StringProperty(f.value, "name", f.value.name)
    prefWidth = 100
  }
  val guest = new TableColumn[Record, Boolean]("guest") {
    cellValueFactory = f => new ObjectProperty[Boolean](f.value, "guest", f.value.guest)
  }

  stage = new JFXApp.PrimaryStage {
    title = "Hello ScalaFX TableView"
    scene = new Scene {
      fill = Color.LIGHTBLUE
      root = new VBox {
        hgrow = Priority.ALWAYS
        content = new TableView[Record] {
          vgrow = Priority.ALWAYS
          columns ++= Seq(idColumn, name, guest)

          items = ObservableBuffer(
            Record(1, "name1", guest = true),
            Record(2, "name2", guest = true),
            Record(3, "name3"),
            Record(4, "name4")
          )
        }
      }
    }
  }
}

case class Record(id: Int, name: String, guest: Boolean = false)
