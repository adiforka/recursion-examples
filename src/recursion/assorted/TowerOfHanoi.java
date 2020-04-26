package recursion.assorted;

public class TowerOfHanoi {
    public static void main(String[] args) {

        moveDisks(4, 'A', 'B', 'C');

    }

    //prints instructions on how to solve the Hanoi Tower. this really is a printing exercise
    static void moveDisks(int n, char fromTower, char toTower, char auxTower) {

        if (n == 1) System.out.println("Move " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
