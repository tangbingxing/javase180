package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;//导入Date包,实现获取当前日期功能
import java.util.Scanner;//导入Scanner包，实现读取用户输入功能

public class SmallChangeSysOOP {

    //将相关变量定义在最外层，方便其他层级的调用
    Scanner myScanner = new Scanner(System.in);
    //读取时间信息
    Date date = new Date();
    //用于时间格式设置
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    //定义do while 循环的控制变量
    boolean loop = true;
    //定义金额，用与记录当前收入或支出的金额
    double money = 0;
    //定义余额，用于记录零钱余额
    double balance = 0;
    //定义消费说明
    String note;
    //定义用户查询后显示的信息
    String details = "-----------------零钱通明细------------------";

    //定义mainMenu方法 用于显示界面
    public void mainMenu() {

        //用do ... while() 控制循环条件，为真一直循环，为假则跳出循环
        do {

            //显示菜单
            System.out.println("\n================零钱通菜单(OOP)===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.print("请选择(1-4): ");
            int key = myScanner.nextInt();

            //使用switch 分支控制判断用户选择的界面，并显示相应界面
            switch (key) {
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);
    }


    //定义一个 detail 方法，实现显示零钱明细功能
    public void detail() {
        System.out.println(details);
    }
    //定义一个 income方法，实现记录零钱入账功能
    public void income() {
        //记录收入金额
        System.out.println("收益入账金额:");
        money = myScanner.nextDouble();
        //校验入账金额，判断输入的金额是否合理
        if(money <= 0) {
            System.out.println("收入金额需大于0");
        //    退出方法,不执行后面的代码
            return;
        }
        //计算余额
        balance += money;
        //记录当前时间信息
        date = new Date();
        //拼接明细信息
        details +=  "\n收益入账\t+" + money +
                             "\t" + sdf.format(date) +
                             "\t" + balance;
    }

    //定义一个 pay 方法，实现记录零钱消费功能
    public void pay() {
        System.out.println("消费金额:");
        money = myScanner.nextDouble();
        //判断消费金额是否合理
        if(money <= 0 || money > balance) {
            System.out.println("你的消费金额 应该在 0-" + balance);
            return;
        }
        System.out.println("消费说明:");
        String note = myScanner.next();
        //double balance = 0;
        //  细节:未定义的变量不能直接使用
        balance -= money;
        date = new Date();
        details +=  "\n"  + note  +
                    "\t-" + money +
                    "\t"  + sdf.format(date) +
                    "\t"  + balance;

    }
    //定义一个 exit 方法，实现退出功能
    public void exit() {
        String choice;
        //判断是否真的退出
        while (true) {
            //确认用户输入为y 还是 n，y则退出， n则继续，其他则一直循环
            System.out.println("你确定要退出吗? y/n");
            choice = myScanner.next();
            //实现退出do while()循环功能，判断是否为y 或 n
            if("y".equals(choice) || "n".equals(choice)) {
                //退出循环，执行后面的语句
                break;
            }
        }
        if(choice.equals("y"))
        loop = false;
    }

}
