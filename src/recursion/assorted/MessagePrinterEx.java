package recursion.assorted;

public class MessagePrinterEx {
    public static void main(String[] args) {

        new MessagePrinterEx().printMessage("Sacrebleu", 10);

    }

    public void printMessage(String message, int times) {

        if (times >= 0) {
            System.out.println(message);
            printMessage(message, times - 1);
        }
    }
}
