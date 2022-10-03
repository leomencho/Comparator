import java.util.HashSet;
import java.util.Set;

public class ProbandoHash {

	public static void main(String[] args) {
		
		
		String[] numeros = {"uno", "tres", "dos", "cinco", "uno", "ocho", "ocho", "cinco"};
		
		Set<String> numerosUnicos = new HashSet<>();
		Set <String> numerosRepetidoSet = new HashSet<>();
		
		for (String num: numeros) {
			if(!numerosUnicos.add(num)) {
				//System.out.println("el repetido es: "+ num);
				numerosRepetidoSet.add(num);
			}
		}
		//System.out.println("La cantidad de:" + numerosUnicos.size()+ " elementos unicos \n Los elementos son: " + numerosUnicos );
		numerosUnicos.removeAll(numerosRepetidoSet);
		
		System.out.println("sin repetir: " + numerosUnicos);
		System.out.println(" los repetidos son: "+ numerosRepetidoSet);
	}

}
