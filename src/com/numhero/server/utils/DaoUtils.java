package com.numhero.server.utils;

import com.numhero.server.model.pojo.Persistable;
import com.numhero.shared.datacargo.CommandRequest;

import java.util.Date;

public class DaoUtils {

    public static void setData(CommandRequest request, Persistable pojo) {
        pojo.setBusinessAccountId(request.getBusinessAccountId());
        pojo.setCreated(new Date());
    }
}
