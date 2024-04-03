package bank;

public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  private double cdtRate;
  private double cdt;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
    this.cdtRate = 0.07;
    
  }

  public int getBalance(){
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
 
public void consignar(int valorConsignado){
    balance = balance + valorConsignado;
} 
public void retirar(int valorRetirado){
    balance = balance - valorRetirado;
}
public double setcdt(int valorCdt){
    cdt = valorCdt;
    return this.cdt;
}
public double getMonthlyCdt(){
    return this.cdtRate * this.cdt;
}
public double gananciaCdt(int meses){
    return (this.cdtRate * this.cdt) * meses;
}
}
