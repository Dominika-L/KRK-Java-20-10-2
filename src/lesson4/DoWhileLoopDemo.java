package lesson4;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int maxPressure = 4;
        int currentPressure = 0;
        do {
            System.out.println("=================================");
            System.out.println("Current pressure: " + currentPressure);
            System.out.println("Max pressure: " + maxPressure);
            System.out.println("Pomp 1 atm more");
            currentPressure++;
        } while (currentPressure < maxPressure);

        System.out.println("Rim been pomp. Current pressure: " + currentPressure);
    }
}
