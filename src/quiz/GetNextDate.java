package quiz;

import java.util.Date;


public class GetNextDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(getNextDay(date));
	}

	//先转换为毫秒计数，在转换回来
	static Date getNextDay(Date date){
		Long time = date.getTime();
		System.out.println(time);
		time = time + 60*60*24*1000;
		return new Date(time);
	}
}
