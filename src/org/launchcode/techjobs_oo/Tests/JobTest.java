package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;;


public class JobTest {
    Job testJob1 = new Job();
    Job testJob2 = new Job();
    Job testJob3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job testJob4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job testJob5 = new Job("Kim", new Employer("Walgreen"), new Location(""), new PositionType("ASM"), new CoreCompetency(""));
    Job testJob6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

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
        assertEquals("Quality Control", testJob3.getPositionType().toString());
        assertEquals("Persistence", testJob3.getCoreCompetency().toString());
    }
    //Checks that Id's are different for each job, making all jobs be different:
    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3.equals(testJob4));
    }
    //Checks if code starts and ends with a blank line:
    @Test
    public void toStringBlankLineTest() {
        String[] toStringTestJob = Job.toString(testJob3).split("\n");
        assertTrue(toStringTestJob[0].isBlank());
       // assertTrue(toStringTestJob[toStringTestJob.length-1].isBlank());
    }
    //Checks that each field returns the label and value:
    @Test
    public void toStringLabelReturned() {
        String toStringLabelValueTestJob = Job.toString(testJob3);
        assertTrue(toStringLabelValueTestJob.contains("ID: 3"));
        assertTrue(toStringLabelValueTestJob.contains("Name: Product Tester"));
        assertTrue(toStringLabelValueTestJob.contains("Employer: ACME"));
        assertTrue(toStringLabelValueTestJob.contains("Location: Desert"));
        assertTrue(toStringLabelValueTestJob.contains("Position Type: Quality Control"));
        assertTrue(toStringLabelValueTestJob.contains("Core Competency: Persistence"));
    }
    //Will make sure method returns "data not available" if there are missing fields:
    @Test
    public void toStringLeftBlankResults() {
        String toStringBlankFieldsResults = Job.toString(testJob5);
        assertTrue(toStringBlankFieldsResults.contains("Data not available"));
    }
    //BONUS: Checks that method returns "OOPS!...." if all field are left blank:
    @Test
    public void toStringDoesNotExist() {
        String toStringAllBlank = Job.toString(testJob6);
        assertTrue(toStringAllBlank.contains("OOPS! This job does not seem to exist."));
    }
}
