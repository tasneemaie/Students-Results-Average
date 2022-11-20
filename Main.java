package Students;
import java.util.Scanner;

public class Main
{
public static String getModuleName(Scanner sc)
{
System.out.print("Enter the module name: ");
return sc.nextLine();
}
public static int getNumberOfStudentResults(Scanner sc)
{
System.out.print("How many student results would you like to capture? ");
return sc.nextInt();
}
public static void getResults(Scanner sc,double[] results,int n)
{
for(int i=0;i<n;i++)
{
System.out.print("Enter student "+(i+1)+" result: ");
results[i]=sc.nextDouble();
while(results[i]<0)
{
System.out.println("Invalid result!!");
System.out.print("Enter student "+(i+1)+" result: ");
results[i]=sc.nextDouble();
}
}
}
public static double getAverage(double[] results,int n)
{
double average=0;
for(int i=0;i<n;i++)
{
average=average+results[i];
}
average=average/(double)n;
return average;
}
public static void createReport(String module,double[] results,double average,int n)
{
System.out.println("---------------------------------------");
System.out.println(module+" RESULTS REPORT");
System.out.println("---------------------------------------");
for(int i=0;i<n;i++)
{
System.out.println("STUDENT: "+(i+1)+" RECEIVED:\t"+results[i]+"%");
}
System.out.println("---------------------------------------");
System.out.println("STUDENT COUNT:\t"+n);
System.out.println("AVERAGE RESULT:\t"+average);
System.out.println("---------------------------------------");
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String module = getModuleName(sc);
int n = getNumberOfStudentResults(sc);
double[] results = new double[n];
getResults(sc,results,n);
double average= getAverage(results,n);
createReport(module,results,average,n);
}

}