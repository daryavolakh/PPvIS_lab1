import java.awt.*;
import javax.swing.*;

public class Message extends JPanel{
	String mssg;
	public Message(String m)
	{
		mssg = m;   //создаём объект передавая ему текст
	}
	
	 public void paintComponent(Graphics g)  //graphics - класс
	 {
		 g.drawString(mssg, 50, 50);
	 }
}
