public class CircleWithStaticMembers {
    public double radius;

    public static int countOfCircles = 0;

    //Default constructor
    public CircleWithStaticMembers(){
//        radius = 1;
        setRadius(1);
        countOfCircles++;
    }

    //Non-default constructor
    public CircleWithStaticMembers(double r){
//        radius = r;
        setRadius(r);
        countOfCircles++;
    }

    //Methods that define the behavior of the object
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public static void main(String[] args){
        System.out.println("There is: " + countOfCircles + " circle right now.");

        CircleWithStaticMembers myCircle = new CircleWithStaticMembers();
        System.out.println("There is: " + countOfCircles + " circle right now.");
        System.out.println("The radius is: " + myCircle.getRadius());

        CircleWithStaticMembers myCircle2 = new CircleWithStaticMembers(4);
        System.out.println("There are: " + countOfCircles + " circles right now.");
        System.out.println("The radius of the second circle is: " + myCircle2.getRadius());

    }
}
