package com.numhero.server.utils;

import org.junit.Test;

import static com.numhero.shared.util.SharedUtils.initialUppercase;
import static com.numhero.shared.util.SharedUtils.initialUppercaseAndCamel;
import static com.numhero.shared.util.SharedUtils.splitUri;
import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: uberto
 * Date: Jun 13, 2010
 * Time: 4:33:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SharedUtilsTest {



    @Test
    public void testSplitUri() throws Exception {
        assertEquals(4, splitUri("/pippo/cammina/dritto#123?1234").length);
        assertEquals(3, splitUri("pippo/cammina/dritto#123?1234").length);
        assertEquals(4, splitUri("/pippo/cammina/dritto").length);
    }

    @Test
    public void testInitialUppercase() throws Exception {
        assertEquals("Allù", initialUppercase("aLlÙ"));
    }

     @Test
    public void testInitialUppercaseAndCamel() throws Exception {
        assertEquals("MioCane", initialUppercaseAndCamel("mio_cane"));
        assertEquals("Miocane", initialUppercaseAndCamel("miocane"));
		assertEquals("Miocane", initialUppercaseAndCamel("_miocane"));
	 }


}
