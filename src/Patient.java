class Patient {
    private String name;
    private int age;
    private String gender;
    private String symptoms;
    private String treatment;
    private String appointmentDay;

    // Constructor
    public Patient(String name, int age, String gender, String symptoms) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.symptoms = symptoms;
        this.treatment = null;
        this.appointmentDay = null;
    }

      // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getSymptoms() {
        return this.symptoms;
    }

    public String getTreatment() {
        return this.treatment;
    }

    public String getAppointmentDay() {
        return this.appointmentDay;
    }

    // Setter methods
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setAppointmentDay(String appointmentDay) {
        this.appointmentDay = appointmentDay;
    }

    
    /* The below equals() and hashCode() methods are crucial for the proper functioning of 
       collections like HashSet, HashMap, and other hash-based collections. */

    // Override equals() to compare Patient objects based on name, age, and gender
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Patient patient = (Patient) obj;
        return age == patient.age && name.equals(patient.name) && gender.equals(patient.gender);
    }

    // Override hashCode() to generate hash code based on name, age, and gender
    @Override
    public int hashCode() {
        return name.hashCode() + age + gender.hashCode();
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', age=" + age + ", gender=" + gender + "}";
    }
}
