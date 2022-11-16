public class Client {
    private static float sum;
    private static float month;
    private static float percent;
    private static String type;

    public Client(float sum, float month, float percent, String type) {
        Client.sum = sum;
        Client.month = month;
        Client.percent = percent;
        Client.type = type;
    }

    public int checkType() throws Exception {
        if (getType().equals("business")) {
            return 1;
        }
        if (getType().equals("human")) {
            return 2;
        }
        throw new Exception("Invalid type");
    }

    public void checkConditions() throws Exception {
        if (getSum() <= 0
                || (getSum() * getPercent() / 100 > getMonth() * 12 && checkType() == 2)
                || ((getSum() - getMonth() * 12) * getPercent() / 100 > getMonth() * 12 && checkType() == 1)
                || getPercent() <= 0) {
            throw new Exception("Invalid values");
        }
    }

    public float findAns() throws Exception {
        float ans = 0;

        checkConditions();

        if (this.checkType() == 1) {

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

        if (this.checkType() == 2) {
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

    public float getSum() {
        return Client.sum;
    }

    public float getMonth() {
        return Client.month;
    }

    public float getPercent() {
        return Client.percent;
    }

    public String getType() {
        return Client.type;
    }


}
