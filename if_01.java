import java.util.Scanner;
public class if_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        System.out.println("�п�J���A��");
        int n1 = scn.nextInt();
        System.out.println("�п�J���B��");
        int n2 = scn.nextInt();
        if(n1>n2){
        	System.out.println(n1+">"+n2);
        }else{
        	if(n1==n2){
        		System.out.println(n1+"="+n2);
        	}else{
        		System.out.println(n1+"<"+n2);
        	}
        }
        
	}

}
