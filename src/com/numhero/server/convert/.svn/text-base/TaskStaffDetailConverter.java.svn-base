package com.numhero.server.convert;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.TaskStaffDetailC;
import com.numhero.server.model.pojo.TaskStaffDetail;

@Singleton
public class TaskStaffDetailConverter {

    @Inject
    private TaxInfoConverter taxInfoConverter;

    public void mergeIntoTaskStaffDetail(TaskStaffDetailC invoiceDetailC, TaskStaffDetail invoiceDetail) {
        invoiceDetail.setId(invoiceDetailC.getId());
        invoiceDetail.setStaffId(invoiceDetailC.getStaffId());
        invoiceDetail.setName(invoiceDetailC.getName());
        invoiceDetail.setCreated(invoiceDetailC.getCreated());
    }

    public TaskStaffDetailC toTaskStaffDetailC(TaskStaffDetail invoiceDetail) {
        TaskStaffDetailC invoiceDetailC = new TaskStaffDetailC();
        invoiceDetailC.setId(invoiceDetail.getId());
        invoiceDetailC.setStaffId(invoiceDetail.getStaffId());
        invoiceDetailC.setName(invoiceDetail.getName());
        invoiceDetailC.setCreated(invoiceDetail.getCreated());
        return invoiceDetailC;
    }
}