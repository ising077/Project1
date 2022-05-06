package com.reimbursement;

import com.reimbursement.models.Reimbursement;
import com.reimbursement.services.ReimbursementService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTests {

    @Autowired
    ReimbursementService reimbursementService;

    @Test
    public void doesGetReimbursementWork()
    {
        Reimbursement r = reimbursementService.getReimbursement(1);
        Assertions.assertEquals(1,r.getId());
    }
}
