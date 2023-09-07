public class Main {
    public static void main(String[] args) {
        Pet objectA = new Pet(3, "Fluffy", EnumColor.BLACK);
        Dog objectA2 = new Dog(8, "Picasso", EnumColor.BROWN);
        Cat objectB = new Cat(2, "Whiskers", EnumColor.GRAY);
        Cat objectC = new Cat(1, "Snowball", EnumColor.WHITE);

        System.out.println("Object A:");
        System.out.println("Age: " + objectA.getAge());
        System.out.println("Name: " + objectA.getName());
        System.out.println("Color: " + objectA.getColor().getEnumColor());
        objectA.makeVoice("Rrrrrrrrrr");
        objectA.play("ball");

        System.out.println("\nObject A2:");
        System.out.println("Age: " + objectA2.getAge());
        System.out.println("Name: " + objectA2.getName());
        System.out.println("Color: " + objectA2.getColor().getEnumColor());
        objectA2.makeVoice();
        objectA2.eat();

        System.out.println("\nObject B:");
        System.out.println("Age: " + objectB.getAge());
        System.out.println("Name: " + objectB.getName());
        System.out.println("Color: " + objectB.getColor().getEnumColor());
        objectB.play();

        System.out.println("\nObject C:");
        System.out.println("Age: " + objectC.getAge());
        System.out.println("Name: " + objectC.getName());
        System.out.println("Color: " + objectC.getColor().getEnumColor());
        objectB.makeVoice();
        objectC.eat();
    }
}
