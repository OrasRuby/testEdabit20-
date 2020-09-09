import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class JoptionPaneTest {

	public static void main(String[] args) {
		/*float gallons = Float.parseFloat(JOptionPane.showInputDialog(null,
		        "Enter gallons used", "Gas Mileage",
		        JOptionPane.WARNING_MESSAGE));
		float miles = Float.parseFloat(JOptionPane.showInputDialog(null,
		        "Enter miles traveled", "Miles",
		        JOptionPane.WARNING_MESSAGE));
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		JOptionPane.showMessageDialog(null, nf.format(miles/gallons),
		        "Mileage is below",  JOptionPane.INFORMATION_MESSAGE);
		System.out.printf("Your mileage in mpg is %6.2f\n", miles/gallons);*/
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Age: ",JOptionPane.WARNING_MESSAGE));
		String name = JOptionPane.showInputDialog(null,"Enter your name: ",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, name + "your age is " + num, "Profile", JOptionPane.INFORMATION_MESSAGE); 
		
		//Yes or No GUI
		JOptionPane.showConfirmDialog(null,
	             "choose one", "choose one", JOptionPane.YES_NO_OPTION);
		//String inputValue = JOptionPane.showInputDialog("Please input a value");
		
		//show GUI window with three options and titled Input and the input field titled Choose one
		Object[] possibleValues = { "First", "Second", "Third" };
		Object selectedValue = JOptionPane.showInputDialog(null,
	             "Choose one", "Input",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);
		JOptionPane.showMessageDialog(null, selectedValue, "WOW", JOptionPane.INFORMATION_MESSAGE); 
		

	}

}
