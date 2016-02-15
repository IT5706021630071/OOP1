import javax.swing.JOptionPane;
public class Skocimis {
	public static void main(String[] args) 
	{
		int n1, n2, n3;
		String s1,s2,s3,s4,s5,s6;
		do {
			s1=JOptionPane.showInputDialog("Enter 3 integer :");
			n1 = Integer.parseInt(s1);
			n2 = Integer.parseInt(s1);
			n3 = Integer.parseInt(s1);
			if (n1 <= 0 || n1 >= 100) {
				s2=JOptionPane.showInputDialog("Invalid Input. Please enter again!!!");
			} else if (n2 <= 0 || n2 >= 100) {
				s3=JOptionPane.showInputDialog("Invalid Input. Please enter again!!!");
			} else if (n3 <= 0 || n3 >= 100) {
				s4=JOptionPane.showInputDialog("Invalid Input. Please enter again!!!");
			} else if (n2 <= n1) {
				s5=JOptionPane.showInputDialog("Number2 must more than Number1. Please enter again!!!");
			} else if (n3 <= n2) {
				s6=JOptionPane.showInputDialog("Number3 must more than Number2. Please enter again!!!");
			}
		} while (n1 <= 0 || n1 >= 100 || n2 <= 0 || n2 >= 100 || n3 <= 0 || n3 >= 100 || n3 < n1 || n3 < n2 || n2 < n1
				|| n1 > n2 || n1 > n3);
		JOptionPane.showMessageDialog(null," Most played : " + total(n1,n2,n3) + " time.",null, JOptionPane.INFORMATION_MESSAGE);
	
	}
		public static int total(int n1,int n2,int n3)
		{
		return(((n3 - n2) - 1));
		}
	}

