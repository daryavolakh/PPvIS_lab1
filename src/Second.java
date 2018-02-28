import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Second extends JFrame {
	public Second(){
		setTitle("Tack 2");
		setSize(250,190);
		setLayout(null);
		setLocationByPlatform(true);
		
		JButton button_1 = new JButton("first");
		JButton button_2 = new JButton("second");
		JTextField input = new JTextField();
		
		input.setBounds(35,40,170,25);
		add(input);
		button_1.setBounds(35,75,80,25);
		add(button_1);
		button_2.setBounds(125,75,80,25);
		add(button_2);	
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				button_2.setText(input.getText());
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				String text = button_1.getText();
				button_1.setText(button_2.getText());
				button_2.setText(text);
			}
		});
		
	}
}
