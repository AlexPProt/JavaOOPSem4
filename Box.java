package Lesson4_homework;

import java.util.ArrayList;
public class Box <T extends Fruct>{
    private ArrayList<T> fructs;

    public Box() {
        this.fructs = new ArrayList<>();
    }

    //Добавление фруктов в коробку
    public boolean addFruct (T fruct){
        if (this.getMaxWeigth()> this.countWeigth+fruct.getWeight()){
            fructs.add(fruct);
            countWeigth+=fruct.getWeight();
            return true;
        }
        else {
            System.out.println("Коробка заполена, достаем новую");
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("fructs="   + fructs);
    }

    // максимальный вес корбоки
    private final int maxWeigth=11;
    public int getMaxWeigth() {
        return maxWeigth;
    }

    //текущий вес коробки
    protected Float countWeigth=0F;
    public Float getCountWeigth() {
        return countWeigth;
    }
    // Сравнение коробок
    public int compareTo (Box o){
        int resWeigth = countWeigth.compareTo(o.countWeigth);
        if (resWeigth ==0) {
            System.out.println("Коробки равны по всеу");
            return countWeigth.compareTo(o.countWeigth);
        }
        if (resWeigth==1)
            System.out.println("Коробка 1 тяжелее коробки 2");
        else
            System.out.println("Коробка 1 легче коробки 2");

        return resWeigth;
    }



    ////
    ////Перегрузка фруктов
    ////
    public void shiftFructs(ArrayList boxFrom,ArrayList boxTo){
        if (boxFrom.get(0)==boxTo.get(0) || boxTo.get(0)==null){
            for (int i = 0; i < boxFrom.size(); i++) {
                boxTo.add(boxFrom.get(boxFrom.size()-1));
                boxFrom.remove(boxFrom.get(boxFrom.size()-1));

            }
        }
    }
}
