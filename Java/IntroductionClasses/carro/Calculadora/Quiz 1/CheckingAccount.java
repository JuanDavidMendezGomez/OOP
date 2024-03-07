package bank;

public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
 

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    
        
  }
public int getBalance(){
    return this.balance;
  }

public void setBalance(int newBalance){
    this.balance = newBalance;
  }

public void consignar(int valorConsignado){
    balance = balance + valorConsignado;
} 

public void retirar(int valorRetirado){
    balance = balance - valorRetirado;
}

}