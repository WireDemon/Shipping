package net.shipping.com;

public class Value {

	private float min;

	private float max;

	private float amount;

	public Value(float amount, float min, float max) {
		this.setAmount(amount);
		this.setMin(min);
		this.setMax(max);
	}

	public float getAmount() {
		return this.amount;
	}

	public float getMax() {
		return this.max;
	}

	public float getMin() {
		return this.min;
	}

	protected void setAmount(float amount) {
		this.amount = Math.max(Math.min(amount, this.getMax()), this.getMin()); //Clamps amount to between max and min		
	}

	protected void setMax(float max) {
		this.max = max;
	}

	protected void setMin(float min) {
		this.min = min;
	}

}
