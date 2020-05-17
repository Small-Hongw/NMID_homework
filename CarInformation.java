package CarRentSystem;

public class CarInformation {
    String[] name = new String[]{"小轿车","面包车","大巴车","低栏车","高栏车","厢式车","日式皮卡车","美式皮卡车"};
    int [] cost = new int[]{40,65,180,30,47,80,60,60};
    double[] peopleCaring = new double[]{4,7,20,0,0,0,5,2};
    double[] objectCaring = new double[]{0,0,0,1.5,2.5,4.5,1,3};

    public void showCarInformation(){
        System.out.println("序号 车辆名称 租车费用（元/天） 最大载人（人） 最大载货（吨)");
        for(int i = 0 ; i < 8 ; i++)
            System.out.println(i+1+"  "+name[i]+"        "+cost[i]+"       "+peopleCaring[i]+"       "+objectCaring[i]);
    }
}
