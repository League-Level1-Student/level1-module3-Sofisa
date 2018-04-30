import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
public static void main(String[] args) {
	TypingTutor game = new TypingTutor();
	game.MakeButtons();

		
	}


JFrame window; 
char currentLetter;
JLabel value;
JPanel panel;

public void MakeButtons() {
	window = new JFrame();
	window.setSize(800,400);
	window.setVisible(true);
	window.setTitle("Type or Die");
	value = new JLabel();
	panel = new JPanel();
	window.addKeyListener(this);
	window.add(panel);
	panel.add(value);
	currentLetter = generateRandomLetter();
	value.setText("" + currentLetter);
	value.setFont(value.getFont().deriveFont(28.0f));
	value.setHorizontalAlignment(JLabel.CENTER);
	
	}



char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	currentLetter = generateRandomLetter();
	if (e.getKeyChar() == currentLetter) {
		window.setBackground(new Color(255,218,185));
	}else {
		window.setBackground(new Color(188,143,143));
	}
	value.setText("" + currentLetter);
	
}



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}