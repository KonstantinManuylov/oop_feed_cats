

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("RedOne", 10),
                new Cat("Jester", 15),
                new Cat("Frosiya", 10),
                new Cat("Purrka", 20),
                new Cat("Puzatik", 50)
        };
        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(plate.getFood());
                plate.setFood(countFood(cat.getAppetite(), plate.getFood()));
                plate.info();
                if (plate.getFood() <= 10) {
                    plate.setFood(20);
                    System.out.println("В тарелку добавили еды.");
                    plate.info();
                }
            }
        }
    }

    static public int countFood(int appetite, int foodValue) {
        if (appetite < foodValue) {
            return foodValue - appetite;
        }
        return foodValue;
    }
}