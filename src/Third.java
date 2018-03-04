import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Third extends JFrame{
	public Third()
	{
		//JFrame frame = new JFrame();
		
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); */
		
		setTitle("Task 3");
		setLayout(null);
		setLocationByPlatform(true);
		setSize(250,190);
		
		JButton button = new JButton("start");
		JTextField input = new JTextField();
		JRadioButton radio1 = new JRadioButton("one");
		JRadioButton radio2 = new JRadioButton("two");
		JRadioButton radio3 = new JRadioButton("three");
		ButtonGroup bgroup = new ButtonGroup();
		
		bgroup.add(radio1);
		bgroup.add(radio2);
		bgroup.add(radio3);
		
		input.setBounds(35,40,170,25);		
		radio1.setBounds(35,70,50,20);		
		radio2.setBounds(95,70,50,20);		
		radio3.setBounds(155,70,50,20);
		button.setBounds(85,95,70,25);		
		
		add(input);
		add(button);
		add(radio1);
		add(radio2);
		add(radio3);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				if (radio1.getText().equals(input.getText()))
					radio1.setSelected(true);
			
			else if (radio2.getText().equals(input.getText()))
				radio2.setSelected(true);
			
			else if (radio3.getText().equals(input.getText()))
				radio3.setSelected(true);
				
			else 
			{
				JOptionPane.showMessageDialog(null, "This item doesn't exist");
				System.out.println("ERROR");
			}
				
				//while (buttons.hasMoreElements())
				/*for (Enumeration<AbstractButton> buttons = bgroup.getElements(); buttons.hasMoreElements();)
				{
					AbstractButton temp_button = buttons.nextElement();
					if (temp_button.getText().equals(input.getText()))
					{	
						temp_button.setSelected(true);
					}
					else //if (!temp_button.getText().equals(input.getText()))
					{
						JOptionPane.showMessageDialog(null, "This item doesn't exist");
						System.out.println("ERROR");
					}
				}*/
				input.setText(null);				
			}
		});
		
	}
}
