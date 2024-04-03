package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    bankOfGods.accountOne.consignar(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(200);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(500);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setcdt(1000000);
    System.out.println(bankOfGods.accountOne.getMonthlyCdt());
    System.out.println(bankOfGods.accountOne.gananciaCdt(10));

   
  }
}
