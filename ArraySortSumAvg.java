package test1;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySortSumAvg{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("number of elements in array:");
int n = sc.nextInt();
double[] array = new double[n];
for (int i = 0; i < n; i++) {
System.out.print("Enter the second element:" + (i + 1) + ": ");
array[i] = sc.nextDouble();
}
Arrays.sort(array);
double sum = 0;
for (double num : array) {
sum += num;
}
double average = sum / n;
System.out.println("array after sorting" + Arrays.toString(array));
System.out.println("Sum" + sum);
System.out.println("avg" + average);
sc.close();
    }
}