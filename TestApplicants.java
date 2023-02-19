/*
 * Project : Project 6
 * Description: TestApplicants Class
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

//TestApplicant Class
public class TestApplicants {

    //Main method
    public static void main(String[] args){

        //Creating scanner object
        Scanner input = new Scanner(System.in);

        //Array to store the user input of grades
        int[] grades = new int[6];

        //Object for applicant 1
        Applicants Applicant1 = new Applicants("Ray","ray03@gmail.com",415423480);
        //Setter to set the values of applicant 1
        Applicant1.setMajor("Electrical Engineering");
        Applicant1.setExperienceYear(2);
        Applicant1.setPassYear(2021);

        //Object for applicant 2
        Applicants Applicant2 = new Applicants("Computer Science",6,2022);
        //Setter to set the values of applicant 2
        Applicant2.setName("Gia");
        Applicant2.setEmail("gia0030@gmail.com");
        Applicant2.setPhoneNumber(650666789);

        //Object for applicant 3
        Applicants Applicant3 = new Applicants();
        //Setter to set the values of applicant 3
        Applicant3.setName("Aisha");
        Applicant3.setEmail("aisha@gmail.com");
        Applicant3.setPhoneNumber(987654321);
        Applicant3.setMajor("Criminal Justice");
        Applicant3.setPassYear(2020);
        Applicant3.setExperienceYear(8);

        //Test case 1
        System.out.println("For Applicant 1: Name- " + Applicant1.getName() + ", email- " + Applicant1.getEmail() + ", phone- " + Applicant1.getPhoneNumber()
                + " majoring in " + Applicant1.getMajor() + ", passed out in " + Applicant1.getPassYear() + " and has " + Applicant1.getExperienceYear() + " years of experience");

        //Prompt user to enter their grades
        System.out.println("Enter your grades:");
        while (true) {
            System.out.print("1. CSC 210: Introduction to Computer Programming: ");
            grades[0] = input.nextInt();
            if ((grades[0] >= 0) && (grades[0] <= 100)) {
                break;
            } else {
                continue;
            }
        }
        System.out.print("2. CSC 220: Data Structures: ");
        grades[1] = input.nextInt();
        System.out.print("3. CSC 340: Programming Methodology: ");
        grades[2] = input.nextInt();
        System.out.print("4. CSC 413: Software Development: ");
        grades[3] = input.nextInt();
        System.out.print("5. CSC 415: Operating Systems: ");
        grades[4] = input.nextInt();
        System.out.print("6. CSC 510: Analysis of Algorithms: ");
        grades[5] = input.nextInt();

        //Setter to set grades
        Applicant1.setGrades(grades);

        System.out.println();

        //Running all the method of applicants class
        System.out.println("Running averageAbove85: " +Applicant1.averageAbove85());
        System.out.println("Running atLeastFour85: " + Applicant1.atLeastFour85());
        System.out.println("Running noGradeBelow65: " + Applicant1.noGradeBelow65());
        System.out.println("Running upperLevelAbove85: " + Applicant1.upperLevelAbove85());
        System.out.println("Running atLeast3ExperienceYear: " + Applicant1.atLeast3ExperienceYear());

        //If else to check applicant is selected or not (Custom Filter)
        System.out.println();
        if (Applicant1.averageAbove85() && Applicant1.atLeastFour85() && Applicant1.noGradeBelow65() && Applicant1.upperLevelAbove85() && Applicant1.atLeast3ExperienceYear()){
            System.out.println("Congratulations! You are selected!!!");
        }
        else{
            System.out.println("Rejected! Better luck next time");
        }

        System.out.println();

        //Test case 2
        System.out.println("For Applicant 2: Name- " + Applicant2.getName() + ", email- " + Applicant2.getEmail() + ", phone- " + Applicant2.getPhoneNumber()
                + " majoring in " + Applicant2.getMajor() + ", passed out in " + Applicant2.getPassYear() + " and has " + Applicant2.getExperienceYear() + " years of experience");

        //Prompt user to enter their grades
        System.out.println("Enter your grades:");
        System.out.print("1. CSC 210: Introduction to Computer Programming: ");
        grades[0] = input.nextInt();
        System.out.print("2. CSC 220: Data Structures: ");
        grades[1] = input.nextInt();
        System.out.print("3. CSC 340: Programming Methodology: ");
        grades[2] = input.nextInt();
        System.out.print("4. CSC 413: Software Development: ");
        grades[3] = input.nextInt();
        System.out.print("5. CSC 415: Operating Systems: ");
        grades[4] = input.nextInt();
        System.out.print("6. CSC 510: Analysis of Algorithms: ");
        grades[5] = input.nextInt();
        //Setter to set grades
        Applicant2.setGrades(grades);

        System.out.println();

        //Running all the method of applicants class
        System.out.println("Running averageAbove85: " +Applicant2.averageAbove85());
        System.out.printf("Running atLeastFour85: %b\n", Applicant2.atLeastFour85());
        System.out.printf("Running noGradeBelow65: %b\n", Applicant2.noGradeBelow65());
        System.out.printf("Running upperLevelAbove85: %b\n", Applicant2.upperLevelAbove85());
        System.out.printf("Running atLeast3ExperienceYear: %b\n", Applicant2.atLeast3ExperienceYear());

        System.out.println();

        //If else to check applicant is selected or not (Custom Filter)
        if (Applicant2.averageAbove85() && Applicant2.atLeastFour85() && Applicant2.noGradeBelow65() && Applicant2.upperLevelAbove85() && Applicant2.atLeast3ExperienceYear()){
            System.out.println("Congratulations! You are selected!!!");
        }
        else{
            System.out.println("Rejected! Better luck next time");
        }

        System.out.println();

        //Test case 3
        System.out.println("For Applicant 3: Name- " + Applicant3.getName() + ", email- " + Applicant3.getEmail() + ", phone- " + Applicant3.getPhoneNumber()
                + " majoring in " + Applicant3.getMajor() + ", passed out in " + Applicant3.getPassYear() + " and has " + Applicant3.getExperienceYear() + " years of experience");

        //Prompt user to enter their grades
        System.out.println("Enter your grades:");
        System.out.print("1. CSC 210: Introduction to Computer Programming: ");
        grades[0] = input.nextInt();
        System.out.print("2. CSC 220: Data Structures: ");
        grades[1] = input.nextInt();
        System.out.print("3. CSC 340: Programming Methodology: ");
        grades[2] = input.nextInt();
        System.out.print("4. CSC 413: Software Development: ");
        grades[3] = input.nextInt();
        System.out.print("5. CSC 415: Operating Systems: ");
        grades[4] = input.nextInt();
        System.out.print("6. CSC 510: Analysis of Algorithms: ");
        grades[5] = input.nextInt();
        //Setter to set grades
        Applicant3.setGrades(grades);

        System.out.println();

        //Running all the method of applicants class
        System.out.println("Running averageAbove85: " +Applicant3.averageAbove85());
        System.out.printf("Running atLeastFour85: %b\n", Applicant3.atLeastFour85());
        System.out.printf("Running noGradeBelow65: %b\n", Applicant3.noGradeBelow65());
        System.out.printf("Running upperLevelAbove85: %b\n", Applicant3.upperLevelAbove85());
        System.out.printf("Running atLeast3ExperienceYear: %b\n", Applicant3.atLeast3ExperienceYear());

        System.out.println();

        //If else to check applicant is selected or not (Custom Filter)
        if (Applicant3.averageAbove85() && Applicant3.atLeastFour85() && Applicant3.noGradeBelow65() && Applicant3.upperLevelAbove85() && Applicant3.atLeast3ExperienceYear()){
            System.out.println("Congratulations! You are selected!!!");
        }
        else{
            System.out.println("Rejected! Better luck next time");
        }

    }
}
