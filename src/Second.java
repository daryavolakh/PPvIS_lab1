import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Second {
	public JFrame frame = new JFrame();
	public Second(){
		frame.setTitle("Tack 2");
		frame.setSize(250,190);
		frame.setLayout(null);
		frame.setLocationByPlatform(true);
		
		JButton button1 = new JButton("first");
		JButton button2 = new JButton("second");
		JTextField input = new JTextField();
		
		input.setBounds(35,40,170,25);		
		button1.setBounds(35,75,80,25);		
		button2.setBounds(125,75,80,25);
		
		frame.add(input);
		frame.add(button1);
		frame.add(button2);	
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				button2.setText(input.getText());
				input.setText(null);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				String text = button1.getText();
				button1.setText(button2.getText());
				button2.setText(text);
				input.setText(null);
			}
		});
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		frame.setVisible(true);		
	}
	
	public void Close()
	{
		frame.dispose();
	}
}
