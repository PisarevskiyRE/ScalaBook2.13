import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.JButton

val button = new JButton

//button.addActionListener(
//  new ActionListener {
//     def actionPerformed(e: ActionEvent): Unit = println("pressed!")
//  }
//)


implicit def functino2ActionListener(f: ActionEvent => Unit): ActionListener =
  new ActionListener {
    def actionPerformed(e: ActionEvent): Unit = f(e)
  }

button.addActionListener(
  functino2ActionListener(
    (_: ActionEvent) => println("pressed!")
  )
)

button.addActionListener(
  (_: ActionEvent) => println("pressed!")
)


implicit def doubleToInt(x: Double) = x.toInt

val i: Int = 3.5



//      -Xprint:typer