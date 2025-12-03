package sec02.exam02;

import java.util.*;

public class CalendarExample {

	public static void main(String[] args) {
	
		Calendar now = Calendar.getInstance();
		
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_MONTH);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break; default:
				strWeek = "일" ;
		}
				int amPm = now.get(Calendar.AM_PM);
				String strAmPm = null;
				
				if(amPm == Calendar.AM) {
					strAmPm = "오전";
				} else {
					strAmPm = "오후";
				}
				
				int hour = now.get(Calendar.HOUR);
				int minute = now.get(Calendar.MINUTE);
				int second = now.get(Calendar.SECOND);
				
				System.out.print(year + "y ");
					System.out.print (month + "");
					System. out.println(day + "일");
					System.out.print(strWeek + "9g ");
					System.out.println(strAmPm + " ");
					System.out.print(hour + "1 ");
					System. out.print(minute + "# ");
					System. out.println(second + "* ");
		}
	
		

	}
