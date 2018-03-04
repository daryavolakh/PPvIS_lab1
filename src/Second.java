import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Second extends JFrame {
	public Second(){
		//JFrame f = new JFrame();
		setTitle("Tack 2");
		setSize(250,190);
		setLayout(null);
		setLocationByPlatform(true);
		
		JButton button_1 = new JButton("first");
		JButton button_2 = new JButton("second");
		JTextField input = new JTextField();
		
		input.setBounds(35,40,170,25);		
		button_1.setBounds(35,75,80,25);		
		button_2.setBounds(125,75,80,25);
		
		add(input);
		add(button_1);
		add(button_2);	
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				button_2.setText(input.getText());
				input.setText(null);
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				String text = button_1.getText();
				button_1.setText(button_2.getText());
				button_2.setText(text);
				input.setText(null);
			}
		});
		
	}
}
