import java.applet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class key extends Applet implements KeyListener{
	
	String str = "";
	
	public void init() {
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		char key = e.getKeyChar();
		str = "KEy typed : ";
		str += key;
		showStatus("Key is Typed");
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		str = "Key Pressed";    
		showStatus("Key is Pressed");
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		str = "Key Released";
		showStatus("Key is Released");
		repaint();
	}
	
	public void paint(Graphics g) {
		g.drawString(str, 50, 50);
	}
}