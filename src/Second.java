import java.awt.*;
import javax.swing.*;

public class Second extends JFrame{

	public Second()
	{
		setTitle("My window");
		setSize(300,300);
		
		setLocationByPlatform(true);  //������������ �� ������
		
		Message mssg = new Message("HEY!");
		add(mssg);
	}
	
}
