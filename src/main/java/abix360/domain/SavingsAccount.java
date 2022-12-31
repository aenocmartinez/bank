package abix360.domain;

public class SavingsAccount extends Product {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Ahorros";
	}

	@Override
	public void assignNumber() {
		this.number = "46" + this.generateNumber();
	}

}
