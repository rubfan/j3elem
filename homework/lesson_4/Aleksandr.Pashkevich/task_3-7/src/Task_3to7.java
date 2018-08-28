public class Task_3to7{

	public static void main (String[] args){
		try{
			int task = Integer.parseInt(args[0]);
			switch (task){
				case 3:minAll(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
					break;
				case 4: division (Integer.parseInt(args[1]));
                                        break;
				case 5: isDivide (Integer.parseInt(args[1]), Integer.parseInt(args[2]));
					break;
				case 6: nearestTo10(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
					break;
//				case 7:
				default: System.out.println("ERROR. Check the value (from 3 to 7)");
			}

		}catch(Exception e){
			System.out.println("ERROR: Task_3to7 <number of taski <value>");
		}

	}
	private static void minAll(int vol1, int vol2, int vol3){
	int numberOfSame = 1;
	int min = vol1;
	int items[] = {vol1, vol2, vol3};
	for (int i=1; i<3; i++){
		if (items[i]<min){
			min = items[i];
	}else if (items[i] == min){
			numberOfSame++;
		}

	}
	for (int i=0; i<numberOfSame;i++){
		System.out.println(i+": " +min);
	}
        }
	private static void division(int value){
		if (value%2 == 0){
			System.out.println(value + ": even");
		}else{  System.out.println(value + ": not even");

                }                     
        }
	private static void isDivide(int vol1, int vol2){
		int value = vol1%vol2;
                  if (value == 0){
			System.out.println(vol1+ " / " +vol2 + ": without heel.");
		  }else{
			System.out.println(vol1+ " / " + vol2 + ": with heel.");
			}

	}
	private static void nearestTo10(int vol1, int vol2){
		int value1 = Math.abs(vol1 - 10);
		int value2 = Math.abs(vol2 - 10);
		if (value2>value1){
                  System.out.println(vol1 + " is closer to 10.");
		} else if (value1>value2){
		  System.out.println(vol2 + " is closer to 10.");	
			}else{
				System.out.println(vol1 + " = " + vol2);
			     }
	}
} 
