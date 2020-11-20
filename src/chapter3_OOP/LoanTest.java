package chapter3_OOP;

import java.text.DecimalFormat;
import java.util.Scanner;

//测试 Loan类
public class LoanTest {
    public static void main(String[] args) {
        double interestrate, loanvalue; //定义贷款利率和贷款金额
        int loanpreiod; //贷款年限
        Scanner in = new Scanner(System.in);
        System.out.println("请输入贷款利率:");
       interestrate =  in.nextDouble();
        System.out.println("请输入贷款年限:");
        loanpreiod =  in.nextInt();
        System.out.println("请输入贷款总额:");
        loanvalue = in.nextDouble();
        Loan loan1 = new Loan(interestrate,loanpreiod,loanvalue);
        //创建DecimalFormat对象,控制输出时小鼠的位数.
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("等额本息情况下的月均还款额为:"+loan1.getMonthlyPayment()+"￥");
        System.out.println("贷款"+loanpreiod+"年的总还款金额为："+loan1.getTotalPayment()+"￥");
    }
}
/* DecimalFormat 类使用方法
import java.text.DecimalFormat;

public class TestNumberFormat{
　　public static void main(String[]args){
　　　　double pi = 3.1415927;　//圆周率
　　　　//取一位整数
　　　　System.out.println(new DecimalFormat("0").format(pi));　　　//3
　　　　//取一位整数和两位小数
　　　　System.out.println(new DecimalFormat("0.00").format(pi));　//3.14
　　　　//取两位整数和三位小数，整数不足部分以0填补。
　　　　System.out.println(new DecimalFormat("00.000").format(pi));// 03.142
　　　　//取所有整数部分
　　　　System.out.println(new DecimalFormat("#").format(pi));　　　//3
　　　　//以百分比方式计数，并取两位小数
　　　　System.out.println(new DecimalFormat("#.##%").format(pi));　//314.16%
　　 　 long c =299792458;　　//光速
　　　　//显示为科学计数法，并取五位小数
　　　　System.out.println(new DecimalFormat("#.#####E0").format(c));　//2.99792E8
　　　　//显示为两位整数的科学计数法，并取四位小数
　　　　System.out.println(new DecimalFormat("00.####E0").format(c));　//29.9792E7
　　　　//每三位以逗号进行分隔。
　　　　System.out.println(new DecimalFormat(",###").format(c));　　　//299,792,458
　　　　//将格式嵌入文本
　　　　System.out.println(new DecimalFormat("光速大小为每秒,###米。").format(c));

　　}

}
 */