package main;

public class Actividad_Git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		
		// User 1 fer la suma dels elements de sumArray (Alexis)
		
		int sum = 0;
		for (int num : sumArray) {
		    sum += num;
		}
		System.out.println("La suma dels elements de sumArray és: " + sum);
		
		// User 2 fer la resta dels elements de subArray (Marc)
		
        int result = subArray[0];
        for (int i = 1; i < subArray.length; i++) {
            result -= subArray[i];
        }
        System.out.println("El resultado de la resta es: " + result);
		
		
		// User 3 fer la multiplicació dels elements de prodArray (Pol)
		
        int resultado = 1;

        for (int i = 0; i < prodArray.length; i++) {
            resultado *= prodArray[i];
        }
        System.out.println("El resultado de la multiplicación de los elementos del array es: " + resultado);
	}

}
