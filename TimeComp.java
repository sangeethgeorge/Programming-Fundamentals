import java.util.Scanner;

public class TimeComp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Time in seconds: ");
		int time = scan.nextInt();
		int hours = time/3600;
		int minutes = (time/60) - (hours * 60);
		int seconds = time - (minutes*60 + hours*3600);
		
		System.out.print(hours + " hours, "+minutes+ " minutes, "+seconds+ " seconds." );
}
}

