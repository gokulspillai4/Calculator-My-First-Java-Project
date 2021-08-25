

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton zeroButton;
	JButton plusButton;
	JButton minusButton;
	JButton divButton;
	JButton mulButton;
	JButton equalButton;
	JButton dotButton;
	JButton clearButton,remButton,percButton,factButton;
	boolean isOperatorClicked=false;
	String oldValue=null;
	String Operator=null;
	String result=null;
	String newValue=null;
	Float oldValueF,newValueF;
	int oldValueInt,factResult=1,newValueInt;
	void equalButtonPressed() {
			newValue=displayLabel.getText();
			oldValueF=Float.parseFloat(oldValue);
			oldValueInt=Integer.parseInt(oldValue);
			newValueInt=Integer.parseInt(newValue);
			newValueF=Float.parseFloat(newValue);
			if(Operator=="+") {
			result=String.valueOf(oldValueF+newValueF);
			}		
			else if(Operator=="-") {
				result=String.valueOf(oldValueF-newValueF);
				}	
			else if(Operator=="/") {
				result=String.valueOf(oldValueF/newValueF);
				}	
			else if(Operator=="*") {
				result=String.valueOf(oldValueF*newValueF);
				}
			else if(Operator=="%") {
				result=String.valueOf(oldValueF%newValueF);
				}
			else if(Operator=="percentage") {
				result=String.valueOf((oldValueF/100)*newValueF);
				}
			else if(Operator=="!") {
				for(int i=1;i<=oldValueInt;i++) {
					factResult=factResult*i;
				}
				result=String.valueOf(factResult);
				}
			displayLabel.setText(result);
			isOperatorClicked=true;
		
	}
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setVisible(true);
		jf.setLocation(350, 100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30,20, 540,70);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(displayLabel);
		
		 sevenButton=new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		 eightButton=new JButton("8");
		eightButton.setBounds(130, 120, 80, 80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		 nineButton=new JButton("9");
		nineButton.setBounds(230, 120, 80, 80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		 fourButton=new JButton("4");
		fourButton.setBounds(30, 220, 80, 80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 fiveButton=new JButton("5");
		fiveButton.setBounds(130, 220, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		 sixButton=new JButton("6");
		sixButton.setBounds(230, 220, 80, 80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		 oneButton=new JButton("1");
		oneButton.setBounds(30, 320, 80, 80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		 twoButton=new JButton("2");
		twoButton.setBounds(130, 320, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 threeButton=new JButton("3");
		threeButton.setBounds(230, 320, 80, 80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		 zeroButton=new JButton("0");
		zeroButton.setBounds(130, 420, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 dotButton=new JButton(".");
		dotButton.setBounds(30, 420, 80, 80);
		dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(230, 420, 80, 80);
		equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		 divButton=new JButton("/");
		divButton.setBounds(330, 120, 80, 80);
		divButton.setFont(new Font("Arial",Font.PLAIN,40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		 mulButton=new JButton("x");
		mulButton.setBounds(330, 220, 80, 80);
		mulButton.setFont(new Font("Arial",Font.PLAIN,40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		 plusButton=new JButton("+");
		plusButton.setBounds(330, 420, 80, 80);
		plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("AC");
		clearButton.setBounds(430, 420, 80, 80);
		clearButton.setFont(new Font("Arial",Font.PLAIN,28));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 320, 80, 80);
		minusButton.setFont(new Font("Arial",Font.PLAIN,40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		remButton=new JButton("Rem");
		remButton.setBounds(430, 120, 80, 80);
		remButton.setFont(new Font("Arial",Font.PLAIN,22));
		remButton.addActionListener(this);
		jf.add(remButton);
		
		percButton=new JButton("%");
		percButton.setBounds(430, 220, 80, 80);
		percButton.setFont(new Font("Arial",Font.PLAIN,40));
		percButton.addActionListener(this);
		jf.add(percButton);
		
		factButton=new JButton("!");
		factButton.setBounds(430, 320, 80, 80);
		factButton.setFont(new Font("Arial",Font.PLAIN,40));
		factButton.addActionListener(this);
		jf.add(factButton);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
			}
		else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"8");
		}
		}
		else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"9");
		}
		}
		else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"4");
		}
		}
		else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"5");
		}
		}
		else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"6");
		}
		}
		else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"1");
		}
		}
		else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"2");
		}
		}
		else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"3");
		}
		}
		else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"0");
		}
		}
		else if(e.getSource()==equalButton) {
			equalButtonPressed();
		}
		
		else if(e.getSource()==dotButton) {
			if(displayLabel.getText().contains(".")) {
				displayLabel.setText(displayLabel.getText());
			}
			else
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if(e.getSource()==divButton) {
			if(Operator!=null) {
				equalButtonPressed();
				oldValue=displayLabel.getText();
				Operator="/";
				isOperatorClicked=true;
			}
			else {
				oldValue=displayLabel.getText();
				Operator="/";
				isOperatorClicked=true;
			}
				
		}
		else if(e.getSource()==mulButton) {
			if(Operator!=null) {
				equalButtonPressed();
				oldValue=displayLabel.getText();
				Operator="*";
				isOperatorClicked=true;
			}
			else {
			oldValue=displayLabel.getText();
			
			Operator="*";
			isOperatorClicked=true;
		}
		}
		else if(e.getSource()==plusButton) {
			if(Operator!=null) {
				equalButtonPressed();
				oldValue=displayLabel.getText();
				Operator="+";
				isOperatorClicked=true;
			}
			else {
			oldValue=displayLabel.getText();
			Operator="+";
			isOperatorClicked=true;
		}
		}
		else if(e.getSource()==minusButton) {
			if(Operator!=null) {
				equalButtonPressed();
				oldValue=displayLabel.getText();
				Operator="-";
				isOperatorClicked=true;
			}
			else {
			oldValue=displayLabel.getText();
			Operator="-";
			isOperatorClicked=true;
		}
		}
		
		else if(e.getSource()==remButton) {
			if(Operator!=null) {
				equalButtonPressed();
				oldValue=displayLabel.getText();
				Operator="%";
				isOperatorClicked=true;
			}
			else {
			oldValue=displayLabel.getText();
			Operator="%";
			isOperatorClicked=true;
		}
		}
		
		else if(e.getSource()==percButton) {
			if(Operator!=null) {
				equalButtonPressed();
				oldValue=displayLabel.getText();
				Operator="percentage";
				isOperatorClicked=true;
			}
			else {
			oldValue=displayLabel.getText();
			
			Operator="percentage";
			isOperatorClicked=true;
		}
		}
		
		else if(e.getSource()==factButton) {
			if(Operator!=null) {
				equalButtonPressed();
				oldValue=displayLabel.getText();
				Operator="percentage";
				isOperatorClicked=true;
			}
			else {
			oldValue=displayLabel.getText();
			Operator="!";
			isOperatorClicked=true;
		}
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			Operator=null;
			oldValue=null;
			newValue=null;
			oldValueF=null;
			newValueF=null;
		
		}
	}
	
	
}
