// import required packages

import java.util.Scanner;

public class parallelArrays {

	public static void main(String[] args) {
		//create new scanner object
		
		Scanner s = new Scanner(System.in);
		
		// initialize starting vars
		// we will need a var for: num of students, studentID, name and gpa
		// studentID, name and gpa should all be parallel arrays
		
		//lets start by asking the user how many students there are.
		// we use a do while here to ensure the number of students is 10 or less
		int numStudents = 11;
		do {
			System.out.println("How many students are in the class?");
			numStudents = s.nextInt();
		} while (numStudents > 10);
		
		// now lets begin initializing the three arrays: int ID, string name and double gpa
		
		int[] studentID = new int[numStudents];
		String[] studentName = new String[numStudents];
		double[] gpa = new double[numStudents];
		
		// lets use a while loop with a nested for loop to populate the arrays
		int counter = 0;
		while (counter < numStudents) {
			for (int i = 0; i < numStudents; i++) {
				System.out.println("Enter the ID for student " + (i+1) + ":");
				studentID[i] = s.nextInt();
				System.out.println("Enter the last name for student " + (i+1) + ":");
				studentName[i] = s.next();
				System.out.println("Enter the gpa for student " + (i+1) + ":");
				gpa[i] = s.nextDouble();
				counter++;
			}
			
			System.out.println("Data entered succesfully!");
		}
		System.out.println("---------------------------------");
		// now lets show the user the data they entered
		System.out.println("Displaying data entered:");
		
		for (int i = 0; i < studentID.length; i++) {
			System.out.println(studentID[i] + " - " + studentName[i] + " " + gpa[i]);
		}
		
		System.out.println("---------------------------------");
		
		//now lets show the user detailed statistics on the gpa's
		
		//lets start with the min gpa
		double min = 100;
		for (int i = 0; i < gpa.length; i++) {
			if (gpa[i] < min) {
				min = gpa[i];
			}
		}
		
		//lets compute the max
		double max = 0;
		for (int i = 0; i < gpa.length; i++) {
			if (gpa[i] > max) {
				max = gpa[i];
			}
		}
		
		//finally, lets find out the average
		
		
		double sum = 0;
		for (int i = 0; i < gpa.length; i++) {
			sum += gpa[i];
		}
		double avg = sum/gpa.length;
		
		//lets print this out nicely for the user
		
		System.out.println(" - The min GPA is: " + min);
		System.out.println(" - The max GPA is: " + max);
		System.out.println(" - The average GPA is: " + avg);
		
		// lets allow the user to choose a student by their ID and show their information
		
		//lets start by asking the user what student they would like to see
		System.out.println("Enter the ID of a student you would like to see: ");
		int userChoice = s.nextInt();
		String foundStudent = "";
		boolean studentExists = false;
		for (int i = 0; i < studentID.length; i++) {
			if (userChoice == studentID[i]) {
				foundStudent = studentName[i] + "'s GPA is " + gpa[i] + " and ID is " + studentID[i];
				studentExists = true;
			}
		}
		if (studentExists == true) {
			System.out.println(foundStudent);
		} else {
			System.out.println("Student " + userChoice + " does not exist");
		}
		
		
		
	}

}