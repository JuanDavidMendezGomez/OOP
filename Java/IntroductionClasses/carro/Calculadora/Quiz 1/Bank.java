package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 0, "1");
    accountTwo = new CheckingAccount("Hades", 0, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(3000);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(2000);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(730);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(1200);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(3000);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(330);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(580);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(1000);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(2000);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(1460);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(420);
    System.out.println("Dinero de la cuenta Zeus: " + bankOfGods.accountOne.getBalance());
    
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.setBalance(2000);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.consignar(5000);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.consignar(20000);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.consignar(800);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.consignar(9000);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.consignar(724);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retirar(21000);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retirar(1500);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retirar(4060);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retirar(2950);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retirar(1520);
    System.out.println("Dinero de la cuenta Hades: " + bankOfGods.accountTwo.getBalance());
  }  
}
