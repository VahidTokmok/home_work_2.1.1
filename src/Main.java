public class Main {
    public static void main(String[] args) {

        String[] commands = {"Лежать, сидеть"};
        Shelter shelter1 = new Shelter("Sun", "Lenina 1");
        Shelter shelter2 = new Shelter("Moon", "Slobodka 1");

        Dog dog1 = new Dog("Rex", "Ovcharka", commands, Color.BROWN, shelter1);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();

        Dog dog2 = new Dog("Rob", "Labrador", Color.WHITE, shelter2);
        System.out.println(dog2.getInfo());
        dog2.makeVoice("вав вав");

        Dog dog3 = new Dog("Bob", "Pudel", Color.GREY, shelter1);
        System.out.println(dog3.getInfo());
        dog3.makeVoice("wow wow" + 5);
    }
}