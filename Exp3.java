import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class gui {
	Frame f1, f2;
	TextField t1, t2, t3, tn;
	
	gui(){
		f1 = new Frame("Student Report");
		f1.setLayout(null);
		f1.setSize(300,300);
		f1.setVisible(true);
		
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f1.dispose();
			}
		});
		
		Label ln = new Label("Enter name");
		ln.setBounds(10,30,90,20);
		f1.add(ln);
		tn = new TextField();
		tn.setBounds(100,30,100,20);
		f1.add(tn);
		
		Label l1 = new Label("Enter Marks");
		ln.setBounds(10,30,90,20);
		f1.add(l1);
		
		Label l2 = new Label("Maths : ");
		l2.setBounds(10,30,90,20);
		f1.add(l2);
		t1 = new TextField();
		t1.setBounds(100,30,100,20);
		f1.add(t1);
		
		Label l3 = new Label("English : ");
		l3.setBounds(10,30,90,20);
		f1.add(l3);
		t2 = new TextField();
		t2.setBounds(100,30,100,20);
		f1.add(t2);
		
		Label l4 = new Label("Science : ");
		l4.setBounds(100,30,100,20);
		f1.add(l4);
		t3 = new TextField();
		t3.setBounds(10,30,90,20);
		f1.add(t3);
		
		
		Button b1 = new Button("Submit");
		b1.setBounds(30,250,50,20);
		f1.add(b1);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f2 = new Frame("Student Result");
				f2.setLayout(null);
				f2.setSize(400,400);
				f2.setVisible(true);
				
				f2.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						f2.dispose();
					}
				});
				
				Label lr = new Label("Result of " + tn.getText());
				lr.setBounds(10,30,200,20);
				f2.add(lr);
				
				
				int s1 = Integer.parseInt(t1.getText());
				int s2 = Integer.parseInt(t2.getText());
				int s3 = Integer.parseInt(t3.getText());
				
				
				Label l11 = new Label("Marks in Maths : " + s1);
				l11.setBounds(10,60,90,20);
				f2.add(l11);
				
				int sum = s1+s2+s3;
				float pct = (float)sum / 3;
				
				String s;
				if(pct >= 40) {
					s = "Pass";
				}else {
					s = "Fail";
				}
				
				Label lp = new Label("Result : " + s);
				lp.setBounds(10,90,90,20);
				f2.add(lp);
			}
		});
		
	}
	
	public static void main(String args[]) {
		gui obj = new gui();
	}
}
