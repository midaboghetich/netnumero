package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.staff.StaffListRequest;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.server.convert.StaffConverter;
import com.numhero.server.model.dao.StaffDao;
import com.numhero.server.model.pojo.Staff;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class CommandGetStaffs extends AbstractAuthenticatedCommand<StaffListRequest, StaffListResponse> {

    private static Log log = LogFactory.getLog(CommandGetInvoices.class);

    @Inject
    StaffDao staffDao;

    @Inject
    StaffConverter staffConverter;

    @Override
    public StaffListResponse execute(StaffListRequest request) {
        StaffListResponse response = new StaffListResponse();

        List<Staff> staffs = staffDao.findAll(request.getBusinessAccountId());

        for (Staff invoice : staffs) {
            StaffC invoiceC = staffConverter.toStaffC(invoice);
            response.getStaffCList().add(invoiceC);
        }

        log.debug("retrieved " + response.getStaffCList());
        return response;
    }
}