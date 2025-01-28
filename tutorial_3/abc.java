package tutorial_3;

import java.util.Scanner;

class Eligible {

	Scanner cin = new Scanner(System.in);

	Integer no_of_classes_held;
	Integer no_of_classes_attended;

	void input(){

		System.out.print("Enter the number of classes held: ");
		no_of_classes_held = cin.nextInt();
		System.out.print("Enter the number of classes attended: ");
		no_of_classes_attended = cin.nextInt();

	}

	void compute(){

		double percentage = (double) no_of_classes_attended / no_of_classes_held * 100;
	
		if(percentage >= 80){

			System.out.print("Attendance: " + percentage + "%\n");	
			System.out.print("Student permitted to appear in the exam");

		}		
	
		else{
			System.out.print("Attendance: " + percentage + "%\n");
			System.out.print("student is not permitted to appear in the exam");

		}

	}

}


public class abc {

	public static void main (String []args){

		Eligible s1 = new Eligible();

    		s1.input();
		s1.compute();
			

	}	    
    
}

