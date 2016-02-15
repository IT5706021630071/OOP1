import java.lang.*;
import javax.swing.JOptionPane;
public class Trik {
	public static void main(String[] args)
	{
		String ch;
		int A = 1;
		int B = 0;
		int C = 0;
		int temp=0;
		String s1,s2;
		do {
			s1=JOptionPane.showInputDialog("Enter character (A,B or C) : ");
			ch = s1;
			if(ch.length() > 50){
				s2=JOptionPane.showInputDialog("Invalid input. Please enter again!!!");
			}
		} while (ch.length() > 50);
		character(A,B,C);
		for (int i = 0; i < ch.length(); i++) 
		{
			if (ch.charAt(i) == 'A' || ch.charAt(i) == 'a') {
				temp = A;
				A = B;
				B = temp;
			} else if (ch.charAt(i) == 'B' || ch.charAt(i) == 'b') {
				temp = B;
				B = C;
				C = temp;
			} else if (ch.charAt(i) == 'C' || ch.charAt(i) == 'c') {
				temp = A;
				A = C;
				C = temp;
			}
		}
	}
	public static void character(int A,int B,int C)
	{
	
		if (A == 1) {
			JOptionPane.showMessageDialog(null,"Ball in glass : 1",null, JOptionPane.INFORMATION_MESSAGE);
		} else if (B == 1) {
			JOptionPane.showMessageDialog(null,"Ball in glass : 2",null, JOptionPane.INFORMATION_MESSAGE);
		} else if (C == 1) {
			JOptionPane.showMessageDialog(null,"Ball in glass : 3",null, JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}

