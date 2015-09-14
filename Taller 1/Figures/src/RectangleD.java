
public class RectangleD {
	private float width;
	private float height;

	private final float lowLim = 1;
	private final float highLim = 20;
	private final float defVal = 1;

	public RectangleD() {
		this.width = 1;
		this.height = 1;
	}

	public RectangleD(float w, float h) {
		if (w < this.lowLim || w > this.highLim) {
			System.out.println("Width " + w +
					" is outside boundaries [" + 
					this.lowLim + "," + this.highLim + "].");
			System.out.println("Switching to default value: " 
					+ this.defVal);
			this.width = this.defVal;
		} else {
			this.width = w;
		}

		if (h < this.lowLim || h > this.highLim) {
			System.out.println("Height " + h
					+ " is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
			System.out.println("Switching to default value: " + 
					this.defVal);
			this.height = this.defVal;
		} else {
			this.height = h;
		}
	}

	public void setWidth(float w) {
		if (w < this.lowLim || w > this.highLim) {
			System.out.println("Width " + w +
					" is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
		} else {
			this.width = w;
		}
	}

	public void setheight(float h) {
		if (h < this.lowLim || h > this.highLim) {
			System.out.println("Height " + h + 
					" is outside boundaries [" + 
					this.lowLim + "," + this.highLim + "].");
		} else {
			this.height = h;
		}
	}

	public float getWidth() {
		return this.width;
	}

	public float getHeight() {
		return this.height;
	}

	public float getArea() {
		return this.width * this.height;
	}

	public float getPerimeter() {
		return this.width * 2 + this.height * 2;
	}

}
