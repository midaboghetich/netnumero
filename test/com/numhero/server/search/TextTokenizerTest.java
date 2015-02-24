package com.numhero.server.search;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.numhero.server.NumheroUtils;

public class TextTokenizerTest extends TestCase {

	@Test
	public void testTokens() {
		TextTokenizer textTokenizer = NumheroUtils.injector.getInstance(TextTokenizer.class);
		List<String> tokens = textTokenizer.getTokens("the brown fox jumps over the green fence");
		System.out.println("tokens:");
		for (String token : tokens) {
			System.out.print(token + ", ");
		}
		System.out.println();

		assertEquals(6, tokens.size());
	}
}
