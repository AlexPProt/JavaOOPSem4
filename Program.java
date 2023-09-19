package Lesson4_homework;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList<Fruct> basket = new ArrayList<>();

        ArrayList<Box> boxes = new ArrayList<>();

        int countBoxAppleIndex=0;
        int countBoxOrangeIndex=1;

        boxes.add(new Box<Apple>());
        boxes.add(new Box<Orange>());

        System.out.println(boxes);

        //гененрируем корзину с фруктами
        Random random = new Random();
        int checkFruct;
        for (int i = 0; i < 30; i++) {
            checkFruct = random.nextInt(0, 2);
            if (checkFruct == 1)
                basket.add(new Apple());
            else
                basket.add(new Orange());
        }

        //Сортируем с корзины по коробкам
        //Если вес коробки превышает 11 кг, создаем новую
        for (Fruct fructs:basket) {
            if (fructs instanceof Apple) {
                if (boxes.get(countBoxAppleIndex).addFruct(fructs)==false){
                    boxes.add(new Box<Apple>());
                    countBoxAppleIndex=boxes.size()-1;
                    boxes.get(countBoxAppleIndex).addFruct(fructs);
                }
            }
            else {
                if (boxes.get(countBoxOrangeIndex).addFruct(fructs)==false){
                    boxes.add(new Box<Orange>());
                    countBoxOrangeIndex=boxes.size()-1;
                    boxes.get(countBoxOrangeIndex).addFruct(fructs);
                }
            }
        }
        // Итоги сортировки
        for (int i = 0; i < boxes.size(); i++) {
            System.out.printf( "Коробка весом- "+ boxes.get(i).getCountWeigth()+"кг.  "+boxes.get(i).toString() + "\n");

        }

        //Сравнение коробок по весу
        boxes.get(0).compareTo(boxes.get(1));



    }
}
