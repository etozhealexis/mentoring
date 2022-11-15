public class Client {
    private static float sum;
    private static float month;
    private static float percent;
    private static String type;

    public Client(float sum, float month, float percent, String type){
        Client.sum = sum;
        Client.month = month;
        Client.percent = percent;
        Client.type = type;
    }

    public int checkType(){
        if (getType().equals(" business")){
            return 1;
        }
        if (getType().equals(" human")){
            return 2;
        }
        return 3;
    }

    public int checkConditions(){
        if (getSum() <= 0 || (getSum() * getPercent() / 100 > getMonth() * 12 && checkType() == 2)
                || ((getSum() - getMonth() * 12) * getPercent() / 100 > getMonth() * 12 && checkType() == 1) || getPercent() <= 0){
            return 3;
        }
        return 0;
    }

    public float findAns() throws Exception{
        float ans = 0;
        float s = getSum();
        float m = getMonth();
        float p = getPercent();
        if (this.checkType() == 3 || this.checkConditions() == 3){
            throw new Exception("throws Exception");
        }
        if (this.checkType() == 1){
            s -= m*12;
            float s1 = s;
            while (s > 0){
                s *= 1.1;
                ans += s - s1;
                s -= m * 12;
                s1 = s;
            }
            return ans;
        }
        if (this.checkType() == 2){
            float s1 = getSum();
            while (s > 0){
                s *= 1.1;
                ans += s - s1;
                s -= m * 12;
                s1 = s;
            }
            return ans;
        }
        return 0;
    }

    public float getSum() {
        return Client.sum;
    }

    public float getMonth(){
        return Client.month;
    }

    public float getPercent(){
        return Client.percent;
    }

    public String getType(){
        return Client.type;
    }


}