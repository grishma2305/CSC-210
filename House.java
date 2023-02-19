public class House {

    String address;
    double housePrice;
    double sizeInSquareFeet;
    int numberOfRooms;
    double numOfBathrooms;
    double[] sizeOfEachRoom;
    boolean hasGarage;
    boolean hasMold;
    int year;
    boolean sold;

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(double housePrice) {
        this.housePrice = housePrice;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(double numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }


    static int numOfHousesCreated = 0;

    public House(){
        address = "Here";
        numOfHousesCreated++;
    }

    public House(double price, String ad){
        address = ad;
        housePrice = price;
        numOfHousesCreated++;
    }

    public House(double price, String ad, int yearBuilt){
        address = ad;
        housePrice = price;
        year = yearBuilt;
        numOfHousesCreated++;
    }

    public void checkMold(){
        if (hasMold){
            System.out.println("WARNING! MOLD! MOLD! MOLD!!!");
        }
    }

    public void deMold(){
        hasMold = false;
        System.out.println("You are all good now!");
    }

    //Year
    public void setYear(int y){
        year = y;
    }

    public int getYear(){
        return year;
    }

    public void infectWithMold(){
        hasMold = true;
    }

    public static void main(String[] args){
        House potentialNewHouse = new House(600, "1600 Holloway Ave");

        potentialNewHouse.infectWithMold();
        potentialNewHouse.checkMold();

        if (potentialNewHouse.hasMold){
            potentialNewHouse.deMold();
        }

    }
}
