package entity;

public class Product {
	private Integer productId;
	private String productName;
	private int price;
	
	public Product() {
	}

	public Product(Integer productId, String productName, int price) {
	    this.setProductId(productId);
	    this.setProductName(productName);
	    this.setPrice(price);
	}
	public Product( String productName, int price) {
	    this.setProductName(productName);
	    this.setPrice(price);
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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
