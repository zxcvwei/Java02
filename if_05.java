import java.util.Scanner;
public class if_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        System.out.println("�п�J�ɨ�");
        float s = scn.nextFloat();
        System.out.println("�п�J����b�ߤ��b�Z(cm)");
        float d = scn.nextFloat();
        System.out.println("�п�J���L�ؤo(�T)");
        float sine = scn.nextFloat();
        if(s>43 && d>=130 && sine==12){
        	System.out.println("�O");
        }else{
        	System.out.println("���O");
        }
        
	}

}
