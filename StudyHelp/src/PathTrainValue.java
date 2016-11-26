/**
 * Created by queenabergen on 11/26/16.
 */
public class PathTrainValue {
    public void PathTrainValue(String userResponse){
        if (userResponse.equalsIgnoreCase("A")) {
            evaluatePricePerValue();
        } else if (userResponse.equalsIgnoreCase("B")) {
            evaluatePriceSingleTrip();
        } else if (userResponse.equalsIgnoreCase("C")) {
            evaluatePricePerRoundTrip();
        }
    }

    private void evaluatePricePerRoundTrip() {

    }

    private void evaluatePriceSingleTrip() {

    }

    private void evaluatePricePerValue() {

    }
}
