import java.util.Scanner;
public class if_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        System.out.println("�п�J���A��");
        int n1 = scn.nextInt();
        System.out.println("�п�J���B��");
        int n2 = scn.nextInt();
        System.out.println("�A�n�����B��O+,-,*,/");
        String str=scn.next();
        if(str.equals("+")){
        	int n3=n1+n2;
        	System.out.println(n3);
        }else{
        	
        	if(str.equals("-")){
        		int n4=n1-n2;
            	System.out.println(n4);
        	}else{
        		if(str.equals("*")){
            		int n5=n1*n2;
                	System.out.println(n5);
        		}else{
        			str.equals("/");
        			int n6=n1/n2;
                	System.out.println(n6);
        		}
        	}	
        }
	}

}
