package com.numhero.server.service;

import com.numhero.server.model.dao.BaseDaoTest;

public class DataServiceImplTest extends BaseDaoTest {
	//we should try with a not auth command or we need to put the cookie in the threadlocal
//	@Test
//	public void testExecute() throws Exception {
//
//		        DataServiceImpl p = new DataServiceImpl();
////        UserC u = createUser();
////        u.setId(null);
////        StringBuffer xml = new StringBuffer();
////        serializeEntity(xml, u);
////
////        HttpServletResponse httpResp = mock(HttpServletResponse.class);
////        HttpServletRequest httpReq = mock(HttpServletRequest.class);
////        when(httpReq.getRequestURI()).thenReturn("/rest/mycompany/user/12");
////        when(httpReq.getMethod()).thenReturn("POST");
////        when(httpReq.getParameter("entity")).thenReturn(xml.toString());
////        PrintWriter mockWriter = mock(PrintWriter.class);
////        when(httpResp.getWriter()).thenReturn(mockWriter);
//		BulkActionRequest req = new DeleteClientSupplierRequest();
//		req.getEntityIdList().add("1");
//		req.getEntityIdList().add("2");
//		req.getEntityIdList().add("3");
//		BulkActionResponse resp = p.execute(req);
//
//		assertNotNull(resp);
//		assertEquals(req.getEntityIdList(), resp.getSuccessIdList());
//		assertEquals(0, resp.getFailureIdList().size());
//
// //       verify(mockWriter).println("<id>agR0ZXN0cgoLEgRVc2VyGAEM</id>");
//
//
//	}
}
