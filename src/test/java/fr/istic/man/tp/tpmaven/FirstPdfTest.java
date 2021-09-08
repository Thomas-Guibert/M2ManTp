package fr.istic.man.tp.tpmaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itextpdf.text.Document;

import fr.esir.mdi.ci.tpmaven.FirstPdf;

class FirstPdfTest extends FirstPdf {

	@Test
	void test() {
		assertTrue(true);
	}

	@Test
	void test2() {
		Document document = new Document();
		Document doc = document;
		addMetaData(document);
		assertEquals(doc,document);
	}
}
