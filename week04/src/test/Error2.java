package test;

public class Error2 {
	public static void main(String[] args) {
		int sum=0;
		double avg=0.0;
		
		try{
			sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
			avg=sum/2.0;
			
			System.out.println("Total : "+sum);
			System.out.println("Average : "+avg);

		}
/*
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
*/
		catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
	}

}