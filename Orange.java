package Lesson4_homework;

public class Orange extends Fruct {
    public Orange() {
        super(1.5F);
    }

    @Override
    public Float getWeight() {
        return super.getWeight();
    }
    public String getName(){
        return String.format("Orange, %.2f",this.getWeight());
    }
        @Override
    public String toString() {
        return String.format("Orange, weigth -,%.2f",getWeight());
    }
}
