import java.util.Scanner;
public class if_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        System.out.println("�п�J����");
        float high = scn.nextFloat();
        System.out.println("�п�J�魫");
        float weight = scn.nextFloat();
		if(weight<=45 && high>165){
			System.out.println("�l");
		}else{
			System.out.println("�_�M");
		}
			
	}

}
