package practice;

public class Chapter18_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//郵便番号の正規表現
		String yubinbango = "\\{3}-\\{4}";
		//070、080、090で始まる携帯電話の番号
		String mobilePhoneNumber = "0{789}0-\\{4}-\\{4} ";
		//時刻（24時間表記）
		String zikan24 = "([01]\\d|2[0123]):[0-5]\\d";
		
		//郵便番号の出力
		String yubin1 = "300-3063";
		String yubin2 = "1-2";
		System.out.println(yubin1 + "=" + yubin1.matches(yubinbango));
		System.out.println(yubin2 + "=" + yubin2.matches(yubinbango));	
		
		//携帯番号の出力
		String mobile1 = "000-3063-6330";
		String mobile2 = "090-11-11";
		String mobile3 = "090-1111-2222";
		System.out.println(mobile1 + "=" + mobile1.matches(mobilePhoneNumber));
		System.out.println(mobile2 + "=" + mobile2.matches(mobilePhoneNumber));
		System.out.println(mobile3 + "=" + mobile3.matches(mobilePhoneNumber));
		
		//時刻の出力
		String time1 = "12:24";
		String time2 = "3:24";
		String time3 = "03:65";
		System.out.println(time1 + "=" + time1.matches(zikan24));
		System.out.println(time2 + "=" + time2.matches(zikan24));
		System.out.println(time3 + "=" + time3.matches(zikan24));
	}

}
