import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Second extends JFrame{

	public JButton button = new JButton ("button");
	public JTextField input = new JTextField ("", 25);
	public JLabel label = new JLabel ("Input:");
	public Second()
	{
		setTitle("My window");
		setSize(300,300);		
		setLocationByPlatform(true);  //расположение на экране
		 String[] items = {
		    		"Elem 1", "Elem 2"
		    };
		    JComboBox comboBox = new JComboBox(items);
		    comboBox.setEditable(true); //чтобы можно было редактировать
		getContentPane().add(comboBox);
		/*button.setVerticalTextPosition(AbstractButton.CENTER);
		button.setHorizontalTextPosition(AbstractButton.LEADING);
		*/
		getContentPane().add(button);
		setLayout(new GridLayout());
	    getContentPane().add(label);
	    getContentPane().add(input);
	   
	   
		/*Message mssg = new Message("HEY!");
		add(mssg);*/
	}

	
}


