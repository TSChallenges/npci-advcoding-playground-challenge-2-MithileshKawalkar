public class ClinicManagementSystem {

    public static void main(String[] args) {
        // Create a Clinic instance
        Clinic clinic = new Clinic();

        // Create patients
        Patient p1 = new Patient("Alice", 30, "Female", "Fever");
        Patient p2 = new Patient("Bob", 25, "Male", "Headache");
        Patient p3 = new Patient("Charlie", 40, "Male", "Cough");
        Patient p4 = new Patient("Diana", 35, "Female", "Cold");
       // Patient p6 = new Patient("Mithilesh", 22, "Male", "Cold");
        Patient p5 = new Patient("Eva", 29, "Female", "Stomach Pain");

        // Admit patients
        clinic.admitPatient(p1);
        clinic.admitPatient(p2);
        clinic.admitPatient(p3);
        clinic.admitPatient(p4);
        clinic.admitPatient(p5);

        // Schedule appointments
        clinic.getSchedule(); // Should schedule first 3 patients
        clinic.getSchedule(); // Should schedule the remaining patients for the next day

//clinic.admitPatient(p6);
//clinic.getSchedule();
//clinic.admitPatient(p5);
        // Provide treatment
        clinic.providedTreatment(p1, "Paracetamol");
        clinic.providedTreatment(p2, "Ibuprofen");

        // Get patient details
        clinic.getPatientDetails(p1);
        clinic.getPatientDetails(p4);

        // Get appointment details
        clinic.getAppointmentDetails(p1);
        clinic.getAppointmentDetails(p5);

        // Discharge a patient
        clinic.dischargePatient(p1);
    }
}
