import javax.swing.JOptionPane;
public class Seven_Dwarves {
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, n6, n7, n8, n9;
		int count=0;
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;
		do{
		do {
			s1=JOptionPane.showInputDialog("Enter Number of Dwarves1 (1-99) : ");
			n1 = Integer.parseInt(s1);
		} while (n1 <= 0 || n1 >= 99);
		do {
			s2=JOptionPane.showInputDialog("Enter Number of Dwarves2 (1-99) : ");
			n2 = Integer.parseInt(s2);
			if (n2 <= 0 || n2 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n2 == n1) {
				System.out.println("Number2 Duplicate Number1. Please enter again!!!");
			}
		} while (n2 <= 0 || n2 >= 99 || n2 == n1);
		do {
			s3=JOptionPane.showInputDialog("Enter Number of Dwarves3 (1-99) : ");
			n3 = Integer.parseInt(s3);
			if (n3 <= 0 || n3 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n3 == n1) {
				System.out.println("Number3 Duplicate Number1. Please enter again!!!");
			} else if (n3 == n2) {
				System.out.println("Number3 Duplicate Number2. Please enter again!!!");
			}
		} while (n3 <= 0 || n3 >= 99 || n3 == n1 || n3 == n2);
		do {
			s4=JOptionPane.showInputDialog("Enter Number of Dwarves4 (1-99) : ");
			n4 = Integer.parseInt(s4);
			if (n4 <= 0 || n4 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n4 == n1) {
				System.out.println("Number4 Duplicate Number1. Please enter again!!!");
			} else if (n4 == n2) {
				System.out.println("Number4 Duplicate Number2. Please enter again!!!");
			} else if (n4 == n3) {
				System.out.println("Number4 Duplicate Number3. Please enter again!!!");
			}
		} while (n4 <= 0 || n4 >= 99 || n4 == n1 || n4 == n2 || n4 == n3);
		do {
			s5=JOptionPane.showInputDialog("Enter Number of Dwarves5 (1-99) : ");
			n5 = Integer.parseInt(s5);
			if (n5 <= 0 || n5 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n5 == n1) {
				System.out.println("Number5 Duplicate Number1. Please enter again!!!");
			} else if (n5 == n2) {
				System.out.println("Number5 Duplicate Number2. Please enter again!!!");
			} else if (n5 == n3) {
				System.out.println("Number5 Duplicate Number3. Please enter again!!!");
			} else if (n5 == n4) {
				System.out.println("Number5 Duplicate Number4. Please enter again!!!");
			}
		} while (n5 <= 0 || n5 >= 99 || n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4);
		do {
			s6=JOptionPane.showInputDialog("Enter Number of Dwarves6 (1-99) : ");
			n6 = Integer.parseInt(s6);
			if (n6 <= 0 || n6 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n6 == n1) {
				System.out.println("Number6 Duplicate Number1. Please enter again!!!");
			} else if (n6 == n2) {
				System.out.println("Number6 Duplicate Number2. Please enter again!!!");
			} else if (n6 == n3) {
				System.out.println("Number6 Duplicate Number3. Please enter again!!!");
			} else if (n6 == n4) {
				System.out.println("Number6 Duplicate Number4. Please enter again!!!");
			} else if (n6 == n5) {
				System.out.println("Number6 Duplicate Number5. Please enter again!!!");
			}
		} while (n6 <= 0 || n6 >= 99 || n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5);
		do {
			s7=JOptionPane.showInputDialog("Enter Number of Dwarves7 (1-99) : ");
			n7 = Integer.parseInt(s7);
			if (n7 <= 0 || n7 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n7 == n1) {
				System.out.println("Number7 Duplicate Number1. Please enter again!!!");
			} else if (n7 == n2) {
				System.out.println("Number7 Duplicate Number2. Please enter again!!!");
			} else if (n7 == n3) {
				System.out.println("Number7 Duplicate Number3. Please enter again!!!");
			} else if (n7 == n4) {
				System.out.println("Number7 Duplicate Number4. Please enter again!!!");
			} else if (n7 == n5) {
				System.out.println("Number7 Duplicate Number5. Please enter again!!!");
			} else if (n7 == n6) {
				System.out.println("Number7 Duplicate Number6. Please enter again!!!");
			}
		} while (n7 <= 0 || n7 >= 99 || n7 == n1 || n7 == n2 || n7 == n3 || n7 == n4 || n7 == n5 || n7 == n6);
		do {
			s8=JOptionPane.showInputDialog("Enter Number of Dwarves8 (1-99) : ");
			n8 = Integer.parseInt(s8);
			if (n8 <= 0 || n8 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n8 == n1) {
				System.out.println("Number8 Duplicate Number1. Please enter again!!!");
			} else if (n8 == n2) {
				System.out.println("Number8 Duplicate Number2. Please enter again!!!");
			} else if (n8 == n3) {
				System.out.println("Number8 Duplicate Number3. Please enter again!!!");
			} else if (n8 == n4) {
				System.out.println("Number8 Duplicate Number4. Please enter again!!!");
			} else if (n8 == n5) {
				System.out.println("Number8 Duplicate Number5. Please enter again!!!");
			} else if (n8 == n6) {
				System.out.println("Number8 Duplicate Number6. Please enter again!!!");
			} else if (n8 == n7) {
				System.out.println("Number8 Duplicate Number7. Please enter again!!!");
			}
		} while (n8 <= 0 || n8 >= 99 || n8 == n1 || n8 == n2 || n8 == n3 || n8 == n4 || n8 == n5 || n8 == n6
				|| n8 == n7);
		do {
			s9=JOptionPane.showInputDialog("Enter Number of Dwarves9 (1-99) : ");
			n9 = Integer.parseInt(s9);
			if (n9 <= 0 || n9 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n9 == n1) {
				System.out.println("Number9 Duplicate Number1. Please enter again!!!");
			} else if (n9 == n2) {
				System.out.println("Number9 Duplicate Number2. Please enter again!!!");
			} else if (n9 == n3) {
				System.out.println("Number9 Duplicate Number3. Please enter again!!!");
			} else if (n9 == n4) {
				System.out.println("Number9 Duplicate Number4. Please enter again!!!");
			} else if (n9 == n5) {
				System.out.println("Number9 Duplicate Number5. Please enter again!!!");
			} else if (n9 == n6) {
				System.out.println("Number9 Duplicate Number6. Please enter again!!!");
			} else if (n9 == n7) {
				System.out.println("Number9 Duplicate Number7. Please enter again!!!");
			} else if (n9 == n8) {
				System.out.println("Number9 Duplicate Number7. Please enter again!!!");
			}
		} while (n9 <= 0 || n9 >= 99 || n9 == n1 || n9 == n2 || n9 == n3 || n9 == n4 || n9 == n5 || n9 == n6 || n9 == n7
				|| n9 == n8);
		if ((n3 + n4 + n5 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n2 + n4 + n5 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n2 + n3 + n5 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n2 + n3 + n4 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n2 + n3 + n4 + n5 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n2 + n3 + n4 + n5 + n6 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n2 + n3 + n4 + n5 + n6 + n7 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n2 + n3 + n4 + n5 + n6 + n7 + n8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			count=0;
		} else if ((n1 + n4 + n5 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n3 + n5 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n3 + n4 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n3 + n4 + n5 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n3 + n4 + n5 + n6 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n3 + n4 + n5 + n6 + n7 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n3 + n4 + n5 + n6 + n7 + n8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			count=0;
		} else if ((n1 + n2 + n5 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n4 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n4 + n5 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n4 + n5 + n6 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n4 + n5 + n6 + n7 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n4 + n5 + n6 + n7 + n8) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			count=0;
		} else if ((n1 + n2 + n3 + n6 + n7 + n8 + n9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n5 + n7 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n5 + n6 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n5 + n6 + n7 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n5 + n6 + n7 + n8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n7 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n6 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n6 + n7 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n6 + n7 + n8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n5 + n8 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves8 :" + n8);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n5 + n7 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n5 + n7 + n8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves7 :" + n7);
			System.out.println("Dwarves8 :" + n8);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n5 + n6 + n9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves9 :" + n9);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n5 + n6 + n8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves8 :" + n8);
			count=0;
		} else if ((n1 + n2 + n3 + n4 + n5 + n6 + n7) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + n1);
			System.out.println("Dwarves2 :" + n2);
			System.out.println("Dwarves3 :" + n3);
			System.out.println("Dwarves4 :" + n4);
			System.out.println("Dwarves5 :" + n5);
			System.out.println("Dwarves6 :" + n6);
			System.out.println("Dwarves7 :" + n7);
			count=0;
		} else {
			System.out.println("Summary of number not equal 100.!!!");
			System.out.println("Please take again.!!!");
			count++;
		}
		}while(count == 1);
	}
}
