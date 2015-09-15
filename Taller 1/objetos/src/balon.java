
public class balon {//clase balon en la que realizamos la descripcion de balon
	/////////////Se realiza la abstraccion de balon///////////
	
	private int radio;// ejemplo de atributo encapsulado
	private int peso;// ejemplo de atributo encapsulado
	private int presion;// ejemplo de atributo encapsulado
	private String color;// ejemplo de atributo encapsulado
	private String material;// ejemplo de atributo encapsulado
	private boolean inflado;// ejemplo de atributo encapsulado
	private boolean rodando;// ejemplo de atributo encapsulado
	
	public balon(){ // ejemplo de metodo en este caso constructor
		radio=-1;
		peso=-1;
		presion=-1;
		color="no definido";
		material="cuero sintetico";
		inflado=false;
		rodando=false;
	}
	// los siguientes son ejemplos de metodos getters y setters que trabajan con los atributos encapsulados
	public void setradio (int radio){
		this.radio=radio;
	}
    public String getradio(){
    	if(radio==-1)
    		return "no se a asignado radio";
    		return "el radio es: "+ radio +"cm";
   	}
    
	public void setpeso(int peso){
		this.peso=peso;
	}
    public String getpeso(){
    	if(peso==-1)
    		return "no se a asignado peso";
    		return "el peso es: "+ peso +"gramos";
   	}
    
	public void setpresion(int presion){
		this.presion=presion;
	}
    public String getpresion(){
    	if(presion==-1)
    		return "no se a asignado presion";
    		return "la presin es: "+ presion + " libras";
   	}
	public void setmaterial(String material){
		this.material=material;
	}
    public String getmaterial(){
            return material;
   	}
	public void setcolor(String color){
		this.color=color;
	}
    public String getcolor(){
            return color;
   	}
    
    public String estaInflado(){
    	if(inflado)
    		return "esta inflado";
    	return "no esta inflado";
    }
    public String inflar(){
    	if(inflado)
    		return "ya esta inflado";
    	else {
    		if(presion==-1)
    			return "asigne presion, no se ha podido inflar";
    		else {
    			inflado=true;
    			return "se ha inflado con presion de "+ presion +" libras";
    		}

    	}
    	
    }
    public void rodar(){
    	rodando=true;
    }
    public String estaRodando(){
    	if(rodando)
    		return "esta rodando";
    	return "no esta rodando";
    }
    
}
