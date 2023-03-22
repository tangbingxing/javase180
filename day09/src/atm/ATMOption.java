package atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMOption {
    //定义操作类，用于对账户的操作

    //集合
    private ArrayList<Account> accounts = new ArrayList<>();
    //键盘读取
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();

    //菜单 欢迎界面
    public void menu() {
        while (true) {
            System.out.println("===Welcome to ATM System===");
            System.out.println("1.login");
            System.out.println("2.create");
            System.out.println("3.Exit");
            System.out.println("Please choice:");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    //用户登录
                    login();
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                case 3:
                    //退出
                    return;
                default:
                    System.out.println("Your input was wrong");
                    break;
            }
        }
    }
    //快速开户测试类
//    public void createAccount(Account account){
//        accounts.add(account);
//    }

    //开户
    public void createAccount() {
        //创建账户对象
        Account account = new Account();

        //输入账户信息
        System.out.println("please input your name");
        String userName = sc.next();
        //判断两次密码是否一致，不一致则重新输入
        for (int i = 0; i < 3; i++) {
            System.out.println("please input your password");
            String passWord = sc.next();
            System.out.println("please check your password");
            String passWordConfig = sc.next();
            if(passWordConfig.equals(passWord)) {
                account.setPassWord(passWordConfig);
                break;
            } else {
                System.out.println("your password was wrong，please input again!you have loss" + "剩余 "+ (2-i) +" opportunity");
            }
        }
        System.out.println("please input your limit money");
        double limit = sc.nextDouble();

        //封装账户信息
        account.setUserName(userName);
        account.setLimit(limit);


        while (true) {
            //自动生成ID
            String CardId = CreateCardId();

            //判断ID是否唯一
            if (CheckByCardID(CardId) == null) {
                //不存在相同ID
                account.setCardId(CardId);
                break;
            }
            //否则存在相同ID，重新生成ID
        }

        System.out.println("你的账户ID为: " + account.getCardId());

        //存入集合
        accounts.add(account);
    }

    //随机生成ID卡号
    public String CreateCardId() {
        //定义一个空字符串，用于拼接卡号
        String CardId = "";
        for (int i = 0; i < 8; i++) {
            int c = r.nextInt(10);
            CardId += c;
        }
        return CardId;
    }

    //判断ID是否唯一
    public Account CheckByCardID(String cardId) {
        //遍历集合
        for (int i = 0; i < accounts.size(); i++) {
            //取出集合中的每个对象
            Account account = accounts.get(i);
            //用账户对象中的卡号与输入的卡号进行比较，相等则为 true
            boolean check = account.getCardId().equals(cardId);
            if (check) {
                //相等，ID存在
                System.out.println("ID check successful");
                return account;
            }
        }
        return null;
    }


    //登录
    public void login() {
        //判断集合里是否有账户
        if (accounts.size() == 0) {
            //没有，回到主界面，注册账户
            System.out.println("system is null,please create a account first!");
        } else {
            //有，进行下一步

            while (true) {
                //输入卡号
                System.out.println("please input you ID");
                String cardId = sc.next();
                //通过输入的卡号对比集合里的卡号，寻找是否有相等的
                for (int i = 0; i < accounts.size(); i++) {
                    //取出集合里的账户
                    Account account = accounts.get(i);
                    //比较用户输入的卡号和账户的卡号是否一致
                    if (cardId.equals(account.getCardId())) {
                        //卡号一致 确认密码
                        for (int i1 = 0 ; i1 < 3 ; i1++) {
                            System.out.println("please input your password");
                            String passWord = sc.next();

                            if (passWord.equals(account.getPassWord())) {
                                //密码正确 登录成功
                                System.out.println("you are successful login");
                                //登录成功，进入用户操作页面
                                userMenu(account);
                                return;
                            }
                            //密码错误
                            System.out.println("your password was wrong，please input again!you have loss"+ (2-i1) +"opportunity");
                        }
                        return;
                    }
                    //卡号错误,
                }
                //集合中无卡号
                System.out.println("please try again");
            }
        }
    }

    //用户操作界面
    public void userMenu(Account account) {
        while (true) {
            System.out.println("======user option system======");
            System.out.println("1.search By ID");
            System.out.println("2.deposit");
            System.out.println("3.draw");
            System.out.println("4.transfer");
            System.out.println("5.change password");
            System.out.println("6.exit");
            System.out.println("7.log off");
            System.out.println("please choice you want to:");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    //1.查询
                    searchById(account);
                    break;
                case 2:
                    //2.存款
                    deposit(account);
                    break;
                case 3:
                    draw(account);
                    //3.取款
                    break;
                case 4:
                    transferMoney(account);
                    //4.转账
                    break;
                case 5:
                    changePSW(account);
                    //5.更该密码
                    break;
                case 6:
                    //6.退出
                    signOut(account);
                    return;
                case 7:
                    //7.注销帐户
                    return;
                default:
                    System.out.println("your input was wrong,please input again!");
            }
        }
    }

    // 转账 transferMoney
    public void transferMoney(Account account) {
        System.out.println("please input id you want transfer");
        String otherAccountId = sc.next();
        //判断另一个账户是否存在
        Account account2 = CheckByCardID(otherAccountId);
        if(account2 != null) {
            //进行转账操作
            System.out.println(account2.getCardId());
            System.out.println("please input transfer money");
            int money = sc.nextInt();
            //转账方的余额减去转账金额
            //收款方的余额要加上转账金额
            account.setMoney(account.getMoney() - money);
            account2.setMoney(account2.getMoney() + money);

        } else {
            System.out.println("input ID is null,please input again");
            return;
        }

    }

    // 取款  draw
    public void draw(Account account) {
        System.out.println("please input draw money");
        //可对取款金额进行校验
        int money = sc.nextInt();
        account.setMoney(account.getMoney() - money);
    }

    // 存款 deposit
    public void deposit(Account account) {
        System.out.println("please input your deposit money");
        //可以对存款的金额进行校验
        int money = sc.nextInt();
        account.setMoney(money + account.getMoney());
    }

    // 查询 searchById
    public void searchById(Account account) {
        //显示账户除了密码的所有信息
        System.out.println("CardID\t"+ account.getCardId() +" name\t"+account.getUserName()+
                            " money\t"+account.getMoney()+" limit\t" + account.getLimit());
    }

    //修改密码
    public void changePSW(Account account) {

        //判断原密码是否正确
        for (int i1 = 0 ; i1 < 3 ; i1++) {
            System.out.println("please input your password");
            String passWord = sc.next();
            if (passWord.equals(account.getPassWord())) {
                //密码正确 更改新密码
                for (int i =0 ; i < 3; i++) {
                    System.out.println("please input your new password");
                    String chaPSW= sc.next();
                    System.out.println("please input your new password again");
                    String chaPSW2 = sc.next();
                    if (chaPSW2 == chaPSW) {
                        //确认密码
                        account.setPassWord(chaPSW2);//更改密码
                        System.out.println("change successful,please login");
                        return;//退出方法
                    } else {
                        System.out.println("please input again");
                    }
                }
            }
            //密码错误
            System.out.println("your password was wrong!you have lose"+ (2-i1) +"opportunity");
        }
    }


    // 销户  log off
    public void logOff(Account account) {
        System.out.println("are you sure want to exit(y/n)");
        String choose = sc.next();
        if("y".equals(choose)) {
            System.out.println("log off your account");
        } else {
            System.out.println("continue");
            userMenu(account);
        }
    }

    // 退出  sign out
    public void signOut(Account account) {
        System.out.println("are you sure want to exit(y/n)");
        String choose = sc.next();
        if("y".equals(choose)) {
            System.out.println("exit successful,welcome next time!");
        } else {
            System.out.println("continue");
            userMenu(account);
        }
    }
}
