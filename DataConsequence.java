package CarRentSystem;

import com.sun.deploy.security.SelectableSecurityManager;

public class DataConsequence {
    double allPeopleCaring = 0,allObjectCaring = 0;
    int allCost = 0 ,allDays = 0 ,allCars = 0 ;//用来记录总数据

    public void countData(int[] id ,int[] num ,int[] days){
        CarInformation a = new CarInformation();//用来访问车辆数据

        for (int i=0 ; i< id.length ;i++ ) {//对租车序号循环，将总量算出；
            if (id[i] > 0){
              allPeopleCaring = allPeopleCaring + a.peopleCaring[id[i]-1]*num[i];
              allObjectCaring = allObjectCaring + a.objectCaring[id[i]-1]*num[i];
              allCost = allCost +a.cost[id[i]-1]*num[i];
              allCars = allCars + num[i];
              allDays = allDays + days[i];

            }
            else
                break;
        }
    }

    public void showConsequence(int[] id, int[] num ,int[] days){
        CarInformation a = new CarInformation();//用来访问车辆数据

        System.out.println("以下为您的租用单，请查收");
        System.out.println("    总体租车最大载人量"+allPeopleCaring);
        System.out.println("    总体租车最大载货量"+allObjectCaring);
        System.out.println("    总租车费用"+allCost);
        System.out.println("    总租车天数"+allDays);
        System.out.println("    总租车数量"+allCars);
        System.out.println("各个车辆的租用信息");
        System.out.println("车辆序号"+"  名称"+"  费用"+"  最大载人"+"  最大载货");

        for (int i = 0 ; i< id.length ; i++) {
            if(id[i] > 0)
            System.out.println(id[i]+"   "+a.name[id[i]-1]+"   "+a.cost[id[i]-1]*num[i]+"   "+a.peopleCaring[id[i]-1]*num[i]+"   "+a.objectCaring[id[i]-1]*num[i]);
            else
                break;
        }
    }
}
