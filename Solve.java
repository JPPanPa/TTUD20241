package test1;
import javax.swing.JOptionPane;
public class Solve {
public static void main(String[] args) {
String choice = JOptionPane.showInputDialog(null, "solve:\n" +"1:ax + b = 0\n" +"2: The system of first-degree equations (linear system) with two variables \n" +"3:ax^2 + bx + c = 0", "Equation Solver", JOptionPane.INFORMATION_MESSAGE);
switch (choice) {
case "1":
firstdegreeonehidden();
break;
case "2":
firstdegreetwohidden();
break;
case "3":
seconddegreeonehidden();
break;
default:
JOptionPane.showMessageDialog(null, "Please select 1, 2, or 3.","Error", JOptionPane.ERROR_MESSAGE);
}
}
private static void firstdegreeonehidden() {
String strA = JOptionPane.showInputDialog(null, "a (a ≠ 0):", "Input", JOptionPane.INFORMATION_MESSAGE);
String strB = JOptionPane.showInputDialog(null, "b:", "Input", JOptionPane.INFORMATION_MESSAGE);
double a = Double.parseDouble(strA);
double b = Double.parseDouble(strB);
double result = -b / a;
JOptionPane.showMessageDialog(null, "solution of the equation x = " + result,"Result", JOptionPane.INFORMATION_MESSAGE);
}
private static void firstdegreetwohidden() { 
String strA11 = JOptionPane.showInputDialog(null, " a11:", "Input", JOptionPane.INFORMATION_MESSAGE);
String strA12 = JOptionPane.showInputDialog(null, " a12:", "Input", JOptionPane.INFORMATION_MESSAGE);
String strB1 = JOptionPane.showInputDialog(null, " b1:", "Input", JOptionPane.INFORMATION_MESSAGE);
String strA21 = JOptionPane.showInputDialog(null, " a21:", "Input", JOptionPane.INFORMATION_MESSAGE);
String strA22 = JOptionPane.showInputDialog(null, "a22:", "Input", JOptionPane.INFORMATION_MESSAGE);
String strB2 = JOptionPane.showInputDialog(null, "b2:", "Input", JOptionPane.INFORMATION_MESSAGE);
double a11 = Double.parseDouble(strA11);
double a12 = Double.parseDouble(strA12);
double b1 = Double.parseDouble(strB1);
double a21 = Double.parseDouble(strA21);
double a22 = Double.parseDouble(strA22);
double b2 = Double.parseDouble(strB2);
double D = a11 * a22 - a21 * a12;
double D1 = b1 * a22 - b2 * a12;
double D2 = a11 * b2 - a21 * b1;
if (D != 0) {
double x1 = D1 / D;
double x2 = D2 / D;
JOptionPane.showMessageDialog(null, "equation has one solution:\n" + "x1 = " + x1 + "\n" + "x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
} else if (D == 0 && D1 == 0 && D2 == 0) {
JOptionPane.showMessageDialog(null, "infinitely many solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(null, "ineffective","Result", JOptionPane.INFORMATION_MESSAGE);
}
}
private static void seconddegreeonehidden() {
String strA = JOptionPane.showInputDialog(null, "a (a ≠ 0):", "Input", JOptionPane.INFORMATION_MESSAGE);
String strB = JOptionPane.showInputDialog(null, "b:", "Input", JOptionPane.INFORMATION_MESSAGE);
String strC = JOptionPane.showInputDialog(null, "c:", "Input", JOptionPane.INFORMATION_MESSAGE);
double a = Double.parseDouble(strA);
double b = Double.parseDouble(strB);
double c = Double.parseDouble(strC);
double delta = b * b - 4 * a * c;
if (delta > 0) {
double x1 = (-b + Math.sqrt(delta)) / (2 * a);
double x2 = (-b - Math.sqrt(delta)) / (2 * a);
JOptionPane.showMessageDialog(null, "the equation has two distinct roots:\n" +"x1 = " + x1 + "\n" +"x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
}else if (delta == 0) {
double x = -b / (2 * a);
JOptionPane.showMessageDialog(null, "the equation has a double root:\n" +"x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(null, "ineffective","Result", JOptionPane.INFORMATION_MESSAGE);
}
}
}



