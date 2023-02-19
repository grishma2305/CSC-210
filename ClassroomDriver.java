public class ClassroomDriver {
    public static void main (String[] args) {
        System.out.println("----Creating Classrooms----");
        Classroom room1 = new Classroom(129, 40);
        Classroom room2 = new Classroom(204, 45);
        Classroom room3 = new Classroom(331, 40);
        Classroom room4 = new Classroom(422, 45);
        Classroom room5 = new Classroom(507, 40);
        System.out.println("Total of classrooms created: " +
                Classroom.getClassroomCount());
        System.out.println("\n----Creating 1D Array to Store Classrooms----");
        Classroom[] array = new Classroom[Classroom.getClassroomCount()];
        array[0] = room1;
        array[1] = room2;
        array[2] = room3;
        array[3] = room4;
        array[4] = room5;
        System.out.println("Size of array is: " + array.length + "\n");
        System.out.println("----Printing Out Classroom Info----");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Classroom " + (i+1) + " Room Number is: " +
                    array[i].getRoomNum());
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Classroom " + (i+1) + " Capacity is: " +
                    array[i].getCapacity());
        }
        System.out.println("\n----Fixing Classroom Info----");
        room1.setCapacity(35);
        room4.setRoomNum(433);
        System.out.println("Classroom 1 New Capacity is: " +
                array[0].getCapacity());
        System.out.println("Classroom 4 New Room Number is: " +
                array[3].getRoomNum());
        System.out.println("\n----Thank You----");
    }
}