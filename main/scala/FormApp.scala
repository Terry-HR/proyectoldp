import scala.swing._
import scala.swing.event._

object FormApp extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "Formulario de contacto"

    // Campos del formulario
    val nameField = new TextField { columns = 25 }
    val emailField = new TextField { columns = 25 }
    val submitButton = new Button("Enviar")

    // Layout
    contents = new BoxPanel(Orientation.Vertical) {
      border = Swing.EmptyBorder(15, 15, 15, 15)
      contents += new Label("Nombre:")
      contents += nameField
      contents += Swing.VStrut(10)
      contents += new Label("Correo electrónico:")
      contents += emailField
      contents += Swing.VStrut(10)
      contents += submitButton
    }

    listenTo(submitButton)

    reactions += {
      case ButtonClicked(`submitButton`) =>
        val name = nameField.text.trim
        val email = emailField.text.trim

        if (name.isEmpty || email.isEmpty) {
          Dialog.showMessage(contents.head, "Por favor completa todos los campos.", title = "Error")
        } else {
          Dialog.showMessage(contents.head, s"Gracias, $name!\nTe contactaremos a: $email", title = "Formulario enviado")
        }
    }

    size = new Dimension(350, 250)
    centerOnScreen()
  }
}