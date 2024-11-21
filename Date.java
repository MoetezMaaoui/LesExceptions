package EX3;
import java.util.Scanner;

public class Date {
	private int jour;
	private int mois;
	private int annee;

	public Date() throws jourinvalid ,MoisException {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer jour : ");
		  jour= sc.nextInt();
		if(jour<1 || jour>31)
			throw new jourinvalid();
		System.out.println("entrer mois : ");
		mois  = sc.nextInt();
		if(mois<1 || mois>12)
			throw new MoisException();
		
		System.out.println("entrer annee: ");
		annee  = sc.nextInt();
	
		
	}
	

	public static void main(String[] args) {
		try {
		Date d=new Date();
		System.out.println(d.jour+"/"+d.mois+"/"+d.annee);}
		catch(jourinvalid  e) {
			System.out.println(e.getMessage());
		}
		catch(MoisException e1) {
			System.out.println(e1.getMessage());
		}

		

}}
