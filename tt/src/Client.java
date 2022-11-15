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
                || (getSum() * getPercent() / 100 > getMonth() * 12 * 2 && checkType() == 1) || getPercent() <= 0){
            return 3;
        }
        return 0;
    }

    public float findAns() throws Exception{
        int ans = 0;
        if (this.checkType() == 3 || this.checkConditions() == 3){
            throw new Exception("throws Exception");
        }
        if (this.checkType() == 1){
            return 1;
        }
        if (this.checkType() == 2){
            while (sum > 0){ // !!!!!
                sum *= 1.1;
                sum -= month;

            }
            return 2;
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
