import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
    String strNum1, strNum2;
    double num1, num2;
    strNum1 = JOptionPane.showInputDialog(null,"Please input the first number:", "Input the first number",JOptionPane.INFORMATION_MESSAGE);
    num1 = Double.parseDouble(strNum1);
    strNum2 = JOptionPane.showInputDialog(null,"Please input the second number:", "Input the second number",JOptionPane.INFORMATION_MESSAGE);
    num2 = Double.parseDouble(strNum2);
    double sum = num1 + num2;
    double subtract = num1 - num2;
    double multiply = num1 * num2;
    double devide= num1 / num2;      
    double strNotification = "Results:\n" +
    "Sum: " + sum + "\n" +
    "subtract: " + subtract + "\n" +
    "multiply: " + multiply + "\n" +
    "devide: " + devide;
JOptionPane.showMessageDialog(null, strNotification,"Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
