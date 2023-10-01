// Author:Subhash Konduru

import java.util.Scanner;

public class letterGrade{

    public static void main(String[] args) {

        String LetterGrade;

        System.out.println("Author: Subhash Konduru");

        System.out.println("Please enter your grade marks :");

        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();

 // if grade >= 95 , set the letterGrade to A+

if(grade >= 95){

LetterGrade = "A+";

}

// if grade >= 90 , set the letterGrade to A

else if(grade >= 90){

LetterGrade = "A";

}

  // if grade >= 85 , set the letterGrade to B+

else if(grade >= 85){

LetterGrade = "B+" ;

}

// if grade >= 80 , set the letterGrade to B

else if(grade >= 80){

LetterGrade = "B" ;

}

 // if grade >= 75 , set the letterGrade to C+

else if(grade >= 75){

LetterGrade = "C+";

}

// if grade >= 70 , set the letterGrade to C

else if(grade >= 70){

LetterGrade = "C" ;

}

 // if grade >= 65 , set the letterGrade to D+

else if(grade >= 65){

LetterGrade = "D+";

}

// if grade >= 60 , set the letterGrade to D

else if(grade >= 60){

LetterGrade = "D" ;

}

 // else set the letterGrade to F

        else {

LetterGrade = "F";

        }

 //Display the final grade

        System.out.println("The corresponding letter grade is: " + LetterGrade);

    } //main

} //LetterGrade


