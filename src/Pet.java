public class Pet extends Animal {
    private String name;
    private Color color;

    public Pet(int age, String name, EnumColor enumColor) {
        super(age);
        this.name = name;
        this.color = new Color(enumColor);
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void makeVoice() {
        System.out.println("Animal make sound");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }

    final public void eat() {
        System.out.println(name + " is eating");
    }
}
