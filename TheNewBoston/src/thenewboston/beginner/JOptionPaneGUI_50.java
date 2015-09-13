package thenewboston.beginner;
import javax.swing.JOptionPane;
public class JOptionPaneGUI_50 {

	public static void main(String[] args) {
		
		String firstNum=JOptionPane.showInputDialog("Enter 1st Num");
		String secNum=JOptionPane.showInputDialog("Enter 2nd Num");
		
		int num1 = Integer.parseInt(firstNum);
		int num2 = Integer.parseInt(secNum);
		
		int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null, "The sum is " +sum, "Answer",JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
