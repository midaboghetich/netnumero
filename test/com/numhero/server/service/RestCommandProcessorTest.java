package com.numhero.server.service;

import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.invoice.GetInvoiceRequest;
import com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest;
import com.numhero.client.model.datacargo.user.GetUserRequest;
import com.numhero.client.model.datacargo.user.SaveUserRequest;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.server.model.dao.BaseDaoTest;
import com.numhero.shared.datacargo.GetSingleEntityRequest;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.enums.ClientSupplierEnum;
import com.numhero.shared.enums.CurrencyEnum;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.numhero.server.utils.XmlUtils.serializeEntity;
import static org.mockito.Mockito.*;

public class RestCommandProcessorTest extends BaseDaoTest {
    @Test
    public void testIsUriOk() throws Exception {
        RestCommandPreProcessor r = new RestCommandPreProcessor();
        assertTrue(r.isUriOk("/rest/mycompany/search/invoices"));
        assertTrue(r.isUriOk("/rest/mycompany/invoice/12"));
        assertFalse(r.isUriOk("/rest/mycompany/invoices"));
        assertFalse(r.isUriOk("/rest/mycompany/invoice/1223/abc"));

        assertFalse(r.isUriOk("/pippocamminadritto"));

    }

    @Test
    public void testProcess() throws Exception {
        RestCommandPreProcessor p = new RestCommandPreProcessor();
        UserC u = createUser();
        u.setId(null);
        StringBuffer xml = new StringBuffer();
        serializeEntity(xml, u);

        HttpServletResponse httpResp = mock(HttpServletResponse.class);
        HttpServletRequest httpReq = mock(HttpServletRequest.class);
        when(httpReq.getRequestURI()).thenReturn("/rest/mycompany/user/12");
        when(httpReq.getMethod()).thenReturn("POST");
        when(httpReq.getParameter("entity")).thenReturn(xml.toString());
        PrintWriter mockWriter = mock(PrintWriter.class);
        when(httpResp.getWriter()).thenReturn(mockWriter);
        p.process(httpReq, httpResp);
        verify(mockWriter).println("<id>agR0ZXN0cgoLEgRVc2VyGAEM</id>");
    }


    @Test
    public void testCreateGetInvoiceRequest(){
        RestCommandPreProcessor p = new RestCommandPreProcessor();
        GetSingleEntityRequest req = (GetSingleEntityRequest) p.createRequest("/rest/mycompany/invoice/12", "GET", "");
        assertEquals(GetInvoiceRequest.class.getName(), req.getClass().getName());
        assertEquals("12", req.getEntityId());
        assertEquals("mycompany", req.getBusinessAccountId());
    }

    @Test
    public void testCreateGetUserRequest(){
        RestCommandPreProcessor p = new RestCommandPreProcessor();
        GetSingleEntityRequest req = (GetSingleEntityRequest) p.createRequest("/rest/mycompany/user/12", "GET", "");
        assertEquals(GetUserRequest.class.getName(), req.getClass().getName());
        assertEquals("12", req.getEntityId());
        assertEquals("mycompany", req.getBusinessAccountId());
    }


	@Test
    public void testCreateSaveClientRequest(){
		ClientSupplierC c = createClientSupplierC();
        StringBuffer xml = new StringBuffer();
        serializeEntity(xml, c);
        System.out.println("xml " + xml.toString());
        RestCommandPreProcessor p = new RestCommandPreProcessor();
        SaveSingleEntityRequest req = (SaveSingleEntityRequest) p.createRequest("/rest/mycompany/client_supplier/12", "POST", xml.toString());
        assertEquals(SaveClientSupplierRequest.class.getName(), req.getClass().getName());
        assertEquals(ClientSupplierC.class, req.getEntity().getClass());
        assertEquals("mycompany", req.getBusinessAccountId());
    }

	@Test
    public void testCreateSaveInvoiceRequest(){
        InvoiceC inv = createInvoice();
        StringBuffer xml = new StringBuffer();
        serializeEntity(xml, inv);
        //System.out.println("xml " + xml.toString());
        RestCommandPreProcessor p = new RestCommandPreProcessor();

        SaveSingleEntityRequest req = (SaveSingleEntityRequest) p.createRequest("/rest/mycompany/invoice/12", "POST", xml.toString());
        assertEquals(SaveInvoiceRequest.class.getName(), req.getClass().getName());
        assertEquals("mycompany", req.getBusinessAccountId());
        InvoiceC respInv = (InvoiceC) req.getEntity();
        assertEquals(inv.getNotes(), respInv.getNotes());
        assertEquals(inv.getCurrency(), respInv.getCurrency());
        assertEquals(inv.getPrice(), respInv.getPrice());

    }

    @Test
    public void testCreateSaveUserRequest(){
        UserC u = createUser();
        StringBuffer xml = new StringBuffer();
        serializeEntity(xml, u);
        System.out.println("xml " + xml.toString());
        RestCommandPreProcessor p = new RestCommandPreProcessor();

        SaveSingleEntityRequest req = (SaveSingleEntityRequest) p.createRequest("/rest/mycompany/user/12", "POST", xml.toString());
        assertEquals(SaveUserRequest.class.getName(), req.getClass().getName());
        assertEquals("mycompany", req.getBusinessAccountId());
        UserC respU = ((SaveUserRequest) req).getUserC();
        assertEquals(u.getFirstName(), respU.getFirstName());
        assertEquals(u.getLastName(), respU.getLastName());
        assertEquals(u.getId(), respU.getId());
        assertEquals(u.getBusinessAccountId(), respU.getBusinessAccountId());

    }

	private ClientSupplierC createClientSupplierC() {
		ClientSupplierC c = new ClientSupplierC();
		c.setNotes("notes");
		c.setAddress("via della Spiga");
		c.setCompanyName("Camiceria Mariella s.n.c.");
		c.setType(ClientSupplierEnum.both);
		return c;
	}

    private UserC createUser() {
        UserC u = new UserC();
        u.setId("12");
        u.setBusinessAccountId("gama");
        u.setFirstName("ubi");
        u.setLastName("barbini");
        return u;
    }

    private InvoiceC createInvoice() {
        InvoiceC invoiceC = new InvoiceC();
        invoiceC.setCurrency(CurrencyEnum.EUR);
        invoiceC.setNotes("notes");
        invoiceC.setPrice(123.45);
        return invoiceC;
    }


}
