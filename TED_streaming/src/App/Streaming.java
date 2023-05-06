package App;

import entidades.Usuario;
import entidades.Video;

public class Streaming {
	public static void main (String[] args)  {
		
		try {
			
		Video v = new Video("Guerra sem fim", "Robert","Ação", "muita aventura e ação" );
		Video v2 = new Video("Guerra sem fim 02", "Robert","Ação", "muita aventura e ação em dobro" );
		Usuario u = new Usuario("Ricardo","ricardo@1123.com","secreta");
		Usuario u2 = new Usuario("Richard","richard@1123.com","não_posso_dizer");
		u.adicionarFavorito("Guerra sem fim");
		u2.adicionarFavorito("Guerra sem fim 02");
		u2.adicionarFavorito("Guerra sem fim 01");
		
		System.out.println(  u2.getFavoritos());}
	 
		catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
		}
	
	}

}
