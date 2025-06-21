package exercise2_ECommerceSearchFunction.code;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		ProductCatalog pc = new ProductCatalog();
		
		pc.addProduct(105,"amazon Basics Wireless Mouse","Electronics");
		pc.addProduct(102,"Zebronics Wired KeyBoard","Electronics");
		pc.addProduct(107,"Skipping Rope","Fitness");
		pc.addProduct(110,"Dumbells","Fitness");
		pc.addProduct(101,"Shirt","Clothing");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prdouct id to get details: ");
		int n = sc.nextInt();
		pc.getDetails(n);
		sc.close();
	}

}
