import java.util.ArrayList;

public class MisMetodos {
	static ArrayList<String> BuscadorCodigo (ArrayList<String> codigos,String buscado){
	/*
	 * ingresas un string y te debuelbe todos los strings de codigoque contienen esa secuancia
	 */
		ArrayList <String>respuesta =new ArrayList<String>();
	
		for(int  contador4=0;contador4!=codigos.size();contador4++){
			respuesta.add(codigos.get(contador4));
		}
		
		for(int contador=0;contador!=buscado.length();contador++){
			
			for(int contador3 =0;contador3!=respuesta.size();contador3++){
				codigos.set(contador3, respuesta.get(contador3));
			}
			
			respuesta.clear();
			
			for(int contador2=0;contador2!=codigos.size();contador2++){
				
				if( ( ( codigos.get(contador2) .substring(0,contador+1) ) .equals( buscado.substring(0,contador+1) ) ) ){	
					respuesta.add(codigos.get(contador2));
				}
				
			}
		}
		System.out.println("RESPUESTA"+respuesta);
		System.out.println("CODIGOS"+codigos);
		
		return respuesta;
		
	}
}