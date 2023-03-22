package atm;

public class Account {
    //账户类，用于生成用户账户
    private String cardId;//用户的卡号
    private String userName;//用户的名称
    private String passWord;//用户的密码
    private double money;//用户账户余额
    private double limit;//用户的单次限额

    //

    public Account() {
    }

    public Account(String cardId, String userName, String passWord, double money, double limit) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        this.money = money;
        this.limit = limit;
    }

    //

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
