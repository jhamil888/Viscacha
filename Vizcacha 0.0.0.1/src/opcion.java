import java.util.Scanner;
public class opcion{

    static int opcioncita=0;
	static Scanner jus=new Scanner(System.in);
	public opcion(String []list){
		boolean retorno=false;
		int it=0;
		opcioncita=list.length;
		while(it<list.length){
			System.out.printf("%n%d:%s",it,list[it]);
			it++;
		}
		System.out.println("");
		int eleg=0;
		//aqui puse un string que recibe del usuario por que hay un bug de iteracion infinita
		String n=jus.nextLine();
		try{
		eleg=Integer.parseInt(n);
		if(eleg>=opcioncita){
		throw new Exception(":v");

		}
		decid llo=new decid(eleg);
		}
		catch (Exception ex){
			System.out.println("por favor ingrese un numero valido");
			retorno=true;
			
		}
		if(retorno){
		String [] o=new String[3];
		Viscacha lop=new Viscacha();
		lop.main(o);
		}
	}
	
}