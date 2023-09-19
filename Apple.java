package Lesson4_homework;

public class Apple extends Fruct{
    public Apple() {
        super(1F);
    }

    public String getName(){
        return String.format("Apple, %.2f",this.getWeight());
    }

    @Override
    public String toString() {
        return String.format("Apple, weight - %.2f",getWeight());
    }
}
