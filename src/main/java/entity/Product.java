package entity;

public class Product {
	
	private int productId;
	private String productName;
	private int price ;
	
	public Product() {
	}
	
	public Product(int productId, String productName,int price ) {
		this.setProductId(productId);
		this.setProductName(productName);
		this.setPrice(price) ;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int string) {
		this.productId = string;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
