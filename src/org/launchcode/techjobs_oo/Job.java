package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    //Variables:
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //Constructors:
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    //Getters and setters:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
    //toString:

    public static String toString(Job jobValues) {
        int jobValuesId = jobValues.getId();
        String jobValuesName = jobValues.getName();
        String jobValuesEmployer = jobValues.getEmployer().toString();
        String jobValuesLocation = jobValues.getLocation().toString();
        String jobValuesPositionType = jobValues.getPositionType().toString();
        String jobValuesCoreCompetency = jobValues.getCoreCompetency().toString();

        if (jobValuesName =="" && jobValuesEmployer == "" && jobValuesLocation == "" && jobValuesPositionType == "" && jobValuesCoreCompetency == "") {
            return "OOPS! This job does not seem to exist.";
        } else if (jobValuesName =="" || jobValuesEmployer == "" || jobValuesLocation == "" || jobValuesPositionType == "" || jobValuesCoreCompetency == "") {
            return "Data not available";
        } else {
            return ("\n ID: " + jobValuesId + "\n Name: " + jobValuesName + "\n Employer: " + jobValuesEmployer + "\n Location: " + jobValuesLocation + "\n Position Type: " + jobValuesPositionType + "\n Core Competency: " + jobValuesCoreCompetency +"\n");
        }
    }


    //Equals and hashCode methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(location, job.location) &&
                Objects.equals(positionType, job.positionType) &&
                Objects.equals(coreCompetency, job.coreCompetency);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add two constructors - one to initialize a unique ID ####DONE##### and a second to initialize the
    //  other five fields. ####DONE#### The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match. ######DONE######

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id. ######DONE#######
}
