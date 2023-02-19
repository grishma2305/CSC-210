public class Faculty extends Employee{

    //Data fields
    String departmentName;
    int numberOfClassesTeaching;
    boolean isTenured;
    int yearAtSfsu;

    //Default constructor
    public Faculty() {
        super(0, "Unknown");
    }

    //Constructor with parameters
    public Faculty(String departmentName, int numberOfClassesTeaching, boolean isTenured) {
        super(0, "Unknown");
        setDepartmentName(departmentName);
        setNumberOfClassesTeaching(numberOfClassesTeaching);
        setTenured(isTenured);
    }

    //toString method to return the details
    public String toString(){
        return "The id of employee is: " + employeeID + ", name is: " + name + ", department name is: " + departmentName + ", is tenured: " + isTenured;
    }

    //Getter and setter for data fields of faculty class
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfClassesTeaching() {
        return numberOfClassesTeaching;
    }

    public void setNumberOfClassesTeaching(int numberOfClassesTeaching) {
        this.numberOfClassesTeaching = numberOfClassesTeaching;
    }

    public boolean isTenured() {
        return isTenured;
    }

    public void setTenured(boolean tenured) {
        isTenured = tenured;
    }

    public int getYearAtSfsu() {
        return yearAtSfsu;
    }

    public void setYearAtSfsu(int yearAtSfsu) {
        this.yearAtSfsu = yearAtSfsu;
    }

    //Override the enrollHealthPlan method
    @Override
    public String enrollHealthPlan(){
        return super.enrollHealthPlan() + " designed for desk-sitting employees!";
    }

}
