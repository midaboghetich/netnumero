package com.numhero.server.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

import com.itextpdf.text.PageSize;


public class TestPdf {
	public static final String RESULT = "test.pdf";
	
	@Test
	public void createInvoice() {
        
        try {
        	FileOutputStream fos = new FileOutputStream(RESULT) ;
        	InvoicePdf.getPdf(PageSize.A4).writeTo(fos);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
      
	}
	
	
	
	
	

}
