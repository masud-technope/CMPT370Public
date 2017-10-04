package astyle;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;
import net.barenca.jastyle.ASFormatter;
import net.barenca.jastyle.FormatterHelper;
import utility.ContentLoader;

public class AStyleDemo {

	// /This is the main function for astyle demo
	public static void main(String[] args) {
		try {
			String sourceCode = ContentLoader
					.loadFileContent("./data/java-code.txt");
			sourceCode = sourceCode.replace("{", "{\n");
			// sourceCode=sourceCode.replace("}", "}\n");
			ASFormatter asFormatter = new ASFormatter();
			Reader in = new BufferedReader(new StringReader(sourceCode));
			asFormatter.setJavaStyle();
			// asFormatter.setCStyle();
			// asFormatter.setSharpStyle();
			String formattedCode = FormatterHelper.format(in, asFormatter);
			in.close();
			System.out.println(formattedCode);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
