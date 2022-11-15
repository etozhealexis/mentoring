public class Client {
    private static float sum;
    private static float month;
    private static float percent;
    private static String type;

    public Client(float sum, float month, float percent, String type){
        this.sum = sum;
        this.month = month;
        this.percent = percent;
        this.type = type;
    }

    public int checkType(){
        if (type.equals(" business")){
            return 1;
        }
        if (type.equals(" human")){
            return 2;
        }
        else{
            return 3;
        }
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
