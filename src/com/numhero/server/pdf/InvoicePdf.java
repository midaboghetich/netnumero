package com.numhero.server.pdf;

import java.io.ByteArrayOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.numhero.server.model.pojo.Invoice;

public class InvoicePdf {

	protected static final Font HELVETICA_24_BOLD = new Font(Font.FontFamily.HELVETICA, 24, Font.BOLD);
	protected static final Font HELVETICA_18_BOLD = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
	protected static final Font HELVETICA_14_BOLD = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
	protected static final Font HELVETICA_12_BOLD = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

	protected static final Font HELVETICA_10_BOLD = new Font(Font.FontFamily.HELVETICA,10, Font.BOLD);
	protected static final Font HELVETICA_10_REGULAR = new Font(Font.FontFamily.HELVETICA,10, Font.NORMAL);
	

	private PdfPTable getHeaderTable() {
		PdfPTable table = new PdfPTable(2);
		table.setWidthPercentage(100); // percentage

		float[] widths = { 0.60f, 0.40f };

		try {
			table.setWidths(widths);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		table.getDefaultCell().setPadding(0);

		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		table.getDefaultCell().setVerticalAlignment(Element.ALIGN_TOP);

		table.getDefaultCell().setBorderWidth(0);

		// table.addCell(new Phrase("Mida Boghetich IT Consulting",
		// HELVETICA_14_BOLD));

		PdfPCell cell = new PdfPCell();
		Phrase p = new Phrase("INVOICE", new Font(Font.FontFamily.HELVETICA,
				24, Font.BOLD, BaseColor.GRAY));
		cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		cell.addElement(p);
		table.addCell(cell);

		table.addCell(getDetails());

		return table;
	}

	private Phrase getDetails() {
		Phrase p = new Phrase();
		Chunk c = new Chunk("Ursulinenstra�e 65");
		return p;
	}

	private static PdfPTable getBohTable() {
		PdfPTable table = new PdfPTable(6);

		table.setWidthPercentage(100); // percentage

		table.getDefaultCell().setPadding(3);

		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);

		table.getDefaultCell().setBorderWidth(0.5f);

		 table.addCell(getHeaderCell(new Phrase("P.O. #", HELVETICA_10_BOLD)));
		 table.addCell(getHeaderCell(new Phrase("Sales Resp. Name", HELVETICA_10_BOLD)));
		 table.addCell(getHeaderCell(new Phrase("Ship Date", HELVETICA_10_BOLD)));
		 table.addCell(getHeaderCell(new Phrase("Ship Via", HELVETICA_10_BOLD)));
		 table.addCell(getHeaderCell(new Phrase("Terms", HELVETICA_10_BOLD)));
		 table.addCell(getHeaderCell(new Phrase("Due Date", HELVETICA_10_BOLD)));
		 table.addCell(new Phrase("", HELVETICA_10_REGULAR));
		 table.addCell(new Phrase("Gustav Frollo", HELVETICA_10_REGULAR));
		 table.addCell(new Phrase("08/20/2010", HELVETICA_10_REGULAR));
		 table.addCell(new Phrase("Pigeon", HELVETICA_10_REGULAR));
		 table.addCell(new Phrase("Net 60", HELVETICA_10_REGULAR));
		 table.addCell(new Phrase("", HELVETICA_10_REGULAR));
		return table;
	}

	private static PdfPCell getHeaderCell(Phrase phrase) {
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(BaseColor.PINK);
		cell.setBorderWidth(0.1f);
		cell.setPhrase(phrase);
		return cell;
	}


	public static ByteArrayOutputStream getPdf(Rectangle size, Invoice invoice, boolean isDraft) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		Document document = new Document(size);
		try {
			PdfWriter.getInstance(document, baos);

			document.open();
			
			PdfPTable mainTable = new PdfPTable(1);
			
			
			
			
			mainTable.setWidthPercentage(100); // percentage
			
			mainTable.getDefaultCell().setPadding(3);
			
			mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			
			mainTable.getDefaultCell().setBorderWidth(0.0f);
			
			mainTable.addCell("");
			
			mainTable.addCell(getHeaderTable());
			
			mainTable.addCell(getBohTable());
			
			document.add(mainTable);
			
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		document.close();
		return baos;
	}
}
