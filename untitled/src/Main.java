public class Main {
    public static void main(String[] args) {
        printLine(5);
        int ggt = calculateGreatestCommonDividor(600, 136);
        int sequenceThingIdkTbh = findSpecificPartOfFibonacciSequence(7);
        System.out.println(ggt);
        System.out.println(sequenceThingIdkTbh);
    }

    private static int findSpecificPartOfFibonacciSequence(int locationInSequence) {
    return -1;
    }

    private static int calculateGreatestCommonDividor(int dividend1, int dividend2) {
        int greaterNumber = 0, smallerNumber = 0;
        if (dividend1 > dividend2) {
            greaterNumber = dividend1;
            smallerNumber = dividend2;
        } else {
            greaterNumber = dividend2;
            smallerNumber = dividend1;
        }
        int greaterNumberAdder = greaterNumber % smallerNumber;
        if (greaterNumberAdder != 0) {
            return calculateGreatestCommonDividor(smallerNumber, greaterNumberAdder);
        } else {
            return smallerNumber;
        }
    }


    private static void printLine(int amountOfStars) {
        if (amountOfStars == 0) {
            return;
        }
        for (int i = 0; i < amountOfStars; ++i) {
            System.out.print("*");
        }
        System.out.println();
        printLine(amountOfStars - 1);
    }
}