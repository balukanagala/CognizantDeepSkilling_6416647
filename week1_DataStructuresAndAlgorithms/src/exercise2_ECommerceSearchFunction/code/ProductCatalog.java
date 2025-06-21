package exercise2_ECommerceSearchFunction.code;

import java.util.*;
//import exercise2_ECommerceSearchFunction.code.Product;

public class ProductCatalog {
	
	private ArrayList<Product>ProductList; // declaring
	
	public ProductCatalog() {
		this.ProductList = new ArrayList<>(); // initialization
	}
	
	public void addProduct(int pdtId,String name,String category) {
		ProductList.add(new Product(pdtId,name,category));
	}
	
	public Product linearSearch(int pdtId) {
		
		for(Product p:ProductList) {
			if(p.getId() == pdtId) return p;
		}
		return null;
	}
	
	public Product binarySearch(int pdtId) {
		Collections.sort(ProductList);
		int start=0;
		int end = ProductList.size()-1;
		while(start<=end) {
			int mid = (end+start)/2;
			int id = ProductList.get(mid).getId();
			if(id == pdtId) return ProductList.get(mid);
			else if(id < pdtId) start=mid+1;
			else end=mid-1;
		}
		return null;
	}
	
	public void getDetails(int pdtId){
		System.out.println("Linear Search");
		Product p = linearSearch(pdtId);
		if(p!=null) {
			p.getDetails();
		}
		else {
			System.out.println("No product");
		}
		
		System.out.println();
		

		System.out.println("Binary Search");
		Product p1 = binarySearch(pdtId);
		if(p1!=null) {
			p1.getDetails();
		}
		else {
			System.out.println("No product");
		}
	}
}

/*Product catalog holds or manages a collection of Product objects and provides operations like search, sort, or filter.
 */