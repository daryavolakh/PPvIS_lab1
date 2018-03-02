import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Third extends JFrame {
	public Third()
	{
		setTitle("Task 3");
		setLayout(null);
		setLocationByPlatform(true);
		setSize(250,190);
		
		JButton button = new JButton("start");
		JTextField input = new JTextField();
		JRadioButton radio_1 = new JRadioButton("one");
		JRadioButton radio_2 = new JRadioButton("two");
		JRadioButton radio_3 = new JRadioButton("three");
		ButtonGroup b_group = new ButtonGroup();
		
		b_group.add(radio_1);
		b_group.add(radio_2);
		b_group.add(radio_3);
		
		input.setBounds(35,40,170,25);		
		radio_1.setBounds(35,70,50,20);		
		radio_2.setBounds(95,70,50,20);		
		radio_3.setBounds(155,70,50,20);
		button.setBounds(85,95,70,25);		
		
		add(input);
		add(button);
		add(radio_1);
		add(radio_2);
		add(radio_3);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				for (Enumeration<AbstractButton> buttons = b_group.getElements(); buttons.hasMoreElements();)
				{
					AbstractButton temp_button = buttons.nextElement();
					if (temp_button.getText().equals(input.getText()))
					{	
						temp_button.setSelected(true);
					}
				}
				
			}
		});
		
	}
}
