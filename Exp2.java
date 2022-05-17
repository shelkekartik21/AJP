import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mouse extends Frame implements MouseListener{
	String str = "";
	Frame f;
	TextField t1;
	
	mouse(){
		f = new Frame("Mouse Action");
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		t1 = new TextField("Mouse Event");
		t1.setSize(100, 50);
		f.add(t1);
		f.addMouseListener(this);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		str = "Mouse Clicked";
		t1.setText(str);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		str = "Mouse Pressed";
		t1.setText(str);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		str = "Mouse Released";
		t1.setText(str);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		str = "Mouse Entered";
		t1.setText(str);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		str = "Mouse Exited";
		t1.setText(str);
	}
	
	public void main(String[] args) {
		mouse obj = new mouse();
	}

}
