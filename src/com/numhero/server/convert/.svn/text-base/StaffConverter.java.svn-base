package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.server.model.pojo.Staff;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Singleton
public class StaffConverter {

    private static Log log = LogFactory.getLog(StaffConverter.class);


    public void mergeIntoStaff(StaffC staffC, Staff staff) {

        staff.setId(staffC.getId());
        staff.setType(staffC.getStaffType());
        staff.setName(staffC.getName());
        staff.setContactPhone(staffC.getPhone());
        staff.setCompanyFax(staffC.getFax());
        staff.setAddress(staffC.getAddress());
        staff.setCity(staffC.getCity());
        staff.setRegion(staffC.getRegion());
        staff.setZipCode(staffC.getZipCode());
        staff.setCountry(staffC.getCountry());
        staff.setNotes(staffC.getNotes());
        staff.setCreated(staffC.getCreated());
    }

    public StaffC toStaffC(Staff staff) {

        StaffC staffC = new StaffC();
        staffC.setId(staff.getId());
        staffC.setStaffType(staff.getType());
        staffC.setName(staff.getName());
        staffC.setPhone(staff.getContactPhone());
        staffC.setFax(staff.getCompanyFax());
        staffC.setAddress(staff.getAddress());
        staffC.setCity(staff.getCity());
        staffC.setRegion(staff.getRegion());
        staffC.setZipCode(staff.getZipCode());
        staffC.setCountry(staff.getCountry());
        staffC.setNotes(staff.getNotes());
        staffC.setCreated(staff.getCreated());
        
        return staffC;
    }
}