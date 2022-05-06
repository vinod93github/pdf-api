package com.pdfapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pdfapi.utility.PdfGenerator;

@SpringBootTest
class PdfGenerateExampleApplicationTests {

	@Test
	void contextLoads() {
		PdfGenerator pdf=new PdfGenerator();
		pdf.writeUsingIText();
	}

}
