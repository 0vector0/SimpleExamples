package examplesKharkovITCourses;


public class BubleSortInverted {

	static void printArray(int mass[]) {
		//System.out.println(mass);
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mass = new int[20];

		int[] mass1 = new int[20];
		int[] mass2 = new int[20];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 10 - 5);
		}
		System.out.println("mass");
		printArray(mass);
		for (int i = 0; i < mass.length; i++) {
			mass1[i] = mass[i];
			mass2[i] = mass[i];

		}
				
		//System.out.println("Сортировка 1");
		int count = 0;
		for (int i = 0; i < mass1.length - 1; i++) {
			for (int j = 0; j < mass1.length - 1 - i; j++) {
				if (mass1[j] > mass1[j + 1]) {
					int tmp = mass1[j];
					mass1[j] = mass1[j + 1];
					mass1[j + 1] = tmp;

				}
				count++;
			}

		}
		//System.out.println("Сортировка mass1");
		//printArray(mass1);
		
		for (int i = mass2.length-1; i > 0; i--) {
			//System.out.print(mass[i] + ", ");
			for (int j = mass2.length-1; j > 0; j--) {
				if (mass2[j] < mass2[j - 1]) {
					int tmp = mass2[j];
					mass2[j] = mass2[j - 1];
					mass2[j - 1] = tmp;
				}
			}
		}
		System.out.println("Сортировка mass2");
		printArray(mass2);
		
	}

}
