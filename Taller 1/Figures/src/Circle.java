public class Circle extends Figure
{
	
	private float radius;

	private final float lowLim=1;
	private final float highLim=20;
	private final float defVal=1;
	
	
	public Circle(){
		this.radius=this.defVal;
	}
	
	public Circle(float r){
		if(r<this.lowLim || r>this.highLim){
			System.out.println(
				"Radius "+r+" is outside boundaries ["+
				this.lowLim+","+this.highLim+"].");
			System.out.println(
				"Switching to default value: "+
				this.defVal);
			this.radius=this.defVal;
		}else{this.radius=r;}
		
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float r) {
		if(r<this.lowLim || r>this.highLim){
			System.out.println(
				"Radius "+r+" is outside boundaries ["+
				this.lowLim+","+this.highLim+"].");
		}else{this.radius=r;}
	}

	@Override
	public float getPerimeter()
	{
		return 2*(float)Math.PI*this.radius;
	}

	@Override
	public float getArea()
	{
		return (float) Math.PI*this.radius*this.radius;
	}
}
