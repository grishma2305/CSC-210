public class Diary {
    public static void main(String[] args) {

        for(int week=1; week<=3; week++){
            System.out.println("Week " + week);
            for(int day=1; day<=5; day++){
                System.out.println("\t Day " + day + ":");
            }
            System.out.println(".......");
        }
    }
}
