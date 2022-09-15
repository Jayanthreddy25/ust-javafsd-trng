package Enum;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends Frame implements ActionListener{
	TextField t;

	
	
	Event1(){
		t=new TextField();
		t.setBounds(50,100,50,100);
		Button b=new Button("press");
		b.addActionListener(this);
		t.setBounds(100,100,100,100);
		add(b);add(t);
		setVisible(true);
	}
public void ActionPerformed(ActionEvent e) {
		t.setText("say java");
		
	}
	public static void main(String[] args) {
		new Event1();
		System.out.println("Action");
	}
}

