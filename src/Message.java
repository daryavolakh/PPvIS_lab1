import java.awt.*;
import javax.swing.*;

public class Message extends JPanel{
	String mssg;
	public Message(String m)
	{
		mssg = m;   //������ ������ ��������� ��� �����
	}
	
	 public void paintComponent(Graphics g)  //graphics - �����
	 {
		 g.drawString(mssg, 50, 50);
	 }
}
