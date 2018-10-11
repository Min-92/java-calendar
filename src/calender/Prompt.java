package calender;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT="cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calender calender = new Calender();
		
		int year = 2000;
		int month = 12;
		
		while(true) {
			System.out.println("연도를 입력하세요");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> "); 
			month = scanner.nextInt();
			
			if(month == -1) {
				break;
			}
			
			if(month > 12) {
				continue;
			}
			calender.printSampleOfCalender(year,month);
		}
		System.out.println("Done.");
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		//셀실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
