package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;;


public class JobTest {

        Job testJob1 = new Job();
        Job testJob2 = new Job();
        Job testJob3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job testJob4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        //Making sure different Id's are assigned:
        @Test
        public void testSettingJobId() {
            assertTrue(testJob1.getId() + 1 == testJob2.getId());
        }

        //Making sure Job contains all 6 fields:
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(3, testJob3.getId());
        assertEquals("Product Tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().toString());
        assertEquals("Desert", testJob3.getLocation().toString());
       // assertEquals("Quality Control", testJob3.getPositionType().toString());
        assertEquals("Persistence", testJob3.getCoreCompetency().toString());
    }
    //Checks that id's are different for each job, making all jobs be different:
    @Test
    public void testJobsForEquality() {
            assertFalse(testJob3.equals(testJob4));
    }
    //
    @Test
    public void toStringBlankLineTest() {
            String[] toStringTestJob = Job.toString(testJob3).split("\n");
            assertTrue(toStringTestJob[0].isBlank());
         //   assertTrue(toStringTestJob[toStringTestJob.length-1].isBlank());
    }
}
