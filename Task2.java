package Codesoft;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of a sub:");
		int n=sc.nextInt();
		
		double []marks=new double[n];
		
		System.out.println("Enter marks(out of 100):");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextDouble();		
			}
		
		double total=0.0;
		for(double mark:marks) {
			total+=mark;
		}
		
		double avg=total/n;
		
		String grade="";
		if(avg>=90) {
			grade="+A";
		}
		else if(avg>=80 && avg<90) {
			grade="A";
		}
		else if(avg>=70 && avg<80) {
			grade="B";
		}
		else if(avg>=60 && avg<70) {
			grade="C";
		}
		else if(avg>=50 && avg<60) {
			grade="D";
		}
		
		 System.out.println("Total marks obtained:"+total);
		 System.out.println("Average:"+avg);
		 System.out.println("Grade:"+grade);
	}

}
