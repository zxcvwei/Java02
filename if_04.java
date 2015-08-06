import java.util.Scanner;
public class if_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入生日(Ex:921,1223)");
		System.out.println("若生日為101~119,請在生日日期後補0至五位數");
		System.out.println("Ex:10100,11000,11900...等");
		int b = scn.nextInt();
		if(b>=321 && b<=420){
			System.out.println("牡羊座:只愛自己最重要");
		}else{
			if(b>=421 && b<=521){
				System.out.println("金牛座:帶給自己和別人安全感");
			}else{
				if(b>=522 && b<=621){
					System.out.println("雙子座:溝通技巧");
				}else{
					if(b>=622 && b<=723){
						System.out.println("巨蟹座:母性的關懷");
					}else{
						if(b>=724 && b<=823){
							System.out.println("獅子座:有目標有自信");
						}else{
							if(b>=824 && b<=923){
								System.out.println("處女座:細心體貼與實際");
							}else{
								if(b>=924 && b<=1023){
									System.out.println("天秤座:讓大家相處平穩顧及到每一個人");
								}else{
									if(b>=1024 && b<=1122){
										System.out.println("天蠍座:神秘的魅力");
									}else{
										if(b>=1123 && b<=1221){
											System.out.println("射手座:有點二的樂觀態度");
										}else{
											if(b>=1222 && b<=11900){
												System.out.println("摩羯座:成熟及社會經驗的豐富");
											}else{
												if(b>=120 && b<=219){
													System.out.println("水瓶座:特殊想法還有與眾不同的行為");
												}else{
													if(b>=220 && b<=320){
														System.out.println("雙魚座:心地善良，天真可愛");
													}else{
														System.out.print("查無此星座，請重新閱讀說明。");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
			
		}

	}

}

