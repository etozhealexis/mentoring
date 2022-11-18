public class CreditCalculator {
    static final String business = "business";
    static final String human = "human";

    public static void checkType(String type) throws Exception {

        if (!type.equals(business) && !type.equals(human)) {
            throw new Exception("Invalid type");
        }
    }

    public static void checkValues(CreditData creditData) throws Exception {

        if (CreditData.getSum() <= 0
                || (creditData.getSum() * creditData.getPercent() / 100 > creditData.getMonth() * 12 && creditData.getType().equals(human))
                || ((creditData.getSum() - creditData.getPercent() * 12) * creditData.getPercent() / 100 > creditData.getMonth() * 12 && creditData.getType().equals(business))
                || creditData.getPercent() <= 0) {
            throw new Exception("Invalid values");
        }
    }

    public double calculateOverpayment(CreditData creditData) throws Exception {
        float ans = 0;
        float sum = creditData.getSum();
        float sum1 = sum;

        checkValues(creditData);
        checkType(creditData.getType());

        if (creditData.getType().equals(business)) {
            sum -= creditData.getPercent() * 12;
        }


        while (sum > 0) {
            sum *= 1 + creditData.getPercent() / 100;
            ans += sum - sum1;
            sum -= creditData.getMonth() * 12;
            sum1 = sum;
        }

        return ans;
    }

}
