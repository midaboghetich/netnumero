package com.numhero.server.service;

import com.numhero.server.model.dao.BaseDaoTest;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.*;

/**
 * Created by IntelliJ IDEA.
 * User: uberto
 * Date: Jun 24, 2010
 * Time: 11:53:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class RestCreateNewSessionTest extends BaseDaoTest {
	private RestCreateNewSession r;

	@Before
	public void setUp() throws Exception {
        super.setUp();
		r = new RestCreateNewSession();

	}

    @Test
    public void testProcess() throws Exception {
        HttpServletResponse httpResp = mock(HttpServletResponse.class);
        HttpServletRequest httpReq = mock(HttpServletRequest.class);
        when(httpReq.getRequestURI()).thenReturn("/rest/createNewSession");
        when(httpReq.getMethod()).thenReturn("POST");

        r.process(httpReq, httpResp);
        verify(httpResp).sendError(400); //missing parameters
    }

    @Test
    public void testProcessWrongHash() throws Exception {
        HttpServletResponse httpResp = mock(HttpServletResponse.class);
        HttpServletRequest httpReq = mock(HttpServletRequest.class);
        when(httpReq.getRequestURI()).thenReturn("/rest/createNewSession");
        when(httpReq.getParameter("userId")).thenReturn("1");
        when(httpReq.getParameter("userVersion")).thenReturn("1");
        when(httpReq.getParameter("requestId")).thenReturn("1");
        when(httpReq.getParameter("hash")).thenReturn("12345");


        when(httpReq.getMethod()).thenReturn("POST");

        r.process(httpReq, httpResp);
        verify(httpResp).setContentType("text/xml");
        verify(httpResp).sendError(403, "Provided hash is not valid. This request is traced.");
    }

}
