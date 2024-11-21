package EX2;


public class Factorielle {

	public static void main(String[] args) {
		try {
		int i, nbEntiers=0, factorielle=1; int ancien;

		nbEntiers= Integer.parseInt(args[0]);
		if(nbEntiers<0) {
			throw new nbrNegative();
		}
		for (i=2;i<= nbEntiers;i++){
			ancien=factorielle; factorielle *= i;
		}				
		System.out.println("Voila la factorielle des "+ nbEntiers +" premiers entiers : "+ factorielle );
		}
		catch(nbrNegative err) {
			System.out.println(err.mesErr());
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException err2) {
			System.out.println("La base de la factorielle doit être ENTIERE");
		}
		/*catch(ArrayIndexOutOfBoundsException err2) {
			System.out.println("La base de la factorielle doit être ENTIERE");
		}*/
		
	}
	
	}




