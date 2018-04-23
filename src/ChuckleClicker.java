
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	ChuckleClicker game = new ChuckleClicker();
	game.makeButtons();
	
}
JButton joke;
JButton punchline;
JTextField fieldone;
public void makeButtons(){
	joke = new JButton();
	joke.setText("joke");
	joke.addActionListener(this);
	JButton punchline = new JButton();
	punchline.setText("punchline");
	punchline.addActionListener(this);
	JFrame window = new JFrame();
	window.setVisible(true);
	window.setSize(250, 75);
	JPanel panel = new JPanel();
	window.add(panel);
	panel.add(joke);
	panel.add(punchline);

	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "Why was the baby strawberry crying?");
	}else {
		JOptionPane.showMessageDialog(null, "Because his mom and dad were in a jam");
	}

}

}
