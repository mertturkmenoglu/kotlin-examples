package gui.tornadofx.e002_Login

import javafx.geometry.Orientation
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import tornadofx.*

class LoginView : View("Login") {
    var uname: TextField by singleAssign()
    var pswd: PasswordField by singleAssign()

    override val root = form {
        fieldset(title, labelPosition = Orientation.VERTICAL) {
            field("Username") {
                uname = textfield()
            }

            field("Password") {
                pswd = passwordfield()
            }

            button("Login") {
                action {
                    println("Logged in: ${uname.text}- ${pswd.text}")
                }
            }

        }
    }
}