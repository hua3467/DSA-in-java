/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2_2;

/**
 *
 * @author aaronyang
 */
public class CreditCard {
    
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }
    
    public CreditCard(String cust, String bk, String acnt, int lim){
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
    }
    
    //Accessor methods:
    public String getCustomer(){
        return customer;
    }
    public String getBank(){
        return bank;
    }
    public String getAccount(){
        return account;
    }
    public int getLimit(){
        return limit;
    }
    public double getBalance(){
        return balance;
    }
    // Update methods:
    public boolean charge(double price){
        if(price + balance > limit)
            return false;
        // at this point, the charege is successful
        balance += price;
        return true;   
    }
    public void makePayment(double amount){
        balance -= amount;
    }
    // Utility method to print a card's information
    public static void printSummary(CreditCard card){
        System.out.println("Customer: " + card.customer);
        System.out.println("Bank: " + card.bank);
        System.out.println("Account: " + card.account);
        System.out.println("Balance: " + card.balance);
        System.out.println("Limit: " + card.limit);
    }
    
    
    public static void main(String[] args){
        CreditCard[]wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", 
                "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", 
                "3341 0365 2487 5389", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Fiance", 
                "5391 0375 9387 5309", 300);
        
        for(int val = 1; val <= 16; val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);   
        }
        
        for(CreditCard card : wallet){
            CreditCard.printSummary(card);
            while(card.getBalance() > 200.0){
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
    
}
