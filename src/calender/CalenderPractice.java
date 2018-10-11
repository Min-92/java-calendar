package calender;

import java.util.Scanner;

public class CalenderPractice {

	private static final int[] maxDays = {31,28,31,30,31,30,31,30,31,31,30,31,30,31};

	public int getMaxDaysOfMonth(int month) {
		return maxDays[month-1];
	}

	public void printSampleOfCalender(int month) {
		System.out.println("<"+month+"월>");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("----------------------");
		int maxDay = getMaxDaysOfMonth(month);
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if (i%7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		//		System.out.println("  1  2  3  4  5  6  7");
//		System.out.println("  8  9 10 11 12 13 14");
//		System.out.println(" 15 16 17 18 19 20 21");
//		System.out.println(" 22 23 24 25 26 27 28");
//		if (month == 2) {
//			return;
//		} else if (month==4||month == 6||month == 9||month == 11) {
//			System.out.println(" 29 30");
//		}else {
//			System.out.println(" 29 30 31");
//		}
	}
	
	public static void main(String[] args) {

	
	
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
//		//기본
//		
//		CalenderPractice calender = new CalenderPractice();
//		
//		System.out.println("달을 입력해 주세요.");
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//
//		System.out.println(month+"월은"+calender.getMaxDaysOfMonth(month)+"일까지 있습니다.");
//		
//		scanner.close();
		
		
////		int[] maxDays = {31,28,31,30,31,30,31,30,31,31,30,31,30,31};
////	System.out.println(month+"월은"+maxDays[month-1]+"일까지 있습니다.");
		
		
		
		// if 문 이용
//		System.out.println("달을 입력해 주세요.");
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//		
//		if(month == 1|| month == 3|| month ==5 || month ==7|| month ==8|| month ==10|| month ==12) {
//			System.out.println(month+"월은 31일까지 있습니다.");
//		} else if(month == 2) {
//			System.out.println(month+"월은 28일까지 있습니다.");
//		} else {
//			System.out.println(month+"월은 30일까지 있습니다.");
//		}
//		
//		scanner.close();
//	
	
		//반복횟수 추가
		////직접실습내용
		
//		CalenderPractice calender = new CalenderPractice();
//		
//		System.out.println("반복횟수를 입력하세요");
//		Scanner scanner = new Scanner(System.in);
//		int cycle = scanner.nextInt();
//		
//		System.out.println("월을 입력하세요.");
//		
//		int [] month = new int[100]; 
//		for (int i = 1; i<=cycle; i++) {
//			month[i-1] = scanner.nextInt();
//		}
//		
//		for (int i = 1; i<=cycle; i++) {
//			System.out.println(month[i-1]+"월은"+calender.getMaxDaysOfMonth(month[i-1])+"까지 있습니다.");
//		}
//		
//		scanner.close();
//	
	
		//영상내용
		
//		Scanner scanner = new Scanner(System.in);
//		CalenderPractice calender = new CalenderPractice();
//		
//		System.out.println("반복횟수를 입력하세요");
//		int cycle = scanner.nextInt();
//		
//		for (int i = 0; i < cycle; i++) {
//			System.out.println("달을 입력하세요");
//			int month = scanner.nextInt();
//			
//			System.out.println(month+"월은"+calender.getMaxDaysOfMonth(month)+"까지 있습니다.");
//		}
//		System.out.println("Done.");
		
		
		
		//종료조건 이용하여 반복하기
		
		
		
//		String PROMPT="cal> ";
//		Scanner scanner = new Scanner(System.in);
//		CalenderPractice calender = new CalenderPractice();
//		
//		
//		while(true) {
//			System.out.println("달을 입력하세요");
//			System.out.print(PROMPT); 
//			int month = scanner.nextInt();
//			
//			if(month == -1) {
//				break;
//			}
//			
//			if(month > 12) {
//				continue;
//			}
//			System.out.println(month+"월은"+calender.getMaxDaysOfMonth(month)+"까지 있습니다.");
//		}
//		System.out.println("Done.");
	
		// 가상달력찍기
		//월을 입력하면 해당 월의 달력을 출력한다 
		//달력의 모양은 1단계에서 작성한 모양으로 만든다
		//1일은 일요일로 정해도 무방
		//-1을 입력받기 전까지 반복한다
		//프롬프트를 출력한다.
		
		
		//직접 실습 내용
//		CalenderPractice calender = new CalenderPractice();
//		Scanner scanner = new Scanner(System.in);
//		String PROMPT = "cal> ";
//		
//		
//		while(true) {
//			System.out.println("달을 입력하세요");
//			System.out.println(PROMPT);
//			
//			int month = scanner.nextInt();
//			if(month == -1) {
//				break;
//			}
//			if(month >12) {
//				continue;
//			}
//			calender.printSampleOfCalender(month);
//		}
//		
//		System.out.println("Done.");
//		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	}
}
