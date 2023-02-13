public class Main {
    public static void main(String[] args) {
        int price = 210000;
        int bonus = 20;
        int miles;
        if (price < 0) {
            System.out.println(0);
        } else {
            miles = price / bonus;
            System.out.println("Количество миль составило:" + miles);

        }
    }
}
