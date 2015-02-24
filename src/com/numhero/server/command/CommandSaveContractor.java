package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.staff.SaveContractorRequest;
import com.numhero.client.model.datacargo.staff.SaveStaffResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.server.convert.StaffConverter;
import com.numhero.server.model.dao.StaffDao;
import com.numhero.server.model.pojo.Staff;
import com.numhero.server.utils.DaoUtils;
import com.numhero.shared.enums.StaffTypeEnum;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveContractor extends AbstractAuthenticatedCommand<SaveContractorRequest, SaveStaffResponse> {
    private static Log log = LogFactory.getLog(CommandSaveContractor.class);

    @Inject
    StaffDao staffDao;

    @Inject
    StaffConverter staffConverter;

    @Override
    public SaveStaffResponse execute(SaveContractorRequest request) {

        Staff staff = null;

        StaffC staffC = request.getStaffC();

        System.out.println("staffC.getName() = " + staffC.getName());

        String id = staffC.getId();
        if (id == null || id.isEmpty()) {
            staffC.setId(null);
            staff = new Staff();
            staff.setType(StaffTypeEnum.Contractor);
        } else staff = staffDao.get(id);

        staffConverter.mergeIntoStaff(staffC, staff);
        DaoUtils.setData(request, staff);

        System.out.println("staff = " + staff);
        staffDao.save(staff);

        SaveStaffResponse response = new SaveStaffResponse();
        response.setEntityId(staff.getId());
        return response;
    }
}