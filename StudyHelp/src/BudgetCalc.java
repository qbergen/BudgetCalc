import java.util.Scanner;

/**
 * Created by queenabergen on 11/24/16.
 */
public class BudgetCalc {
    private int daysAtSchool;
    private String leftOvers;
    private int daysonNewarkTrain;
    private int daysOnweekendBus;
    private double livingAllowance;
    private String response;


    public void findTotalCost() {
        livingAllowance();
        getDaysForWork();
        getDaysForSchool();
        getNumberOfWeekends();
        doYouHaveLeftOvers();


    }

//    public int getDays(){
//        livingAllowance();
//        getDaysForWork();
//        getDaysForSchool();
//        getNumberOfWeekends();
//        return
//    }

    public double livingAllowance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much did you make this week ?");
        livingAllowance = scanner.nextDouble();
        return livingAllowance;
    }

    public int getDaysForSchool() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days do you have day classes ?");
        daysAtSchool = scanner.nextInt();
        return daysAtSchool;
    }

    public double getDaysForWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days do you have work this week ?");
        daysonNewarkTrain = scanner.nextInt();
        return daysonNewarkTrain;

    }

    public double getNumberOfWeekends() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days this weekend do you have class ?");
        daysOnweekendBus = scanner.nextInt();
        return daysOnweekendBus;
    }

    public double getPriceForNYC(double daysAtSchool) {
        double schoolPrice = 2.75 + 5.50 + 11.10;
        double totalNYCPrice = schoolPrice * daysAtSchool;

        return totalNYCPrice;
    }


    public double getPriceForNewarkTrain(double daysonNewarkTrain) {
        double pricePerNewarkTrain = 9.75;
        double totalNewarkPrice = pricePerNewarkTrain * daysonNewarkTrain;
        return totalNewarkPrice;
    }

    public double getPriceForWeekends(double daysOnweekendBus) {
        double pricePerWeekend = 21.44;
        double totalWeekendPrice = pricePerWeekend * daysOnweekendBus;
        return totalWeekendPrice;
    }

    public void doYouHaveLeftOvers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have current trips that could be used ?");
        leftOvers = scanner.nextLine();
        if (leftOvers.equalsIgnoreCase("yes")) {


        } else if (leftOvers.equalsIgnoreCase("no")) {
            getTotalPrice(getPriceForNewarkTrain(daysonNewarkTrain),
                    getPriceForNYC(daysAtSchool),
                    getPriceForWeekends(daysOnweekendBus));
        } else {
            System.out.println("Invalid response");
        }
    }

    public int leftOverTrips() {
        int numberleft = 3;
        return numberleft;
    }

    public void getTotalPrice(double totalWeekendPrice, double totalNewarkPrice, double totalNYCPrice) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = totalNewarkPrice + totalNYCPrice + totalWeekendPrice;
        System.out.println("Your total cost this week is " + totalPrice);
        System.out.println("Is the information you gave the same for next week too ?");
        response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            double twoWeekTotal = totalPrice * 2;
            double completeTotal = livingAllowance - twoWeekTotal;
            System.out.println("Cool so your price for the next two weeks is " + twoWeekTotal );
            System.out.println("Minus your living allowance you have " + completeTotal);
        } else if (response.equalsIgnoreCase("no")) {
            getTotalPrice(totalWeekendPrice, totalNewarkPrice, totalNYCPrice);
            System.out.println("Then this is your total " + totalPrice);
        }

    }


}
