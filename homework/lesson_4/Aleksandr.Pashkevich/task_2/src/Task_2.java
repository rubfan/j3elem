public class Task_2{

	public static void main(String[] args){
		
		int max = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[0]);

			for (int i=1; i<3; i++){

				if (Integer.parseInt(args[i]) > max) {
					max = Integer.parseInt(args[i]);
				} 
				if (Integer.parseInt(args[i]) < min) {
					min = Integer.parseInt(args[i]);
				} 

			}
		System.out.println("max value: " + max);
		System.out.println("min value: " + min);



	}
}
