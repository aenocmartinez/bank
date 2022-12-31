package abix360.domain;

public class CheckingAccount extends Product {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Corriente";
	}

	@Override
	public void assignNumber() {
		this.number = "23" + this.generateNumber();
	}

}
