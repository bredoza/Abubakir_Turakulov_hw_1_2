final public class Dog extends Pet {
    public Dog(int age, String name, EnumColor enumColor) {
        super(age, name, enumColor);
    }

    @Override
    public void makeVoice() {
        System.out.println("Dog is gavkaet");
    }
}
