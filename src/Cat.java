public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(int foodValue) {
        if (!satiety) {
            System.out.printf("%s голоден и решил поесть.\n", name);
            if (foodValue < appetite) {
                System.out.printf("В тарелке не хватает еды. %s остался голодным. Сытость = %b.\n", name, satiety);
            } else {
                satiety = true;
                System.out.printf("%s поел и больше не голоден. Сытость = %b.\n", name, satiety);
            }
        }
    }
}
