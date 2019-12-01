package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertTrue;


public class JobTest {

        Job testJob1 = new Job();
        Job testJob2 = new Job();
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Making sure different Id's are assigned:
        @Test
        public void testSettingJobId() {
            assertTrue(testJob1.getId() + 1 == testJob2.getId());
        }

        //Making sure Job contains all 6 fields:
    @Test
    public void testJobConstructorSetsAllFields() {

    }

}
