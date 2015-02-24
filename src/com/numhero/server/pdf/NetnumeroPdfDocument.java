package com.numhero.server.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

public class NetnumeroPdfDocument extends PdfPageEventHelper {

	protected static float MARGIN_LEFT = 20;

	protected static float MARGIN_RIGHT = 20;

	protected static float MARGIN_TOP = 20;

	protected static float MARGIN_BOTTOM = 40;

	protected int numColonneTabellone = 1;

	protected int headerwidths[] = { 100 }; // percentage

	protected static int NUM_MAIN_COLUMN = 1;

	protected static final Font HELVETICA_24_BOLD = new Font(Font.FontFamily.HELVETICA, 24, Font.BOLD);
	protected static final Font HELVETICA_18_BOLD = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
	protected static final Font HELVETICA_14_BOLD = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
	protected static final Font HELVETICA_12_BOLD = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

	protected static final Font HELVETICA_10_BOLD = new Font(Font.FontFamily.HELVETICA,10, Font.BOLD);
	protected static final Font HELVETICA_10_REGULAR = new Font(Font.FontFamily.HELVETICA,10, Font.NORMAL);
	
	protected PdfTemplate tplPageNumber;

	private void addPageNumbers(PdfWriter writer, Document document) {
//		PdfContentByte cb = writer.getDirectContent();
//		cb.saveState();
//
//		String txtNumeroPagina = writer.getPageNumber() + "/";
//
//	//	float textSizeNumero = helv.getWidthPoint(txtNumeroPagina, 9);
//		float textBase = document.bottom() - 20;
//
//		cb.beginText();
//		cb.setFontAndSize(helv, 9);
//		float adjust = helv.getWidthPoint("0", 9);
//		cb.setTextMatrix(document.right() - textSizeNumero - adjust, textBase);
//		cb.showText(txtNumeroPagina);
//		cb.endText();
//		cb.addTemplate(tplPageNumber, document.right() - adjust, textBase);
//		cb.saveState();
	}

	public void onEndPage(PdfWriter writer, Document document) {
//
//		PdfContentByte cb = writer.getDirectContent();
//		cb.saveState();
//
//		//if (writer.getPageNumber() > 1) {
//			// addDateTime(writer, document);
//			addPageNumbers(writer, document);
//			// addSignSpace(writer, document);
//		//}

	}
	
	/* (non-Javadoc)
	 * @see com.lowagie.text.pdf.PdfPageEvent#onOpenDocument(com.lowagie.text.pdf.PdfWriter, com.lowagie.text.Document)
	 */
	public void onOpenDocument(PdfWriter writer, Document document) {
		try {
			
			//TODO check the compatibility of BaseFont
			
//			helv = BaseFont.createFont("Helvetica", BaseFont.WINANSI, false);
//
//			tplPageNumber = writer.getDirectContent().createTemplate(100, 100);
//			tplPageNumber.setBoundingBox(new Rectangle(-20, -20, 100, 100));
//			tplPageNumber.setLineDash(1.0f);

//			tplTimestamp = writer.getDirectContent().createTemplate(100, 100);
//			tplTimestamp.setBoundingBox(new Rectangle(-20, -20, 100, 100));
//			tplTimestamp.setLineDash(1.0f);
//			
//			tplSignSpace = writer.getDirectContent().createTemplate(100, 100);
//			tplSignSpace.setBoundingBox(new Rectangle(-20, -20, 100, 100));
//			tplSignSpace.setLineDash(1.0f);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	/* (non-Javadoc)
	 * @see com.lowagie.text.pdf.PdfPageEvent#onCloseDocument(com.lowagie.text.pdf.PdfWriter, com.lowagie.text.Document)
	 */
	public void onCloseDocument(PdfWriter writer, Document document) {
		//TODO check the compatibility of setFontAndSize
		
//		tplPageNumber.beginText();
//		tplPageNumber.setFontAndSize(helv, 9);
//		tplPageNumber.setTextMatrix(0, 0);
//		tplPageNumber.showText("" + (writer.getPageNumber() - 1));
//		tplPageNumber.endText();
	}
	
}
