public class CreditData {
    static float sum;
    static float month;
    static float percent;
    private static String type;

    public CreditData(float sum, float month, float percent, String type) {
        CreditData.sum = sum;
        CreditData.month = month;
        CreditData.percent = percent;
        CreditData.type = type;
    }

    public float calculateAns() throws Exception {
        return CreditCalculator.findAns();
    }

    public static float getSum() {
        return CreditData.sum;
    }

    public static float getMonth() {
        return CreditData.month;
    }

    public static float getPercent() {
        return CreditData.percent;
    }

    public static String getType() {
        return CreditData.type;
    }


}
