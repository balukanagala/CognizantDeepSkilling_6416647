package exercise2_FactoryMethodPattern.code.Factory;

import exercise2_FactoryMethodPattern.code.Documents.Document;
import exercise2_FactoryMethodPattern.code.Documents.excelDocument;

public class excelFactory extends documentFactory{

	@Override
	public Document createDocument() {
		return new excelDocument();
	}

}
