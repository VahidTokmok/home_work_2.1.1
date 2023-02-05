import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(1,11);
    }

    public final String getInfo(){
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }
}
