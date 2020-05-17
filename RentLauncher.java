package CarRentSystem;

import java.util.Scanner;
public class RentLauncher {

    public static void main(String[] args) {
        CarInformation car = new CarInformation();
        User user =new User();
        DataConsequence data = new DataConsequence();
        Scanner a = new Scanner(System.in);
        DataEnsure en = new DataEnsure();

        int[] allId = new int[8];//用来记录用户选用的车的序号
        int[] allNum = new  int[8];//用来记录用户选用的车的数量
        int[] allDays =new  int[8];//用来记录用户选用车的天数


        //显示车辆信息
        System.out.println("车辆信息如下：");
        car.showCarInformation();


        //请用户进行租车
        System.out.println("请您开始租车");
        System.out.println("请输入您想租用的车的序号和租用该车的数量及天数");
        for(int i = 0; i < 8; i++)
        {
            allId[i] = a.nextInt();
            allNum[i] = user.rentNum();
            allDays[i] = user.rentDays();
            System.out.println("是否想继续租用，YES（输入1），No（输入0）");
            int flag = a.nextInt();
            if(flag == 0)
                break;
            else
                System.out.println("请继续输入车辆租用信息");
        }


        //请用户确认信息 并提交
        System.out.println("请确认你的租车信息");
        en.ensure(allId,allNum,allDays);
        System.out.println("确认 输入1，如果出错请退出程序重来");
        int flag = a.nextInt();
        if(flag == 1) {
            data.countData(allId,allNum,allDays);
            data.showConsequence(allId,allNum,allDays);
        }

        System.out.println("请输入Enter结束程序");
        String s = a.next();
        char c = s.charAt(0);
        if(c == '\n') {
            System.exit(0);
        }
    }
}
