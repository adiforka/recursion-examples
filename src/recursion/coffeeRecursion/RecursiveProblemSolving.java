package recursion.coffeeRecursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveProblemSolving {
    public static void main(String[] args) {

        drinkCoffee(new Cup(20));

    }

    //drinking a cup of coffee
    static void drinkCoffee(Cup cup) {
        if (!cup.isEmpty()) {
            cup.takeOneSip();
            System.out.println("took a sip ");
            drinkCoffee(cup);
        } else System.out.println("And now the cup is empty");
    }
}

class Cup {
    private final int cupSize;
    private final List<Integer> listOfSips;

    public Cup(int cupSize) {
        listOfSips = new ArrayList<>();
        this.cupSize = cupSize;
        initCup(cupSize);
    }

    public void initCup(int size) {
        for (int i = 0; i < size; i++) {
            listOfSips.add(i + 1);
        }
    }

    public void takeOneSip() {
        listOfSips.remove(listOfSips.size() - 1);
    }

    public boolean isEmpty() {
        return listOfSips.isEmpty();
    }
}
