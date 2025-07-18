package exercise2_FactoryMethodPattern.code;
import exercise2_FactoryMethodPattern.code.Documents.*;
import exercise2_FactoryMethodPattern.code.Factory.*;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc_type;
		doc_type = sc.nextLine();
		
		documentFactory docFactory = null;
		
		switch(doc_type) {
		case "pdf":
			docFactory = new pdfFactory();
			break;
		case "word":
			docFactory = new wordFactory();
			break;
		case "excel":
			docFactory = new excelFactory();
			break;
		default:
			System.out.println("Choose correct document");
		}
		if(docFactory != null) {
			Document doc = docFactory.createDocument();
			doc.open();
		}
		sc.close();
	}
}
