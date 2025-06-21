package exercise2_FactoryMethodPattern.code.Factory;
import exercise2_FactoryMethodPattern.code.Documents.Document;
import exercise2_FactoryMethodPattern.code.Documents.wordDocument;

public class wordFactory extends documentFactory {

	@Override
	public Document createDocument() {
		return new wordDocument();
	}

}
