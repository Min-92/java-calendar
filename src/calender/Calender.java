package calender;

import java.util.Scanner;

public class Calender {

	private static final int[] maxDays = {31,28,31,30,31,30,31,30,31,31,30,31,30,31};

	public int getMaxDaysOfMonth(int month) {
		return maxDays[month-1];
	}

	public void printSampleOfCalender() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("----------------------");
		System.out.println("  1  2  3  4  5  6  7");
		System.out.println("  8  9 10 11 12 13 14");
		System.out.println(" 15 16 17 18 19 20 21");
		System.out.println(" 22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {

	
	
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
//		//기본
//		
//		Calender calender = new Calender();
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
		
//		Calender calender = new Calender();
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
		
		Scanner scanner = new Scanner(System.in);
		Calender calender = new Calender();
		
		System.out.println("반복횟수를 입력하세요");
		int cycle = scanner.nextInt();
		
		for (int i = 0; i < cycle; i++) {
			System.out.println("달을 입력하세요");
			int month = scanner.nextInt();
			
			System.out.println(month+"월은"+calender.getMaxDaysOfMonth(month)+"까지 있습니다.");
		}
		System.out.println("Done.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		String PROMPT="cal> ";
//		Scanner scanner = new Scanner(System.in);
//		Calender calender = new Calender();
//		
//		System.out.println("반복횟수를 입력하세요");
//		int cycle = scanner.nextInt();
//		
//		for (int i = 0; i < cycle; i++) {
//			System.out.println("달을 입력하세요");
//			System.out.print(PROMPT); 
//			int month = 
//		}
//		
//		
		
	
	
	
	
	
	
	
	
	}
}
