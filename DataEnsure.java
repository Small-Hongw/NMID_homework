package CarRentSystem;

public class DataEnsure {
    public void ensure(int[] ID , int[] num ,int[] days)
    {
        System.out.println("序号"+" 数量"+" 天数");
        for(int i = 0; i < ID.length ;i++) {
           System.out.println(ID[i]+" "+num[i]+" "+days[i]);
        }
    }
}
