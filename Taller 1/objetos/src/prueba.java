
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejemplo de creacion de objetos
       balon mibalon=new balon();
       balonDeFutbol mibalondefutbol=new balonDeFutbol();
       balonBaloncesto mibalondebaloncesto=new balonBaloncesto();
       
       mibalon.getradio();
       mibalondefutbol.getradio();
       mibalondebaloncesto.getradio();
       
       mibalon.estaInflado();
       mibalondefutbol.estaInflado();
       mibalondebaloncesto.estaInflado();
       
       mibalon.inflar();
       mibalondefutbol.inflar();
       mibalondebaloncesto.inflar();
  
	}

}
