public class Employee {

    //Data fields
    int employeeID;
    String name;
    String email;
    String jobTitle;

    //Default constructor
    public Employee() {
        setEmployeeID(0);
        setName("Unknown");
        setEmail("Unknown");
        setJobTitle("Unknown");
    }

    //Constructor with id and name as parameter
    public Employee(int employeeID, String name) {
        setEmployeeID(employeeID);
        setName(name);
    }

    //Getter and setter for data fields mentioned above
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //toString method to return the details
    public String toString(){
        return "The id of employee is: " + employeeID + ", name is: " + name + ", email is: " + email + ", job title is: " + jobTitle;
    }

    //enrollHealthPlan method to print the line given
    public String enrollHealthPlan(){
        return "Enrolled in a basic health plan";
    }

}
