package com.numhero.server.pdf;


public class ModuloRichiestaIncarico {

//	private static final String DATI_INCARICO = "Dati incarico";
//
//	private static final String DATI_INSEGNAMENTO = "Dati insegnamento";
//
//	protected PdfPTable tabellaContenitore = null;
//
//	public void creaRegistroPdf(OutputStream os) throws BadElementException,
//
//	MalformedURLException, DocumentException, IOException {
//
//		Document document = new Document(PageSize.A4, MARGIN_LEFT,
//
//		MARGIN_RIGHT, MARGIN_TOP, MARGIN_BOTTOM);
//
//		PdfWriter writer = PdfWriter.getInstance(document, os);
//
//		writer.setPageEvent(this);
//
//		document.newPage();
//
//		document.open();
//
//		document.newPage();
//
//		document.add(getPaginaUno());
//
//		document.newPage();
//
//		document.add(getPaginaDue());
//
//		document.newPage();
//
//		document.add(getPagineTre());
//
//		document.close();
//
//		writer.close();
//
//	}
//
//	private Element getPagineTre() throws BadElementException,
//
//	MalformedURLException, DocumentException, IOException {
//
//		PdfPTable tableContents = new PdfPTable(1);
//
//		tableContents.setWidthPercentage(100);
//
//		tableContents.getDefaultCell().setBorderWidth(0.0f);
//
//		generaHeader(tableContents);
//
//		PdfPTable tabella = new PdfPTable(2);
//
//		float[] widths = { 0.02f, 0.98f };
//
//		tabella.setWidths(widths);
//
//		tabella.setWidthPercentage(100); // percentage
//
//		tabella.getDefaultCell().setPadding(3);
//
//		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		tabella.getDefaultCell().setBorderWidth(0.0f);
//
//		tabella.addCell("");
//
//		tabella.addCell(getAnagraficaFiscale());
//
//		tabella.addCell("");
//
//		PdfPCell cell1 = new PdfPCell();
//
//		cell1.addElement(residenteEstero());
//		cell1.addElement(dipendentePubblico1());
//		cell1.addElement(dipendentePubblico2());
//		cell1.addElement(getDipendentePubblicotre());
//		cell1.setBorderWidth(0.0f);
//
//		tabella.addCell(cell1);
//
//		tabella.addCell("");
//
//		tabella.addCell(prestazioneProfessionale());
//
//		tabella.addCell("");
//
//		PdfPCell cell5 = new PdfPCell();
//
//		cell5.addElement(prestazioneProfessionale2());
//
//		cell5.setBorderWidth(0.0f);
//
//		tabella.addCell(cell5);
//
//		tabella.addCell("");
//
//		PdfPCell cell6 = new PdfPCell();
//
//		cell6.addElement(prestazioneProfessionale3());
//
//		cell6.setBorderWidth(0.0f);
//
//		tabella.addCell(cell6);
//
//		tabella.addCell("");
//
//		tabella.addCell(collaborazioneCoordinata());
//
//		tabella.addCell("");
//
//		PdfPCell cell7 = new PdfPCell();
//
//		cell7.addElement(collaborazioneCoordinata1());
//
//		cell7.setBorderWidth(0.0f);
//
//		tabella.addCell(cell7);
//
//		tabella.addCell("");
//
//		PdfPCell cell8 = new PdfPCell();
//
//		cell8.addElement(collaborazioneCoordinata2());
//
//		cell8.setBorderWidth(0.0f);
//
//		tabella.addCell(cell8);
//
//		tabella.addCell("");
//
//		PdfPCell cell9 = new PdfPCell();
//
//		cell9.addElement(collaborazioneCoordinata3());
//
//		cell9.setBorderWidth(0.0f);
//
//		tabella.addCell(cell9);
//
//		tabella.addCell("");
//
//		tabella.addCell(getCoordinateBancarie());
//
//		tabella.addCell("");
//
//		tableContents.addCell(tabella);
//
//		return tableContents;
//
//	}
//
//	private Element getPaginaDue() throws BadElementException,
//
//	MalformedURLException, DocumentException, IOException {
//
//		PdfPTable tableContents = new PdfPTable(1);
//
//		tableContents.setWidthPercentage(100);
//
//		tableContents.getDefaultCell().setBorderWidth(0.0f);
//
//		generaHeader(tableContents);
//
//		PdfPTable tabella = new PdfPTable(2);
//
//		float[] widths = { 0.02f, 0.98f };
//
//		tabella.setWidths(widths);
//
//		tabella.setWidthPercentage(100); // percentage
//
//		tabella.getDefaultCell().setPadding(3);
//
//		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		tabella.getDefaultCell().setBorderWidth(0.0f);
//
//		tabella.addCell("");
//
//		PdfPCell cell1 = new PdfPCell();
//
//		cell1.addElement(lista1());
//
//		cell1.setBorderWidth(0.0f);
//
//		tabella.addCell(cell1);
//
//		tabella.addCell("");
//
//		PdfPCell cell2 = new PdfPCell();
//
//		cell2.addElement(lista2());
//
//		cell2.setBorderWidth(0.0f);
//
//		tabella.addCell(cell2);
//
//		tabella.addCell("");
//
//		PdfPCell cell3 = new PdfPCell();
//
//		cell3.addElement(lista3());
//
//		cell3.setBorderWidth(0.0f);
//
//		tabella.addCell(cell3);
//
//		tabella.addCell("");
//
//		PdfPCell cell4 = new PdfPCell();
//
//		cell4.setBorderWidth(0.0f);
//
//		cell4.addElement(lista4());
//
//		tabella.addCell(cell4);
//
//		tabella.addCell("");
//
//		tabella.addCell(getTabellaAiSensi());
//
//		tabella.addCell("");
//
//		tabella.addCell(getNota());
//
//		tabella.addCell("");
//
//		tabella.addCell(getRiservato());
//
//		tabella.addCell("");
//
//		tableContents.addCell(tabella);
//
//		return tableContents;
//
//	}
//
//	private PdfPTable getPaginaUno() throws DocumentException, MalformedURLException, IOException {
//
//		PdfPTable tableContents = new PdfPTable(1);
//
//		tableContents.setWidthPercentage(100);
//
//		tableContents.getDefaultCell().setBorderWidth(0.0f);
//
//		generaHeader(tableContents);
//
//		PdfPTable tabella = new PdfPTable(2);
//
//		float[] widths = { 0.02f, 0.98f };
//
//		tabella.setWidths(widths);
//
//		tabella.setWidthPercentage(100); // percentage
//
//		tabella.getDefaultCell().setPadding(3);
//
//		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		tabella.getDefaultCell().setBorderWidth(0.0f);
//
//		tabella.addCell("");
//
//		tabella.addCell(new Phrase("Domanda di assegnazione incarico per l'A.A. 2007/08",helveticaNormal10));
//		addRigheVuote(tabella, 3);
//		tabella.addCell("");
//		tabella.addCell(new Phrase("Al Preside della Facoltà di ARCHITETTURA E SOCIETA'", helveticaNormal10));
//
//		addRigheVuote(tabella, 1);
//
//		tabella.addCell("");
//
//		tabella.addCell(new Phrase("il sottoscritto:", helveticaNormal10));
//
//		tabella.addCell("");
//
//		tabella.addCell(getGrigliaAnagrafica());
//
//		addRigheVuote(tabella, 1);
//
//		tabella.addCell("");
//
//		tabella.addCell(new Phrase("Chiede per l'a.a. 2007/08 l'assegnazione del contratto per l'insegnamento specificato di seguito, prendendo atto degli estremi e dei tempi ivi indicati.",helveticaNormal10));
//
//		tabella.addCell("");
//
//		tabella.addCell(getTabellaDatiInsegnamento());
//
//		tableContents.addCell(tabella);
//
//		return tableContents;
//
//	}
//
//	private PdfPTable getTabellaDatiInsegnamento() throws DocumentException {
//
//		PdfPTable datiInsegnamento = new PdfPTable(2);
//
//		datiInsegnamento.setWidthPercentage(100);
//
//		datiInsegnamento.getDefaultCell().setBorderWidth(0.1f);
//
//		float[] widths = { 0.30f, 0.70f };
//
//		datiInsegnamento.setWidths(widths);
//
//		datiInsegnamento.addCell(getHeaderCellIncarico(DATI_INSEGNAMENTO));
//
//		datiInsegnamento.addCell(new Phrase("Nome insegnamento:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Parte di:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase(
//
//		"Settore Scientifico-Disciplinare:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Area Disciplinare:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Ore esercitazione:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Ore laboratorio sperimentale:",
//
//				helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Ore lezione:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Tipo di corso:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("CFU DM 509/99:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(getHeaderCellIncarico(DATI_INCARICO));
//
//		datiInsegnamento.addCell(new Phrase("Facolt‡:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Sede:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Periodo:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Ordinamento:", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Corsi di studi / sezione:",
//
//				helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("Numero di Unit‡ Didattiche:",
//
//				helveticaNormal10));
//
//		datiInsegnamento.addCell(new Phrase("---", helveticaNormal10));
//
//		return datiInsegnamento;
//
//	}
//
//	private PdfPCell getHeaderCellIncarico(String stringaHeader) {
//
//		PdfPCell cellInc = new PdfPCell(new Phrase(stringaHeader, new Font(
//
//		Font.HELVETICA, 10, Font.BOLD)));
//
//		cellInc.setBackgroundColor(new Color(220, 220, 220));
//
//		cellInc.setPaddingBottom(5);
//
//		cellInc.setColspan(2);
//
//		return cellInc;
//
//	}
//
//	private PdfPTable getGrigliaAnagrafica() throws DocumentException {
//
//		PdfPTable anag = new PdfPTable(1);
//
//		anag.setWidthPercentage(100);
//
//		anag.getDefaultCell().setBorderWidth(0.0f);
//
//		anag.getDefaultCell().setPadding(0);
//
//		anag.addCell(getElementiCognomeNome());
//
//		anag.addCell(getElementiNascita());
//
//		anag.addCell(getElementiCodiceFiscale());
//
//		anag.addCell(getElementiResidenzaUno());
//
//		anag.addCell(getElementiResidenzaDue());
//
//		anag.addCell(getDomicilioFiscale1());
//
//		anag.addCell(getDomicilioFiscale2());
//
//		anag.addCell(getElementiEmailCellulare());
//
//		return anag;
//
//	}
//
//	private PdfPTable getElementiEmailCellulare() throws DocumentException {
//
//		/*
//		 * 
//		 * Email cellulare
//		 * 
//		 * ---------------------------------------------------------------
//		 * 
//		 */
//
//		PdfPTable emailCell = new PdfPTable(3);
//
//		float myWidths[] = { 49.0f, 2.0f, 49.0f };
//
//		emailCell.setWidthPercentage(100);
//
//		emailCell.setWidths(myWidths);
//
//		emailCell.getDefaultCell().setBorderWidth(0.0f);
//
//		emailCell.getDefaultCell().setPadding(2);
//
//		emailCell.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		emailCell.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		emailCell.addCell(new Phrase("Email", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		emailCell.addCell(new Phrase(""));
//
//		emailCell.addCell(new Phrase("Cellulare", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		emailCell.addCell(getBorderField("mida.boghetich@polimi.it"));
//
//		emailCell.addCell(new Phrase(" "));
//
//		emailCell.addCell(getBorderField("3393718932"));
//
//		return emailCell;
//
//	}
//
//	private PdfPTable getElementiResidenzaDue() throws DocumentException {
//
//		/*
//		 * 
//		 * Residenza parte due
//		 * 
//		 * ---------------------------------------------------------------
//		 * 
//		 */
//
//		PdfPTable residenza2 = new PdfPTable(5);
//
//		float myWidths[] = { 49.0f, 2.0f, 17.0f, 2.0f, 30.0f };
//
//		residenza2.setWidthPercentage(100);
//
//		residenza2.setWidths(myWidths);
//
//		residenza2.getDefaultCell().setBorderWidth(0.0f);
//
//		residenza2.getDefaultCell().setPadding(2);
//
//		residenza2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		residenza2.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		residenza2.addCell(new Phrase("Comune (o Stato estero ) di residenza",
//
//		new Font(Font.HELVETICA, 8, Font.BOLD)));
//
//		residenza2.addCell(new Phrase(""));
//
//		residenza2.addCell(new Phrase("C.A.P.", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		residenza2.addCell(new Phrase(""));
//
//		residenza2.addCell(new Phrase("Provincia", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		residenza2.addCell(getBorderField("MILANO"));
//
//		residenza2.addCell(new Phrase(" "));
//
//		residenza2.addCell(getBorderField("20137"));
//
//		residenza2.addCell(new Phrase(" "));
//
//		residenza2.addCell(getBorderField("MI"));
//
//		return residenza2;
//
//	}
//
//	private PdfPTable getElementiCognomeNome() throws DocumentException {
//
//		/*
//		 * 
//		 * Cognome e Nome
//		 * 
//		 * ---------------------------------------------------------------
//		 * 
//		 */
//
//		PdfPTable cognomeNome = new PdfPTable(3);
//
//		float myWidths[] = { 49.0f, 2.0f, 49.0f };
//
//		cognomeNome.setWidthPercentage(100);
//
//		cognomeNome.setWidths(myWidths);
//
//		cognomeNome.getDefaultCell().setBorderWidth(0.0f);
//
//		cognomeNome.getDefaultCell().setPadding(2);
//
//		cognomeNome.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		cognomeNome.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		cognomeNome.addCell(new Phrase("Cognome", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		cognomeNome.addCell(new Phrase(""));
//
//		cognomeNome.addCell(new Phrase("Nome", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		cognomeNome.addCell(getBorderField("BOGHETICH"));
//
//		cognomeNome.addCell(new Phrase(" "));
//
//		cognomeNome.addCell(getBorderField("GIANGIUSEPPE MIDA"));
//
//		return cognomeNome;
//
//	}
//
//	private PdfPTable getElementiNascita() throws DocumentException {
//
//		/*
//		 * 
//		 * Nascita
//		 * 
//		 * ---------------------------------------------------------------
//		 * 
//		 */
//
//		PdfPTable datiNascita = new PdfPTable(5);
//
//		float myWidths[] = { 32.0f, 2.0f, 52.0f, 2.0f, 12.0f };
//
//		datiNascita.setWidthPercentage(100);
//
//		datiNascita.setWidths(myWidths);
//
//		datiNascita.getDefaultCell().setBorderWidth(0.0f);
//
//		datiNascita.getDefaultCell().setPadding(2);
//
//		datiNascita.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		datiNascita.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		datiNascita.addCell(new Phrase("Data di nascita (gg/mm/aaaa)",
//
//		new Font(Font.HELVETICA, 8, Font.BOLD)));
//
//		datiNascita.addCell(new Phrase(""));
//
//		datiNascita.addCell(new Phrase("Comune (o stato estero) di nascita",
//
//		new Font(Font.HELVETICA, 8, Font.BOLD)));
//
//		datiNascita.addCell(new Phrase(""));
//
//		datiNascita.addCell(new Phrase("Provincia", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		datiNascita.addCell(getBorderField("11/01/1971"));
//
//		datiNascita.addCell(new Phrase(" "));
//
//		datiNascita.addCell(getBorderField("MILANO"));
//
//		datiNascita.addCell(new Phrase(" "));
//
//		datiNascita.addCell(getBorderField("MI"));
//
//		return datiNascita;
//
//	}
//
//	private PdfPTable getElementiCodiceFiscale() throws DocumentException {
//
//		/*
//		 * 
//		 * CodiceFiscale
//		 * 
//		 * ---------------------------------------------------------------
//		 * 
//		 */
//
//		PdfPTable codiceFiscale = new PdfPTable(3);
//
//		float myWidths[] = { 49.0f, 2.0f, 49.0f };
//
//		codiceFiscale.setWidthPercentage(100);
//
//		codiceFiscale.setWidths(myWidths);
//
//		codiceFiscale.getDefaultCell().setBorderWidth(0.0f);
//
//		codiceFiscale.getDefaultCell().setPadding(2);
//
//		codiceFiscale.getDefaultCell().setHorizontalAlignment(
//
//		Element.ALIGN_LEFT);
//
//		codiceFiscale.getDefaultCell().setVerticalAlignment(
//
//		Element.ALIGN_MIDDLE);
//
//		codiceFiscale.addCell(new Phrase("Codice Fiscale", new Font(
//
//		Font.HELVETICA, 8, Font.BOLD)));
//
//		codiceFiscale.addCell(new Phrase(""));
//
//		codiceFiscale.addCell(new Phrase("Codice identificativo estero",
//
//		new Font(Font.HELVETICA, 8, Font.BOLD)));
//
//		codiceFiscale.addCell(getCodiceFiscale("BGHGGS71A11F205B"));
//
//		codiceFiscale.addCell(new Phrase(""));
//
//		codiceFiscale.addCell(getBorderField("---"));
//
//		return codiceFiscale;
//
//	}
//
//	private PdfPTable getElementiResidenzaUno() throws DocumentException {
//
//		/*
//		 * 
//		 * Residenza parte uno
//		 * 
//		 * ---------------------------------------------------------------
//		 * 
//		 */
//
//		PdfPTable residenza1 = new PdfPTable(5);
//
//		float myWidths[] = { 49.0f, 2.0f, 17.0f, 2.0f, 30.0f };
//
//		residenza1.setWidthPercentage(100);
//
//		residenza1.setWidths(myWidths);
//
//		residenza1.getDefaultCell().setBorderWidth(0.0f);
//
//		residenza1.getDefaultCell().setPadding(2);
//
//		residenza1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		residenza1.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		residenza1.addCell(new Phrase("Indirizzo", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		residenza1.addCell(new Phrase(""));
//
//		residenza1.addCell(new Phrase("n∞ civico", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		residenza1.addCell(new Phrase(""));
//
//		residenza1.addCell(new Phrase("Telefono", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		residenza1.addCell(getBorderField("Via Giuseppe Longhi"));
//
//		residenza1.addCell(new Phrase(" "));
//
//		residenza1.addCell(getBorderField("14"));
//
//		residenza1.addCell(new Phrase(" "));
//
//		residenza1.addCell(getBorderField("0270103061"));
//
//		return residenza1;
//
//	}
//
//	private void addRigheVuote(PdfPTable tabella, int numeroRighe) {
//
//		for (int i = 0; i < numeroRighe; i++) {
//
//			tabella.addCell("");
//
//			tabella.addCell("");
//
//		}
//
//	}
//
//	private PdfPTable getBorderField(String contenuto) {
//
//		PdfPTable field = new PdfPTable(1);
//
//		field.setWidthPercentage(100);
//
//		field.getDefaultCell().setBorderWidth(0.1f);
//
//		if (contenuto == null) {
//
//			contenuto = "";
//
//		}
//
//		field.addCell(new Phrase(contenuto, new Font(Font.HELVETICA, 10,
//
//		Font.BOLD)));
//
//		return field;
//
//	}
//
//	private void generaHeader(PdfPTable tabella) throws DocumentException,
//
//	BadElementException, MalformedURLException, IOException {
//
//		tabella.setWidths(headerwidths);
//
//		tabella.setWidthPercentage(100); // percentage
//
//		tabella.getDefaultCell().setPadding(3);
//
//		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
//
//		tabella.getDefaultCell().setBorderWidth(0.0f);
//
//		tabella.addCell(getHeader());
//
//		tabella.setHeaderRows(1);
//
//	}
//
//	private PdfPTable getHeader() throws MalformedURLException {
//
//		PdfPTable header = new PdfPTable(2);
//
//		try {
//
//			int myWidths[] = { 30, 70 };
//
//			header.setWidthPercentage(100);
//
//			header.setWidths(myWidths);
//
//			header.getDefaultCell().setBorderWidth(0.0f);
//
//			header.getDefaultCell().setPadding(0);
//
//			header.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//			Image logoPoli = Image.getInstance(getUrlImmagine());
//
//			logoPoli.scalePercent(8);
//
//			PdfPCell jpgCell = new PdfPCell(logoPoli);
//
//			jpgCell.setHorizontalAlignment(Element.ALIGN_LEFT);
//
//			jpgCell.setBorderWidth(0.0f);
//
//			header.addCell(jpgCell);
//
//			PdfPTable dettagliHeader = new PdfPTable(1);
//
//			dettagliHeader.setWidthPercentage(100);
//
//			dettagliHeader.getDefaultCell().setPadding(1);
//
//			header.addCell(dettagliHeader);
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//
//		}
//
//		return header;
//
//	}
//
//	private URL getUrlImmagine() throws MalformedURLException {
//
//		URL urlToFile = new URL(URL_IMMAGINE);
//
//		return urlToFile;
//
//	}
//
//	private PdfPTable getCodiceFiscale(String codicefiscale)
//
//	throws DocumentException {
//
//		PdfPTable cfis = new PdfPTable(16);
//
//		float myWidths[] = { 6.25f, 6.25f, 6.25f, 6.25f, 6.25f, 6.25f, 6.25f,
//
//		6.25f, 6.25f, 6.25f, 6.25f, 6.25f, 6.25f, 6.25f, 6.25f, 6.25f };
//
//		cfis.setWidthPercentage(100);
//
//		cfis.setWidths(myWidths);
//
//		cfis.getDefaultCell().setBorderWidth(0.2f);
//
//		cfis.getDefaultCell().setPadding(3);
//
//		cfis.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
//
//		cfis.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		for (int i = 0; i < 16; i++) {
//
//			String carattere = codicefiscale.substring(i, 1 + i);
//
//			cfis.addCell(new Phrase(carattere, new Font(Font.HELVETICA, 10,
//
//			Font.BOLD)));
//
//		}
//
//		return cfis;
//
//	}
//
//	private PdfPTable getDomicilioFiscale1() throws DocumentException {
//
//		PdfPTable domicilio1 = new PdfPTable(5);
//
//		float myWidths[] = { 49.0f, 2.0f, 17.0f, 2.0f, 30.0f };
//
//		domicilio1.setWidthPercentage(100);
//
//		domicilio1.setWidths(myWidths);
//
//		domicilio1.getDefaultCell().setBorderWidth(0.0f);
//
//		domicilio1.getDefaultCell().setPadding(2);
//
//		domicilio1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		domicilio1.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		domicilio1.addCell(new Phrase(
//
//		"Domicilio fiscale (solo se diverso dalla residenza)",
//
//		new Font(Font.HELVETICA, 10, Font.BOLD)));
//
//		domicilio1.addCell(new Phrase(""));
//
//		domicilio1.addCell(new Phrase(""));
//
//		domicilio1.addCell(new Phrase(""));
//
//		domicilio1.addCell(new Phrase(""));
//
//		domicilio1.addCell(new Phrase("Indirizzo", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		domicilio1.addCell(new Phrase(""));
//
//		domicilio1.addCell(new Phrase("n∞ civico", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		domicilio1.addCell(new Phrase(""));
//
//		domicilio1.addCell(new Phrase("Telefono", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		domicilio1.addCell(getBorderField("Via Giuseppe Longhi"));
//
//		domicilio1.addCell(new Phrase(" "));
//
//		domicilio1.addCell(getBorderField("14"));
//
//		domicilio1.addCell(new Phrase(" "));
//
//		domicilio1.addCell(getBorderField("0270103061"));
//
//		return domicilio1;
//
//	}
//
//	private PdfPTable getDomicilioFiscale2() throws DocumentException {
//
//		/*
//		 * 
//		 * Residenza parte due
//		 * 
//		 * ---------------------------------------------------------------
//		 * 
//		 */
//
//		PdfPTable domicilio2 = new PdfPTable(5);
//
//		float myWidths[] = { 49.0f, 2.0f, 17.0f, 2.0f, 30.0f };
//
//		domicilio2.setWidthPercentage(100);
//
//		domicilio2.setWidths(myWidths);
//
//		domicilio2.getDefaultCell().setBorderWidth(0.0f);
//
//		domicilio2.getDefaultCell().setPadding(2);
//
//		domicilio2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		domicilio2.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		domicilio2.addCell(new Phrase("Comune (o Stato estero ) di residenza",
//
//		new Font(Font.HELVETICA, 8, Font.BOLD)));
//
//		domicilio2.addCell(new Phrase(""));
//
//		domicilio2.addCell(new Phrase("C.A.P.", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		domicilio2.addCell(new Phrase(""));
//
//		domicilio2.addCell(new Phrase("Provincia", new Font(Font.HELVETICA, 8,
//
//		Font.BOLD)));
//
//		domicilio2.addCell(getBorderField("MILANO"));
//
//		domicilio2.addCell(new Phrase(" "));
//
//		domicilio2.addCell(getBorderField("20137"));
//
//		domicilio2.addCell(new Phrase(" "));
//
//		domicilio2.addCell(getBorderField("MI"));
//
//		return domicilio2;
//
//	}
//
//	private List lista1() {
//
//		List list1 = new List(false, 20);
//
//		list1.setIndentationLeft(0);
//
//		list1.setListSymbol(new Chunk("\u00b7", new Font(Font.COURIER, 20,
//
//		Font.BOLD, new Color(0, 0, 0))));
//
//		list1
//
//				.add(new ListItem(
//
//						"Prende inoltre atto che la docenza sarà retribuita secondo quanto deliberato dalla Facoltà ed eventualmente"
//
//								+ " accetta che l'attività svolta venga remunerata con un compenso figurativo.",
//
//						helveticaNormal8));
//
//		list1
//
//				.add(new ListItem(
//
//						"Dichiara di aver avanzato, per lo stesso a.a., domanda per altri contratti per le U.D, qui sotto indicate.",
//
//						helveticaNormal8));
//
//		return list1;
//
//	}
//
//	private List lista2() {
//
//		List list2 = new List(false, 20);
//
//		list2.setIndentationLeft(25);
//
//		list2.setListSymbol(new Chunk("\u00b7", new Font(Font.COURIER, 20,
//
//		Font.BOLD, new Color(0, 0, 0))));
//
//		list2
//
//				.add(new ListItem(
//
//						"Presso questo Ateneo:\n"
//
//								+ "Facolt‡: _______________________________________________________U.D.:_______________\n"
//
//								+ "Facolt‡: _______________________________________________________U.D.:_______________\n",
//
//						helveticaNormal8));
//
//		list2
//
//				.add(new ListItem(
//
//						"Presso altro Ateneo:\n"
//
//								+ "Facolt‡: _______________________________________________________U.D.:_______________\n"
//
//								+ "Facolt‡: _______________________________________________________U.D.:_______________\n"
//
//								+ "\n", helveticaNormal8));
//
//		return list2;
//
//	}
//
//	private List lista3() {
//
//		List list3 = new List(false, 20);
//
//		list3.setIndentationLeft(0);
//
//		list3.setListSymbol(new Chunk("\u00b7", new Font(Font.COURIER, 20,
//
//		Font.BOLD, new Color(0, 0, 0))));
//
//		list3
//
//				.add(new ListItem(
//
//						"Si impegna a dichiarare per iscritto alla Presidenza della Facolt‡ in indirizzo ogni successiva variazione.",
//
//						helveticaNormal8));
//
//		list3
//
//				.add(new ListItem(
//
//						"Dichiara di adeguarsi al programma didattico dello specifico insegnamento, coordinato nell'ambito del"
//
//								+ " Consiglio di Corso di Studi, con complessive ________ ore di didattica del corso, di cui:"
//
//								+ "_____ ore di lezione, _____ ore di esercitazione, ______ ore di laboratorio. ",
//
//						helveticaNormal8));
//
//		list3
//
//				.add(new ListItem(
//
//						"Dichiara di non essere studente di corsi di dottorati di ricerca o di scuole di specializzazione(*).",
//
//						helveticaNormal8));
//
//		list3
//
//				.add(new ListItem(
//
//						"Si impegna ad inserire ogni dato richiesto nel sistema informatizzato di Ateneo ove previsto dalla Facolt‡"
//
//								+ " (orario di ricevimento, scheda dettagliata del programma di insegnamento, registro delle lezioni, verbali"
//
//								+ " d'esame, ecc.).", helveticaNormal8));
//
//		list3
//
//		.add(new ListItem(
//
//		"Si impegna a consegnare alla Presidenza di Facolt‡ in indirizzo:",
//
//		helveticaNormal8));
//
//		return list3;
//
//	}
//
//	private List lista4() {
//
//		List list4 = new List(false, 20);
//
//		list4.setIndentationLeft(25);
//
//		list4.setListSymbol(new Chunk("\u00b7", new Font(Font.COURIER, 20,
//
//		Font.BOLD, new Color(0, 0, 0))));
//
//		list4
//
//				.add(new ListItem(
//
//						"Entro 15 giorni dalla fine delle lezioni, esercitazioni e laboratori previsti a contratto, i relativi registri"
//
//								+ " compilati on-line e quindi stampati e debitamente firmati.",
//
//						helveticaNormal8));
//
//		list4
//
//				.add(new ListItem(
//
//						"Eventualmente dichiarazione di intervenuta modifica dei dati personali qui riportati, entro 15 giorni"
//
//								+ " dall'avvenuto cambiamento degli stessi.",
//
//						helveticaNormal8));
//
//		return list4;
//
//	}
//
//	private PdfPTable getTabellaAiSensi() throws DocumentException {
//
//		PdfPTable StringSensi = new PdfPTable(1);
//
//		StringSensi.setWidthPercentage(100);
//
//		float[] widthsTitolo = { 100 };
//
//		StringSensi.setWidths(widthsTitolo);
//
//		StringSensi.getDefaultCell().setBorderWidth(0.0f);
//
//		addRigheVuote(StringSensi, 1);
//
//		StringSensi
//
//				.addCell(new Phrase(
//
//						"Ai sensi del D. Lgs.vo n∞ 196/2003 autorizzo il trattamento dei dati personali.",
//
//						helveticaNormal8));
//
//		addRigheVuote(StringSensi, 2);
//
//		StringSensi
//
//				.addCell(new Phrase(
//
//						"Data ___________________                                        ________________________________________",
//
//						helveticaNormal8));
//
//		PdfPCell cellNomeCognome = new PdfPCell(new Phrase("(nome e cognome)",
//
//		helveticaNormal8));
//
//		cellNomeCognome.setBorderWidth(0.0f);
//
//		cellNomeCognome.setIndent(310);
//
//		StringSensi.addCell(cellNomeCognome);
//
//		return StringSensi;
//
//	}
//
//	private PdfPTable getNota() throws DocumentException {
//
//		PdfPTable StringNota = new PdfPTable(1);
//
//		StringNota.setWidthPercentage(100);
//
//		float[] widthsTitolo = { 100 };
//
//		StringNota.setWidths(widthsTitolo);
//
//		StringNota.getDefaultCell().setBorderWidth(0.0f);
//
//		StringNota
//
//				.addCell(new Phrase(
//
//						"(*) Gli studenti che completano il corso degli studi entro il 31 ottobre del corrente anno possono avanzare"
//
//								+ " domanda specificando tale loro condizione. L'eventuale affidamento Ë subordianto alla verifica del"
//
//								+ " completamento degli studi.", helveticaNormal8));
//
//		addRigheVuote(StringNota, 8);
//
//		return StringNota;
//
//	}
//
//	private PdfPTable getRiservato() throws DocumentException {
//
//		PdfPTable StringRiservato = new PdfPTable(1);
//
//		StringRiservato.setWidthPercentage(100);
//
//		float[] widthsTitolo = { 100 };
//
//		StringRiservato.setWidths(widthsTitolo);
//
//		StringRiservato.getDefaultCell().setPadding(3);
//
//		StringRiservato.getDefaultCell().setPaddingBottom(5);
//
//		StringRiservato.getDefaultCell().setBorderWidth(0.1f);
//
//		StringRiservato.addCell(new Phrase(
//
//		"SPAZIO RISERVATO ALLA PRESIDENZA\n", helveticaBold10));
//
//		StringRiservato
//
//				.addCell(new Phrase(
//
//						"Data inizio del contratto se diversa dal 1∞ novembre ________________________\n\n"
//
//								+ "CdF/G.d.F del: _________________________  [ ] Approvato   [ ] Non Approvato\n\n"
//
//								+ "Data invio lettera standard di proposta di conferimento _____________________\n\n"
//
//								+ "[ ]Consegnato registro\n\n"
//
//								+ "Data inoltro pagamento _________________\n\n",
//
//						helveticaNormal8));
//
//		StringRiservato.getDefaultCell().setBorderWidth(0.0f);
//
//		return StringRiservato;
//
//	}
//
//	private PdfPTable getAnagraficaFiscale() throws DocumentException {
//
//		PdfPTable tablePrevidenziale = new PdfPTable(1);
//
//		tablePrevidenziale.setWidthPercentage(100);
//
//		float[] widthsTitolo = { 100 };
//
//		tablePrevidenziale.setWidths(widthsTitolo);
//
//		tablePrevidenziale.getDefaultCell().setPadding(0);
//
//		//tablePrevidenziale.getDefaultCell().setPaddingBottom(5);
//
//		tablePrevidenziale.getDefaultCell().setBorderWidth(0.0f);
//
//		tablePrevidenziale.addCell(new Phrase(
//
//		"Dati per il trattamento previdenziale e fiscale", helveticaBold10));
//
//		tablePrevidenziale.addCell(new Phrase("il sottoscritto:", helveticaNormal10));
//
//		tablePrevidenziale.addCell(getElementiCognomeNome());
//
//		tablePrevidenziale.addCell(getElementiNascita());
//
//		tablePrevidenziale.addCell(getElementiCodiceFiscale());
//		
//		tablePrevidenziale.addCell("");
//
//		tablePrevidenziale
//
//				.addCell(new Phrase(
//
//						"In relazione all'incarico in corso di perfezionamento con codesto Politecnico",
//
//						helveticaNormal8));
//
//		tablePrevidenziale.addCell(new Phrase("Dichiara:", helveticaBold10));
//
//		return tablePrevidenziale;
//
//	}
//
//	private PdfPTable residenteEstero() throws DocumentException,
//			MalformedURLException, IOException {
//
//		PdfPTable lista = new PdfPTable(1);
//
//		lista.setWidthPercentage(100);
//
//		lista.getDefaultCell().setBorderWidth(0.0f);
//
//		List residente_estero_check = new List(false, 20);
//
//		residente_estero_check.setIndentationLeft(0);
//
//		residente_estero_check.setListSymbol(getChunkCheckBoxImage());
//
//		residente_estero_check.add(new ListItem(
//				"Di essere residente all'estero", helveticaNormal8));
//
//		List residenteSublist = new List(false, 20);
//
//		residenteSublist.setIndentationLeft(20);
//
//		residenteSublist.setListSymbol(getChunkCheckBoxImage());
//
//		residenteSublist
//				.add(new ListItem(
//						"di avvalermi della convenzione per evitare la doppia imposizione fiscale"
//								+ " tra Italia e (stato estero di residenza)____________________________",
//						helveticaNormal8));
//		residenteSublist.add(new ListItem("di non avvalermi della convenzione",
//				helveticaNormal8));
//
//		PdfPCell cella = new PdfPCell();
//		cella.setBorderWidth(0.0f);
//		cella.addElement(residente_estero_check);
//		cella.addElement(residenteSublist);
//		lista.addCell(cella);
//
//		// cellaTestoColspan2.setPhrase(new Phrase("Di essere residente
//		// all'estero", normal8));
//		//
//		// lista.addCell(cellaTestoColspan2);
//		//
//		//		
//		//
//		// lista.addCell("");
//		//
//		//		
//		//
//		// cellaBox = new PdfPCell();
//		//
//		// cellaBox.setBorderWidth(0.1f);
//		//
//		// lista.addCell(cellaBox);
//		//
//		//		
//		//
//		// cellaTestoColspan2 = new PdfPCell();
//		//
//		// cellaTestoColspan2.setBorderWidth(0.0f);
//		//
//		// cellaTestoColspan2.setPhrase(new Phrase("di avvalermi della
//		// convenzione per evitare la doppia imposizione fiscale"
//		//
//		// + " tra Italia e (stato estero di
//		// residenza)____________________________",
//		//
//		// normal8));
//		//
//		// lista.addCell(cellaTestoColspan2);
//		//
//		//		
//		//
//		// lista.addCell("");
//		//
//		//		
//		//
//		// cellaBox = new PdfPCell();
//		//
//		// cellaBox.setBorderWidth(0.1f);
//		//
//		// lista.addCell(cellaBox);
//		//
//		//		
//		//
//		// cellaTestoColspan2 = new PdfPCell();
//		//
//		// cellaTestoColspan2.setBorderWidth(0.0f);
//		//
//		// cellaTestoColspan2.setPhrase(new Phrase("di non avvalermi della
//		// convenzione", normal8));
//		//
//		// lista.addCell(cellaTestoColspan2);
//		//
//		//		
//		//
//		//		
//		//
//		//		
//		//
//		//		
//
//		return lista;
//
//	}
//
//	private List dipendentePubblico1() throws BadElementException,
//			MalformedURLException, IOException {
//
//		List dipendente_pubblico = new List(false, 20);
//
//		dipendente_pubblico.setIndentationLeft(0);
//
//		dipendente_pubblico.setListSymbol(getChunkCheckBoxImage());
//
//		dipendente_pubblico
//				.add(new ListItem(
//						"Di essere dipendente di un Ente pubblico e/o Personale Docente di ruolo di Università private"
//								+ " Per la rilevazione ai fini dell'anagrafe delle prestazioni dei pubblici dipendenti, di cui all'art."
//
//								+ " 53 D.Lgs. 30.03.2001, n. 165, all'atto della sottoscrizione del contratto deve essere consegnata la"
//								+ " preventiva autorizzazione dell'Amministrazione Pubblica di appartenenza riferita all'intera durata"
//								+ " dell'incarico. I dati dell'Amministrazione Pubblica a cui inviare la comunicazione dei compensi"
//								+ " percepiti sono:\n"
//								+ "Denominazione__________________________________________________________________\n"
//								+ "Indirizzo________________________________________________________________________",helveticaNormal8));
//		
//		return dipendente_pubblico;
//
//	}
//
//	private List dipendentePubblico2() throws BadElementException, MalformedURLException, IOException {
//
//		List dipendente_pubblico = new List(false, 20);
//
//		dipendente_pubblico.setIndentationLeft(20);
//		dipendente_pubblico.setListSymbol(getChunkCheckBoxImage());
//		dipendente_pubblico.add(new ListItem("Non vi è l'obbligo della comunicazione in quanto:",helveticaNormal8));
//
//		return dipendente_pubblico;
//
//	}
//	
//	
//	private List getDipendentePubblicotre() throws BadElementException, MalformedURLException, IOException{
//		List dipendente_pubblico = new List(false, 20);
//
//		
//		dipendente_pubblico.setIndentationLeft(40);
//		dipendente_pubblico.setListSymbol(getChunkCheckBoxImage());
//
//		
//		dipendente_pubblico.add(new ListItem("professore a tempo definito;",
//
//		helveticaNormal8));
//
//		dipendente_pubblico
//
//				.add(new ListItem(
//
//						"dipendente con rapporto di lavoro a tempo parziale non superiore al 50%;",
//
//						helveticaNormal8));
//
//		dipendente_pubblico.add(new ListItem(
//
//		"altro_____________________________.", helveticaNormal8));
//
//		return dipendente_pubblico;
//		
//		
//		
//	}
//
//	private PdfPTable prestazioneProfessionale() throws DocumentException {
//
//		PdfPTable StringPrestazione = new PdfPTable(1);
//
//		StringPrestazione.setWidthPercentage(100);
//
//		float[] widthsTitolo = { 100 };
//
//		StringPrestazione.setWidths(widthsTitolo);
//
//		StringPrestazione.getDefaultCell().setPadding(3);
//
//		
//		StringPrestazione.getDefaultCell().setBorderWidth(0.0f);
//
//		StringPrestazione.addCell(new Phrase(
//
//		"Incarico per prestazione Professionale:", helveticaBold10));
//
//		return StringPrestazione;
//
//	}
//
//	private List prestazioneProfessionale2() throws BadElementException, MalformedURLException, IOException {
//
//		List prestazione_professionale = new List(false, 20);
//
//		prestazione_professionale.setIndentationLeft(0);
//
//		prestazione_professionale.setListSymbol(getChunkCheckBoxImage());
//
//		prestazione_professionale
//
//				.add(new ListItem(
//
//						"Di essere titolare di partita IVA n°__________________________________________________",
//
//						helveticaNormal8));
//
//		prestazione_professionale
//
//				.add(new ListItem(
//
//						"Di essere iscritto all'albo o elenco professionale______________________________",
//
//						helveticaNormal8));
//
//		prestazione_professionale
//
//				.add(new ListItem(
//
//						"Di svolgere la seguente professione _________________________________________________",
//
//						helveticaNormal8));
//
//		prestazione_professionale
//
//				.add(new ListItem(
//
//						"Di essere iscritto alla cassa o ente previdenziale ___________________________________",
//
//						helveticaNormal8));
//
//		prestazione_professionale.add(new ListItem(
//
//		"Di essere residente all'estero con:\n", helveticaNormal8));
//
//		return prestazione_professionale;
//
//	}
//
//	private List prestazioneProfessionale3() throws BadElementException, MalformedURLException, IOException {
//
//		List prestazione_professionale = new List(false, 20);
//
//		prestazione_professionale.setIndentationLeft(20);
//
//		prestazione_professionale.setListSymbol(getChunkCheckBoxImage());
//
//		prestazione_professionale
//
//				.add(new ListItem(
//
//						"Numero di Partita IVA ordinaria ___________________________________________________",
//
//						helveticaNormal8));
//
//		prestazione_professionale
//
//				.add(new ListItem(
//
//						"Numero di Partita IVA ordinaria che non genera soggettivit‡ passiva piena _________________",
//
//						helveticaNormal8));
//
//		return prestazione_professionale;
//
//	}
//
//	private PdfPTable collaborazioneCoordinata() throws DocumentException {
//
//		PdfPTable StringCollaborazione = new PdfPTable(1);
//
//		StringCollaborazione.setWidthPercentage(100);
//
//		float[] widthsTitolo = { 100 };
//
//		StringCollaborazione.setWidths(widthsTitolo);
//
//		StringCollaborazione.getDefaultCell().setPadding(3);
//
//		StringCollaborazione.getDefaultCell().setPaddingBottom(5);
//
//		StringCollaborazione.getDefaultCell().setBorderWidth(0.0f);
//
//		StringCollaborazione.addCell(new Phrase(
//
//		"Incarico di collaborazione coordinata e continuativa:",
//
//		new Font(Font.HELVETICA, 10, Font.BOLD)));
//
//		StringCollaborazione
//
//				.addCell(new Phrase(
//
//						"(art.50, primo comma, lettera c-bis, D.P.R. 917/1986. L'attivit‡ richiesta sar‡ svolta senza vincolo di subordinazione,)"
//
//								+ "non rientrante nei compiti istituzionali contrattualmente definiti di lavoratore dipendente e non rientrante nell'oggetto della,"
//
//								+ "eventuale professione abitualmente svolta).",
//
//						helveticaNormal8));
//
//		return StringCollaborazione;
//
//	}
//
//	private List collaborazioneCoordinata1() throws BadElementException, MalformedURLException, IOException {
//
//		List collaborazione_coordinata = new List(false, 20);
//
//		collaborazione_coordinata.setIndentationLeft(0);
//
//		collaborazione_coordinata.setListSymbol(getChunkCheckBoxImage());
//
//		collaborazione_coordinata
//
//				.add(new ListItem(
//
//						"Di essere iscritto alla gestione separata INPS di cui all'art.2, comma 26 della legge 8 agosto 1995, n.335",
//
//						helveticaNormal8));
//
//		return collaborazione_coordinata;
//
//	}
//
//	private List collaborazioneCoordinata2() throws BadElementException, MalformedURLException, IOException {
//
//		List collaborazione_coordinata = new List(false, 20);
//
//		
//
//		collaborazione_coordinata.setIndentationLeft(20);
//
//		collaborazione_coordinata.setListSymbol(getChunkCheckBoxImage());
//
//		collaborazione_coordinata
//
//		.add(new ListItem(
//
//		"Di essere soggetto al contributo INPS nella misura del 23,50%",
//
//		helveticaNormal8));
//
//		collaborazione_coordinata
//
//				.add(new ListItem(
//
//						"Di essere soggetto al contributo INPS nella misura del 16,00%\n"
//
//								+ "In quanto titolare di pensione e/o iscritto ad altra forma di previdenza obbligatoria (indicare quale):\n"
//
//								+ "______________________________________________________________________________",
//
//						helveticaNormal8));
//
//		return collaborazione_coordinata;
//
//	}
//
//	private List collaborazioneCoordinata3() throws BadElementException, MalformedURLException, IOException {
//
//		List collaborazione_coordinata = new List(false, 20);
//
//		collaborazione_coordinata.setIndentationLeft(20);
//
//		collaborazione_coordinata.setListSymbol(getChunkCheckBoxImage());
//
//		collaborazione_coordinata
//
//				.add(new ListItem(
//
//						"Intende richiedere le detrazioni di imposta (art. 12 e 13 del D.P.R. 917/86) - N.B.: allegare modulo",
//
//						helveticaNormal8));
//
//		return collaborazione_coordinata;
//
//	}
//
//	private PdfPTable getCoordinateBancarie() throws DocumentException {
//
//		PdfPTable bancarie = new PdfPTable(5);
//
//		float myWidths[] = { 4.0f, 17.0f, 0.0f, 2.0f, 50.0f };
//
//		bancarie.setWidthPercentage(100);
//
//		bancarie.setWidths(myWidths);
//
//		bancarie.getDefaultCell().setBorderWidth(0.0f);
//
//		bancarie.getDefaultCell().setPadding(2);
//
//		bancarie.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
//
//		bancarie.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
//
//		// bancarie.addCell(new Phrase(
//
//		// "Di scegliere la seguente modalit‡ di pagamento:", new Font(
//
//		// Font.HELVETICA, 10, Font.BOLD)));
//
//		// bancarie.addCell(new Phrase(""));
//
//		// bancarie.addCell(new Phrase(""));
//
//		// bancarie.addCell(new Phrase(""));
//
//		// bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase("IBAN", helveticaNormal8));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(new Phrase(""));
//
//		bancarie.addCell(getTabellaCoordinate());
//
//		// domicilio1.addCell(new Phrase("Indirizzo", new Font(Font.HELVETICA,
//
//		// 8,
//
//		// Font.BOLD)));
//
//		// domicilio1.addCell(new Phrase(""));
//
//		// domicilio1.addCell(new Phrase("n∞ civico", new Font(Font.HELVETICA,
//
//		// 8,
//
//		// Font.BOLD)));
//
//		// domicilio1.addCell(new Phrase(""));
//
//		// domicilio1.addCell(new Phrase("Telefono", new Font(Font.HELVETICA, 8,
//
//		// Font.BOLD)));
//
//		//
//
//		bancarie.addCell(getBorderField("B"));
//
//		bancarie.addCell(new Phrase("Versamento sul c/c n."));
//
//		bancarie.addCell(new Phrase(" "));
//
//		bancarie.addCell(new Phrase(" "));
//
//		bancarie.addCell(new Phrase(" "));
//
//		bancarie.addCell(getBorderField(""));
//
//		return bancarie;
//
//	}
//
//	private PdfPTable getTabellaCoordinate() throws DocumentException {
//
//		PdfPTable tabella_coordinate = new PdfPTable(27);
//
//		float myWidths[] = { 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f,
//				3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f,
//				3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f, 3.7f };
//
//		tabella_coordinate.setWidthPercentage(100);
//
//		tabella_coordinate.setWidths(myWidths);
//
//		tabella_coordinate.getDefaultCell().setBorderWidth(0.1f);
//
//		tabella_coordinate.getDefaultCell().setPadding(2);
//
//		for (int i = 0; i < myWidths.length; i++) {
//
//			tabella_coordinate.addCell("A");
//
//		}
//
//		return tabella_coordinate;
//
//	}

}
