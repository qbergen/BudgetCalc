import java.util.Scanner;

/**
 * Created by queenabergen on 11/26/16.
 */
public class SubwayValue {

    private int roundTripLeftover;
    private int singleTripLeftover;
    private double valueLeftover;

    public void SubwayValue(String userResponse) {
        if (userResponse.equalsIgnoreCase("A")) {
            evaluatePricePerValue();
        } else if (userResponse.equalsIgnoreCase("B")) {
            evaluatePriceSingleTrip();
        } else if (userResponse.equalsIgnoreCase("C")) {
            evaluatePricePerRoundTrip();
        }

    }

    private int evaluatePricePerRoundTrip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many roundtrips do you have ?");
        roundTripLeftover = scanner.nextInt();

        return roundTripLeftover;
    }

    private int evaluatePriceSingleTrip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many single trips do you have ?");
        singleTripLeftover = scanner.nextInt();
        moreLeftOversLoop();
        return singleTripLeftover;
    }

    private void moreLeftOversLoop() {
    }


    private void evaluatePricePerValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of your MetroCard");
        valueLeftover = scanner.nextDouble();
        double pricePerTrip = 2.75;
        
    }
}
