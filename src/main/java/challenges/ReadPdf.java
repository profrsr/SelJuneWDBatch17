package challenges;

import java.io.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;


public class ReadPdf {

	public static void main(String[] args) throws InvalidPasswordException, IOException{
		
		
		File input = new File("C:\\SOW.pdf");  // The PDF file from where you would like to extract
		PDDocument doc = PDDocument.load(input);
		System.out.println(doc.getNumberOfPages());
		PDFTextStripper text = new PDFTextStripper();
		System.out.println(text.getText(doc));
	}
}
