public class Task_3to7{

	public static void main (String[] args){
		try{
			int task = Integer.parseInt(args[0]);
			switch (task){
				case 3:minAll();
				case 4:
				case 5:
				case 6:
				case 7:
				default: System.out.println("ERROR. Check the value (from 3 to 7);
			}



		}catch(IOException e){
			System.out.println("ERROR: Task_3to7 <number of task> <value>);
		}



	}
	private void maxAll(){
	numberOfSame = 1;
	int min = Integer.parseInt(args[0]);;
	for (int i=1; i<3; i++){
		if (Integer.parseInt(args[i])<min{
			min = Integer.parseInt(args[i]);
	}else if (Integer.parseInt(args[i] == min{
			munberOfSame++;
		}

	}
	for (int i=0; i<numberofsame;i++){
		System.out.println(i+": " +min);
	}
} 
