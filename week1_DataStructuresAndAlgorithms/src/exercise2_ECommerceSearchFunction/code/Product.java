package exercise2_ECommerceSearchFunction.code;

public class Product implements Comparable<Product>{
	private int pdtId;
	private String pdtName; 
	private	String category;
	
	Product(int pdtId,String pdtName,String category){
		this.pdtId = pdtId;
		this.pdtName = pdtName;
		this.category = category;
	}
	
	public int getId() {
		return this.pdtId;
	}
	public String getName() {
		return this.pdtName;
	}
	public String getCategory() {
		return this.category;
	}

	@Override
	public int compareTo(Product o) {
		return Integer.compare(this.pdtId, o.pdtId);
	}	
	
	public void getDetails() {
		System.out.println("Product id: "+getId());
		System.out.println("Prdouct name: "+getName());
		System.out.println("Product category :"+getCategory());
	}
}

