import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinUI implements ActionListener {
public static void main(String[] args) {
	PigLatinUI translator = new PigLatinUI();
	translator.makeButtons();
}
PigLatinTranslator translator = new PigLatinTranslator();
JTextField field;
JTextField text;
public void makeButtons() {
	JFrame window = new JFrame();
	window.setSize(400, 80);
	window.setVisible(true);
	JPanel panel = new JPanel();
	window.add(panel);
	text = new JTextField(10);
	panel.add(text);
	JButton translate = new JButton();
	translate.setText("translate");
	translate.addActionListener(this);
	panel.add(translate);
	field = new JTextField(10);
	panel.add(field);
	window.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String texts = text.getText();
	field.setText(translator.translate(texts));
}


}
