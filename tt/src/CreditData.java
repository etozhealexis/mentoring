public class CreditData {
    public static float sum;
    public static float month;
    public static float percent;
    public static String type;

    public CreditData(float sum, float month, float percent, String type) {
        CreditData.sum = sum;
        CreditData.month = month;
        CreditData.percent = percent;
        CreditData.type = type;
    }

    public float getSum() {
        return CreditData.sum;
    }

    public float getMonth() {
        return CreditData.month;
    }

    public float getPercent() {
        return CreditData.percent;
    }

    public String getType() {
        return CreditData.type;
    }


}
