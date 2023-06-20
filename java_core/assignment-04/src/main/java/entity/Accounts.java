package entity;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

public class Accounts {
    private String id;
    private String name;
    private int balance;

    public Accounts(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void credit (int amount){
        this.balance += amount;
    }
    public void debit (int amount){

        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }
    public void transferto(Accounts accounts, int amount){
        if (this.balance >= amount) {
            this.balance -= amount;
            accounts.credit(amount);
        }
    }
}
