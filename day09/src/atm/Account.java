package atm;

public class Account {
    //�˻��࣬���������û��˻�
    private String cardId;//�û��Ŀ���
    private String userName;//�û�������
    private String passWord;//�û�������
    private double money;//�û��˻����
    private double limit;//�û��ĵ����޶�

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
