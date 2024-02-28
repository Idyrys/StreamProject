import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый :");

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5,25);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        System.out.println("Числа, больше 10:");
        Arrays.stream(array)
                .filter(num -> num > 10)
                .forEach(System.out::println);

        System.out.println("Второй :");

        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(8.9,"black","Apple"));
        phones.add(new Phone(7.9,"red","Samsung"));
        phones.add(new Phone(5.9,"black","Samsung"));
        phones.add(new Phone(4.5,"red","Apple"));
        phones.add(new Phone(5.5,"Yellow","Xiaomi"));
        phones.add(new Phone(10,"Blue","HONOR"));
        phones.add(new Phone(7,"Blue","HUAWEI"));
        phones.add(new Phone(9.5,"Yellow","HUAWEI"));
        phones.add(new Phone(3.9,"Orange","Xiaomi"));
        phones.add(new Phone(2.9,"Orange","HONOR"));

        List<Tablet> tablets = phones.stream()
                .filter(phone ->phone.getDisplay() > 7.0)
                .map(phone -> new Tablet(phone.getDisplay(),"Samsung"))
                .toList();

        System.out.println("Список объектов класса Tablet:");
        for (Tablet tablet : tablets) {
            System.out.println(tablet.getDisplay() + ", " + tablet.getMark() + ", " + tablet.getColor());
        }
    }
}