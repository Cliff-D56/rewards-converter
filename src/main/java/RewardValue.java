public class RewardValue {
    private double cash;
    private float miles;

    public double getCash() {
        return cash;
    }

    public float getMiles() {
        return miles;
    }

    RewardValue(double cash){
        this.cash = cash;
    }
    RewardValue(float miles){
        this.miles = miles;
    }
    public double getCashValue(){
        return miles * .0035;
    }
    public float getMilesValue(){
        return (float) (cash / .0035);
    }
}
