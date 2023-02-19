/*
 * Project : Project 6
 * Description: Applicants Class
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

//Applicants Class
public class Applicants {

    //Declaration of data fields
    private String name;
    private String email;
    private int phoneNumber;
    private String major;
    private int experienceYear;
    private int[] grades;
    private int passYear;

    //Default constructor
    public Applicants(){
        name = " ";
        email = "";
        phoneNumber = 0;
        major = " ";
        experienceYear = 0;
        grades = new int[]{};
        passYear = 0;
    }

    //2nd Constructor
    public Applicants(String name, String email, int phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    //3rd Constructor
    public Applicants(String major, int experienceYear, int passYear){
        this.major = major;
        this.experienceYear = experienceYear;
        this.passYear = passYear;

    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for pass year
    public int getPassYear() {
        return passYear;
    }

    //Setter for pass year
    public void setPassYear(int passYear) {
        this.passYear = passYear;
    }

    //Getter for email
    public String getEmail() {
        return email;
    }

    //Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    //Getter for phone number
    public int getPhoneNumber() {
        return phoneNumber;
    }

    //Setter for phone number
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Getter for major
    public String getMajor() {
        return major;
    }

    //Setter for major
    public void setMajor(String major) {
        this.major = major;
    }

    //Getter for experience year
    public int getExperienceYear() {
        return experienceYear;
    }

    //Setter for experience year
    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    //Getter for grades
//    public int[] getGrades() {
//        return grades;
//    }

    //Setter for grades
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    //AverageAbove85 method to calculate the average and check condition
    public boolean averageAbove85 () {
        int total = 0;
        //Enhanced for to iterate through array and add its values to total
        for (int grade : grades) {
            total += grade;
        }
        //Calculating the average
        total = total / grades.length;

        //If else to check the given condition
        if (total >= 85){
            return true;
        }
        else{
            return false;
        }
    }

    //noGradeBelow65 method to ensure that no grade is below 65
    public boolean noGradeBelow65 (){
        //Enhanced for iterate through entire grades array
        for (int grade : grades) {
            //If to check condition and thereby return its value
            if (grade < 65) {
                return false;
            }
        }
        return true;
    }

    //atLeastFour85 method to check that at least 4 grades are above 85
    public boolean atLeastFour85(){
        //variable to count the times when grade is above 85
        int countOf85 = 0;
        //Enhanced for iterate through entire grades array
        for (int grade : grades) {
            //If statement to check grade above 85 and add one to countOf85
            if (grade >= 85) {
                countOf85++;
            }
        }
        //If else to check whether at least 4 grades are above 85 and return accordingly
        if (countOf85 >= 4){
            return true;
        }
        else {
            return false;
        }
    }

    //upperLevelAbove85 to see if average
    public boolean upperLevelAbove85 (){
        //Variable to calculate the average
        int total = 0;
        //Enhanced for iterate through entire grades array and its value to total
        for (int i = 3; i < grades.length; i++){
            total += grades[i];
        }
        //Calculating the average
        total = total / (grades.length - 3);

        //If else to check whether average is greater than 85 or not and return accordingly
        if (total >= 85){
            return true;
        }
        else {
            return false;
        }
    }

    //atLeast3ExperienceYear method
    public boolean atLeast3ExperienceYear () {
        //If else to check the experience of applicants and return accordingly
        if (experienceYear >= 3) {
            return true;
        }
        else {
            return false;
        }
    }
}
