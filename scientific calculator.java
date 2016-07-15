import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;


public class Hello
{
	public static void main(String arc[])
	{   JFrame fram=new JFrame("Calculator");
        box ob=new box(fram);
        ob.buttons(fram);
       


	}
}


class box extends JFrame
{       JPanel contain_buttons=new JPanel();
	    
    //...buttons......//
        JButton ad=new JButton("+");
		JButton minus=new JButton("-");
		JButton division=new JButton("\u00F7");
		JButton multiplication=new JButton("\u00D7");
		JButton root=new JButton("\u221A");
		JButton factorial=new JButton("!");
		JButton ans=new JButton("ANS");
		JButton equal=new JButton("=");
		JButton memory=new JButton("M+");
		JButton percentage=new JButton("%");
		JButton backspace=new JButton("<-");
		JButton one=new JButton("1");
		JButton two=new JButton("2");
		JButton three=new JButton("3");
		JButton four=new JButton("4");
		JButton five=new JButton("5");
		JButton six=new JButton("6");
		JButton seven=new JButton("7");
		JButton eight=new JButton("8");
		JButton nine=new JButton("9");
		JButton zero=new JButton("0");
		JButton power=new JButton("\u00D7"+"10");
		JButton dot=new JButton(".");
		JButton ln=new JButton("ln");
		JButton cal=new JButton("cal");
		JButton clear=new JButton("AC");
		JButton sine=new JButton("sin");
		JButton cos=new JButton("cos");
		JButton tan=new JButton("tan");
		JButton bra1=new JButton("(");
		JButton bar2=new JButton(")");
		JButton pai=new JButton("\u03C0");
		JButton e=new JButton("\u212F");
		JButton theta=new JButton("\u03B8");

    
    Font font1 = new Font("SansSerif", Font.BOLD, 18);
	JTextField jt1=new JTextField(16);

	
   
	public box(JFrame x)
	{
        x.setVisible(true);
        x.setSize(350,400);
        x.setResizable(false);
        x.setLayout(new FlowLayout());
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState( Frame.MAXIMIZED_BOTH );
	}

	public void buttons(JFrame x)
	{    
		int butx=73,buty=36;
        
        jt1.setFont(font1);
        contain_buttons.setPreferredSize(new Dimension(330, 333));
	    contain_buttons.setBackground(Color.CYAN);

	    jt1.setPreferredSize( new Dimension( 330, 38 ) );
	    x.add(jt1);
	    
		x.add(contain_buttons);

		ad.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(ad);
        
        minus.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(minus);
        
        division.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(division);

		multiplication.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(multiplication);

		root.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(root);

		sine.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(sine);

		cos.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(cos);

		tan.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(tan);

		ln.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(ln);

		cal.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(cal);

		bra1.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(bra1);

		bar2.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(bar2);

		theta.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(theta);

		pai.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(pai);

        e.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(e);

		factorial.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(factorial);

		one.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(one);

		two.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(two);

		three.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(three);

		clear.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(clear);

		four.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(four);

		five.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(five);

		six.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(six);

		power.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(power);

		seven.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(seven);

		eight.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(eight);

		nine.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(nine);

		memory.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(memory);
        
        zero.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(zero);

		dot.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(dot);
        
        ans.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(ans);

		equal.setPreferredSize(new Dimension(butx,buty));
		contain_buttons.add(equal);

	
	}

	private void event_handale()
	{
         ad.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a1)
			{
                
			}
		});
































	}

	
}
