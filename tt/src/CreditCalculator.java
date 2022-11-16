public class CreditCalculator extends CreditData{

    public CreditCalculator(float sum, float month, float percent, String type) {
        super(sum, month, percent, type);
    }

    public void checkType() throws Exception {
        final String business = "business";
        final String human = "human";

        if (!getType().equals(business) && !getType().equals(human)) {
            System.out.println(getType());
            throw new Exception("Invalid type");
        }
    }

    public void checkConditions() throws Exception {
        final String business = "business";
        final String human = "human";

        if (getSum() <= 0
                || (getSum() * getPercent() / 100 > getMonth() * 12 && getType().equals(human))
                || ((getSum() - getMonth() * 12) * getPercent() / 100 > getMonth() * 12 && getType().equals(business))
                || getPercent() <= 0) {
            throw new Exception("Invalid values");
        }
    }

    public float findAns() throws Exception {
        float ans = 0;
        final String business = "business";
        final String human = "human";

        checkConditions();
        checkType();

        if (getType().equals(business)) {

            sum -= month * 12;

            float s1 = sum;

            while (sum > 0) {
                sum *= 1.1;
                ans += sum - s1;
                sum -= month * 12;
                s1 = sum;
            }
            return ans;
        }

        if (getType().equals(human)) {
            float s1 = getSum();

            while (sum > 0) {
                sum *= 1.1;
                ans += sum - s1;
                sum -= month * 12;
                s1 = sum;
            }
            return ans;
        }
        return 0;
    }
}
