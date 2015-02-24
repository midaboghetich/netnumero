package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.staff.SaveInternalRequest;
import com.numhero.client.model.datacargo.staff.SaveStaffResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.server.convert.StaffConverter;
import com.numhero.server.model.dao.StaffDao;
import com.numhero.server.model.pojo.Staff;
import com.numhero.server.utils.DaoUtils;
import com.numhero.shared.enums.StaffTypeEnum;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveInternal extends AbstractAuthenticatedCommand<SaveInternalRequest, SaveStaffResponse> {
    private static Log log = LogFactory.getLog(CommandSaveInternal.class);

    @Inject
    StaffDao staffDao;

    @Inject
    StaffConverter staffConverter;

    @Override
    public SaveStaffResponse execute(SaveInternalRequest request) {

        Staff staff = null;

        StaffC staffC = request.getStaffC();
        String id = staffC.getId();
        if (id == null || id.isEmpty()) {
            staffC.setId(null);
            staff = new Staff();
            staff.setType(StaffTypeEnum.Internal);

        } else staff = staffDao.get(id);

        staffConverter.mergeIntoStaff(staffC, staff);
//        staff.setBusinessAccountId(request.getBusinessAccountId());

        DaoUtils.setData(request, staff);
        
        staffDao.save(staff);

        SaveStaffResponse response = new SaveStaffResponse();
        response.setEntityId(staff.getId());
        return response;
    }
}