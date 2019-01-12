package chapter2_2;

/**
 *
 * @author aaronyang
 */
public class PredatoryCreditCard extends CreditCard {
    private double apr;
    
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double newApr){
        super(cust, bk, acnt, lim);
        apr = newApr;
    }
    
    public void processMonth(){
        if(balance > 0){
            double monthlyFactor = Math.pow(1 + apr, 1.0/12);
            balance *= monthlyFactor;
        }
    }
    
    // Overriding the charge method defined in the superclass

    /**
     *
     * @param price
     * @return
     */
    @Override
    public boolean charge(double price){
        boolean isSuccess = super.charge(price);
        if(!isSuccess)
            balance += 5;
        return isSuccess;
    }
    
}
