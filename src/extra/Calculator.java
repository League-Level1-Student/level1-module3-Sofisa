package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements ActionListener {
public static void main(String[] args) {
	Calculator calculator = new Calculator();
	calculator.makeButtons();
}
	JFrame window;
	JPanel panel;
	JTextField fieldone;
	JTextField fieldtwo;
	JButton add;
	JButton sub;
	JButton mul;
	JLabel label;
	JButton div;
public void makeButtons() {
	window = new JFrame();
	window.setVisible(true);
	panel = new JPanel();
	window.add(panel);
	window.setSize(1000, 400);
	window.setTitle("Simple Calculator");
	fieldone = new JTextField(10);
	panel.add(fieldone);
	fieldtwo = new JTextField(10);
	panel.add(fieldtwo);
	add = new JButton();
	add.setText("add");
	panel.add(add);
	sub = new JButton();
	sub.setText("sub");
	panel.add(sub);
	mul = new JButton();
	mul.setText("mul");
	panel.add(mul);
	div = new JButton();
	div.setText("div");
	panel.add(div);
	label = new JLabel();
	label.setText("0");
	panel.add(label);
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	window.pack();

}
	
void add() {
	int a = Integer.parseInt(fieldone.getText());
	int b = Integer.parseInt(fieldtwo.getText());
	int c = a+b;
	label.setText(c + "");
	
	
}
void sub() {
	int a = Integer.parseInt(fieldone.getText());
	int b = Integer.parseInt(fieldtwo.getText());
	int c = a-b;
	label.setText(c + "");
}
void mul(){

int a = Integer.parseInt(fieldone.getText());
int b = Integer.parseInt(fieldtwo.getText());
int c = a*b;
label.setText(c + "");
}
void div() {
	int a = Integer.parseInt(fieldone.getText());
	int b = Integer.parseInt(fieldtwo.getText());
	int c = a/b;
	label.setText(c + "");
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == sub) {
		sub();
	}
	if (e.getSource() == add) {
		add();
	}
	if (e.getSource() == mul) {
		mul();
	}
	if (e.getSource() == div) {
		div();
	}
	window.pack();
	
}

}
