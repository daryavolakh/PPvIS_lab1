import java.awt.*; //использу€ * подключаем все компоненты данной бибилиотеки
import javax.swing.*;

public class MainClass
{
	public static void main(String args[])
	{
		Second frame = new Second();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //?
		frame.setVisible(true); //сделали frame видимым
	}
}

