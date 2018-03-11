import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Fourth {
	public Fourth() 
	{
		JFrame frame = new JFrame();
		
		frame.setTitle("Task 4");
		frame.setLayout(null);
		frame.setLocationByPlatform(true);
		frame.setSize(250,190);
		
		JButton button = new JButton("go!");
		JTextField input = new JTextField();
		JCheckBox checkbox1 = new JCheckBox("one"); 
		JCheckBox checkbox2 = new JCheckBox("two");
		JCheckBox checkbox3 = new JCheckBox("three");
		
		input.setBounds(35,40,170,25);		
		checkbox1.setBounds(35,70,50,20);		
		checkbox2.setBounds(95,70,50,20);		
		checkbox3.setBounds(155,70,50,20);
		button.setBounds(85,95,70,25);
		
		frame.add(button);
		frame.add(input);
		frame.add(checkbox1);
		frame.add(checkbox2);
		frame.add(checkbox3);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				if (checkbox1.getText().equals(input.getText()))  //второй клик - убрать галочку
					{
					if (checkbox1.isSelected() == true)
						checkbox1.setSelected(false);
					else 
						checkbox1.setSelected(true);
					}
				
				else if (checkbox2.getText().equals(input.getText()))
					{
					if (checkbox2.isSelected() == true)
						checkbox2.setSelected(false);
					else
						checkbox2.setSelected(true);
					}
				
				else if (checkbox3.getText().equals(input.getText()))
					{
					if (checkbox3.isSelected() == true)
						checkbox3.setSelected(false);
					else
						checkbox3.setSelected(true);
					}
					
				else 
				{
					JOptionPane.showMessageDialog(null, "This item doesn't exist");
				}
				input.setText(null);
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
	}
}
