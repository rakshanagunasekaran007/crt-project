public class UPIPaymentStrategy implements PaymentStrategy {
    public double calculate(double amount){
        return amount*0.98;
    }

    public String getName(){
        return "UPI (2% discount)";
    }
}
