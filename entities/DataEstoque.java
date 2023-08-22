package entities;

public class DataEstoque{
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock(){
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return "Prodcut: "
				+name
				+"\nPrice: $" 
				+String.format("%.2f", price)
				+"\nQuantity: "
				+quantity
				+"\nTotal Value In Stock: $"
				+String.format("%.2f",totalValueInStock());
	}
}