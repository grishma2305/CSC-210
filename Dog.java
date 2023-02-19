public class Dog extends Pet{
    String breed;
    String name;
    int age;
    String color;

    public Dog() {
        super("Dog");
        anyLegalRestrictions = false;
        this.name = "Unknown";
    }

    public Dog(String petType, String breed, String name, int age) {
        super("Dog");
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "They are " + petType + " and has name: " + name + ", age: " + age + ", breed: " + breed + ", legal restriction: " + anyLegalRestrictions;
    }

    @Override
    public String ownerAttitude(){
        return super.ownerAttitude() + "Also constantly boasts that they have the best pet!";
    }

}
