public class Triangle extends Figure {
	private float base;
	private float height;
	private float s1;
	private float s2;
	private float s3;

	private final float lowLim = 1;
	private final float highLim = 20;
	private final float defVal = 1;

	public Triangle() {
		// Sets sides to defValue
		this.s1 = this.defVal;
		this.s2 = this.defVal;
		this.s3 = this.defVal;

		// Base is side3
		this.base = this.defVal;
		// Calculates height
		this.height = (float) Math.sqrt((this.s1 * this.s2) -
				((this.base / 2) * (this.base / 2)));
	}

	public Triangle(float b, float h) {
		// Checks if base is between limits
		if (b < this.lowLim || b > this.highLim) {
			System.out.println("Base " + b +
					" is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
			System.out.println("Switching to default value: " +
					this.defVal);
			this.base = this.defVal;
		} else {
			this.base = b;
		}

		// Checks if height is between limits
		if (h < this.lowLim || h > this.highLim) {
			System.out.println("height " + h +
					" is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
			System.out.println("Switching to default value: " +
					this.defVal);
			this.height = this.defVal;
		} else {
			this.height = h;
		}

		// Calculates sides. Base is side3
		this.s3 = this.base;
		this.s1 = (float) Math.sqrt(((this.base / 2) * (this.base / 2)) +
				(this.height * this.height));
		this.s2 = this.s1;
	}

	public Triangle(float si1, float si2, float si3) {

		// Check if sides are between boundaries
		if (si1 < this.lowLim || si1 > this.highLim) {
			System.out.println("Side " + si1 +
					" is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
			System.out.println("Setting to default value: " +
					this.defVal);
			this.s1 = this.defVal;
		} else {
			this.s1 = si1;
		}
		if (si2 < this.lowLim || si2 > this.highLim) {
			System.out.println("Side " + si2 +
					" is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
			System.out.println("Setting to default value: " 
					+ this.defVal);
			this.s2 = this.defVal;
		} else {
			this.s2 = si2;
		}
		if (si3 < this.lowLim || si3 > this.highLim) {
			System.out.println("Side " + si3 +
					" is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
			System.out.println("Setting to default value: " +
					this.defVal);
			this.s3 = this.defVal;
		} else {
			this.s3 = si3;
		}

		// Checks if sides are a triangle
		// Sum of any two sides cannot be lower than the other
		if (this.s1 + this.s2 <= this.s3) {
			System.out.println("Sides cannot make a triangle:");
			System.out.println(this.s1 + "+" + this.s2 + "<=" +
					this.s3);
			System.out.println("Switching to default value: " +
					this.defVal + ".");
			this.s1 = this.defVal;
			this.s2 = this.defVal;
			this.s3 = this.defVal;
		} else if (this.s1 + this.s3 <= this.s2) {
			System.out.println("Sides cannot make a triangle:");
			System.out.println(this.s1 + "+" + this.s3 + "<=" +
					this.s2);
			System.out.println("Switching to default value: " +
					this.defVal + ".");
			this.s1 = this.defVal;
			this.s2 = this.defVal;
			this.s3 = this.defVal;
		} else if (this.s2 + this.s3 <= this.s1) {
			System.out.println("Sides cannot make a triangle:");
			System.out.println(this.s2 + "+" + this.s3 + "<=" +
					this.s1);
			System.out.println("Switching to default value: " +
					this.defVal + ".");
			this.s1 = this.defVal;
			this.s2 = this.defVal;
			this.s3 = this.defVal;
		}

		// Set base to side 3
		this.base = this.s3;

		// Calculate area with Hero's formula:
		float p = (this.s1 + this.s2 + this.s3) / 2;
		float ar = (float) Math.sqrt(p * (p - this.s1) * 
				(p - this.s2) * (p - this.s3));
		// Calculate height from area
		this.height = 2 * ar / this.base;

	}

	public float getBase() {
		return base;
	}

	public float getHeight() {
		return height;
	}

	public float getS1() {
		return s1;
	}

	public float getS2() {
		return s2;
	}

	public float getS3() {
		return s3;
	}

	public void setBase(float b) {
		if (b < this.lowLim || b > this.highLim) {
			System.out.println("Base " + b +
					" is outside boundaries [" + 
					this.lowLim + "," + this.highLim + "].");
		} else {
			this.base = b;
		}

		// Recalculates sides. Base is side3
		this.s3 = this.base;
		this.s1 = (float) Math.sqrt(((this.base / 2) * 
				(this.base / 2)) + (this.height * this.height));
		this.s2 = this.s1;
	}

	public void setHeight(float h) {
		if (h < this.lowLim || h > this.highLim) {
			System.out.println("Height " + h 
					+ " is outside boundaries [" +
					this.lowLim + "," + this.highLim + "].");
		} else {
			this.height = h;
		}
		// Calculates sides. Base is side3
		this.s3 = this.base;
		this.s1 = (float) Math.sqrt(((this.base / 2) * 
				(this.base / 2)) + (this.height * this.height));
		this.s2 = this.s1;
	}

	public void setS1(float si1) {
		// Check if side is between boundaries
		if (si1 < this.lowLim || si1 > this.highLim) {
			System.out.println("Side " + si1 + 
					" is outside boundaries [" + 
					this.lowLim + "," + this.highLim + "].");
		} else {
			// Checks if sides are a triangle
			// Sum of any two sides cannot be lower than the other
			if (si1 + this.s2 <= this.s3) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(si1 + "+" + this.s2 + "<=" + this.s3);
			} else if (si1 + this.s3 <= this.s2) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(si1 + "+" + this.s3 + "<=" + this.s2);
			} else if (this.s2 + this.s3 <= si1) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(this.s2 + "+" + this.s3 + "<=" + si1);
			} else {
				this.s1 = si1;
			}
		}
	}

	public void setS2(float si2) {
		// Check if side is between boundaries
		if (this.s1 < this.lowLim || this.s1 > this.highLim) {
			System.out
					.println("Side " + this.s1 
							+ " is outside boundaries [" +
							this.lowLim + "," + this.highLim + "].");
		} else {
			// Checks if sides are a triangle
			// Sum of any two sides cannot be lower than the other
			if (this.s1 + si2 <= this.s3) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(this.s1 + "+" + si2 + "<=" + this.s3);
			} else if (this.s1 + this.s3 <= si2) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(this.s1 + "+" + this.s3 + "<=" + si2);
			} else if (si2 + this.s3 <= this.s1) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(si2 + "+" + this.s3 + "<=" + this.s1);
			} else {
				this.s2 = si2;
			}
		}
	}

	public void setS3(float si3) {
		// Check if side is between boundaries
		if (this.s1 < this.lowLim || this.s1 > this.highLim) {
			System.out
					.println("Side " + this.s1 +
							" is outside boundaries [" + 
							this.lowLim + "," + this.highLim + "].");
		} else {
			// Checks if sides are a triangle
			// Sum of any two sides cannot be lower than the other
			if (this.s1 + this.s2 <= si3) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(this.s1 + "+" + this.s2 + "<=" + si3);
			} else if (this.s1 + si3 <= this.s2) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(this.s1 + "+" + si3 + "<=" + this.s2);
			} else if (this.s2 + si3 <= this.s1) {
				System.out.println("Sides cannot make a triangle:");
				System.out.println(this.s2 + "+" + si3 + "<=" + this.s1);
			} else {
				this.s3 = si3;
			}
		}
	}

	@Override
	public float getArea() {
		return (this.base * this.height) / 2;
	}

	@Override
	public float getPerimeter() {
		return this.s1 + this.s2 + this.s3;
	}

}
