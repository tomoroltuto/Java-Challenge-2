public class Product {
	
	private String name;
	private String number;
	private int cost;
	
	public Product(String name, String number, int cost) {
		this.name = name;
		this.number = number;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}