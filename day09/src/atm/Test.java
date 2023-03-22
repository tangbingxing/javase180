package atm;

public class Test {
    public static void main(String[] args) {
//        Account account1 = new Account("12345678","tom","123",5000,3000);
//        Account account2 = new Account("12345679","jack","123",1000,2000);
        ATMOption atmOption = new ATMOption();
//        atmOption.createAccount(account1);
//        atmOption.createAccount(account2);
//        atmOption.searchById(account1);
//        atmOption.searchById(account2);

//        atmOption.createAccount();  //通过
//        atmOption.login();  //通过

//        atmOption.transferMoney(account1);
        atmOption.menu();
    }
}
