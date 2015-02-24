package com.numhero.server.convert;

import junit.framework.TestCase;

import com.numhero.client.model.pojoc.UserC;
import com.numhero.server.model.pojo.PojoTestUtils;
import com.numhero.server.model.pojo.User;

public class UserConverterTest extends TestCase {

    User user;
    UserC userC;
    UserConverter converter = new UserConverter();

    private void initTest() {
        user = PojoTestUtils.createUser();
        userC = converter.toUserC(user);
    }
    
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMergeIntoInvoice() throws Exception {
        initTest();

        assertEquals(userC.getBusinessAccountId(),userC.getBusinessAccountId());
        assertEquals(userC.getFirstName(),userC.getFirstName());
        assertEquals(userC.getLastLogin(),userC.getLastLogin());
        assertEquals(userC.getLastName(),userC.getLastName());
    
        assertEquals(userC.getUserProfile(),userC.getUserProfile());
        
        
    }

    public void testToUserC() throws Exception {
        initTest();
        user = new User();
        converter.mergeIntoUser(userC, user);
        
        assertEquals(userC.getBusinessAccountId(),userC.getBusinessAccountId());
        assertEquals(userC.getFirstName(),userC.getFirstName());
        assertEquals(userC.getLastLogin(),userC.getLastLogin());
        assertEquals(userC.getLastName(),userC.getLastName());

        assertEquals(userC.getUserProfile(),userC.getUserProfile());
    }


}
