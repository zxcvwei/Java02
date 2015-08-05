import java.util.Scanner;
public class if_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        System.out.println("請輸入傾角");
        float s = scn.nextFloat();
        System.out.println("請輸入兩輪軸心之軸距(cm)");
        float d = scn.nextFloat();
        System.out.println("請輸入輪胎尺寸(吋)");
        float sine = scn.nextFloat();
        if(s>43 && d>=130 && sine==12){
        	System.out.println("是");
        }else{
        	System.out.println("不是");
        }
        
	}

}
