import java.util.Scanner;
public class if_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        System.out.println("請輸入身高");
        float high = scn.nextFloat();
        System.out.println("請輸入體重");
        float weight = scn.nextFloat();
		if(weight<=45 && high>165){
			System.out.println("追");
		}else{
			System.out.println("否決");
		}
			
	}

}
