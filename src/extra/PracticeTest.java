package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
	String answer = "stamp";
	public static void main(String[] args) {
		PracticeTest test = new PracticeTest();
		test.MakeButtons();
		test.MakingStuff();	
	}
	
	JFrame frame;
	JLabel label;
	JTextField field;
	JPanel panel;
	JButton submit;
	JButton hint;
	
	public void MakeButtons() {
	frame = new JFrame();	
	label = new JLabel();
	field = new JTextField(10);
	panel = new JPanel();
	submit = new JButton();
	hint = new JButton();
	submit.addActionListener(this);
	hint.addActionListener(this);
	
		
	}
	public void MakingStuff() {
		frame.setVisible(true);
		frame.setSize(700, 400);
		frame.add(panel);
		panel.add(label);
		label.setText("What can go around the world but stay in a corner");
		panel.add(field);
		submit.setText("submit answer");
		panel.add(submit);
		hint.setText("hint");
		panel.add(hint);
		
		
	
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == submit) {
			if(field.getText().equals(answer)) {
				JOptionPane.showMessageDialog(null, "correct");
				
			}else {
				JOptionPane.showMessageDialog(null, "incorrect");
			}
		}
	
		if(e.getSource() == hint) {
			JOptionPane.showMessageDialog(null, "You use it when mailing letters");
		}
}
}




