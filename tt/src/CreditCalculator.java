public class CreditCalculator extends CreditData {
    static final String business = "business";
    static final String human = "human";

    public CreditCalculator(float sum, float month, float percent, String type) {
        super(sum, month, percent, type);
    }

    public static void checkType() throws Exception {

        if (!getType().equals(business) && !getType().equals(human)) {
            throw new Exception("Invalid type");
        }
    }

    public static void checkValues() throws Exception {

        if (getSum() <= 0
                || (getSum() * getPercent() / 100 > getMonth() * 12 && getType().equals(human))
                || ((getSum() - getMonth() * 12) * getPercent() / 100 > getMonth() * 12 && getType().equals(business))
                || getPercent() <= 0) {
            throw new Exception("Invalid values");
        }
    }

    public static float findAns() throws Exception {
        float ans = 0;

        checkValues();
        checkType();

        if (getType().equals(business)) {
            sum -= month * 12;
        }

        float s1 = sum;

        while (sum > 0) {
            sum *= 1 + percent / 100;
            ans += sum - s1;
            sum -= month * 12;
            s1 = sum;
        }

        return ans;
    }
}
