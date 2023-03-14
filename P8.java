// wajp to
import javax.swing.*;
import java.awt.*;
import java.time.*;

class App extends JFrame
{
	Container c;
	JLabel lab;
	
	App()
	{
		c = getContentPane();
		Font f = new Font("Times New Roman", Font.BOLD, 50);
		LocalTime t = LocalTime.now();
		int hr = t.getHour();
		String msg = "";
		if(hr < 12)		msg = "Good Morning";
		else if(hr < 16)	msg = "Good Afternoon";
		else			msg = "Good Evening";

		lab = new JLabel(msg, JLabel.CENTER);
		lab.setFont(f);
		c.add(lab);
	}
}

class P8
{
	public static void main(String args[])
	{
		App a = new App();
		a.setTitle("My Second Frame");
		a.setSize(500, 500);
		a.setLocationRelativeTo(null);
		a.serDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}
}