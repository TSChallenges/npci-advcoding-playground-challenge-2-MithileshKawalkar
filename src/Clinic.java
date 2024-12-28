import java.util.Queue;
import java.util.LinkedList;   // LinkedList also implements Queue
import java.util.Set;
import java.util.HashSet;

class Clinic {

    private Queue<Patient> patientQueue;
    private Set<Patient> admittedPatients;
    private int dayCount;

    // Constructor to initialize the clinic with a queue and a set of admitted patients
    public Clinic() {
        this.patientQueue = new LinkedList<>();       // no patient in queue yet
        this.admittedPatients = new HashSet<>();      // no patient admitted yet
        this.dayCount = 1;    // Start with Day 1
    }


    // Admit a patient to the clinic
    public void admitPatient(Patient patient) {
        // Add the patient to the queue and print "Patient <name> admitted."
        if(patient == null)return;

        this.patientQueue.add(patient);
        System.out.println("Patient "+patient.getName() +" admitted.");
        return;
    }
    

    // Schedule appointments (maximum 3 patients per day)
    public void getSchedule() {
        // Assign appointment day to patients(eg. Day 1, Day 2, and so on) as per their order in queue. 
        // Give appointment to maximum 3 patients per day.
        // Once appointment is given to a patient, add that patient to `admittedPatients` set. Also, print "Scheduled <name> on <appointmentDay>"
        
        int count = admittedPatients.size()%3;
        System.out.println("Scheduling appointments for "+ this.dayCount+"...");

        while (!patientQueue.isEmpty()) {
            Patient currentPatient = patientQueue.poll(); // Remove the patient from the queue
            currentPatient.setAppointmentDay("Day " + dayCount); // Set the appointment day
            admittedPatients.add(currentPatient); // Add the patient to the admitted patients set
            System.out.println("Scheduled " + currentPatient.getName() + " on " + currentPatient.getAppointmentDay());
            count++;

            if (count == 3) { // Move to the next day after scheduling 3 patients
                dayCount++;
                break;
            }
        }

        return;

    }


    // Provide treatment or prescription for a patient after their appointment
    public void providedTreatment(Patient patient, String treatment) {
        // Provide treatment to a patient only if the patient is admitted. Print "Treatment provided to <name>: <treatment>"
        // Else print "Patient not found in the admitted list."
        
        if (patient == null || treatment == null || treatment.isEmpty()) {
            System.out.println("Invalid patient or treatment.");
            return;
        }
        if (admittedPatients.contains(patient)) {
            patient.setTreatment(treatment); 
            System.out.println("Treatment provided to " + patient.getName() + ": " + treatment);
        } 
        else {
            System.out.println("Patient not found in the admitted list.");
        }
    }


    // Get the details of a patient
    public void getPatientDetails(Patient patient) {
        // Print patient details only if the patient is admitted.
        // Else print "Patient not found in the admitted list."
        if (patient == null ) {
            System.out.println("Invalid patient.");
            return;
        }

        if (admittedPatients.contains(patient)) {
            System.out.println("Patient Details: "+patient.toString());
        } 
        else {
            System.out.println("Patient not found in the admitted list.");
        }

        return;
    }


    // Get the appointment details of a patient
    public void getAppointmentDetails(Patient patient) {
        // Print appointment details of a patient only if the patient is admitted. "Appointment Details: <name> is scheduled on <appointmentDay>"
        // Else print "Patient not found in the admitted list."
        
        if (patient == null ) {
            System.out.println("Invalid patient.");
            return;
        }

        if (admittedPatients.contains(patient)) {
            System.out.println("Appointment Details: "+ patient.getName()+" is scheduled on "+ patient.getAppointmentDay());
        } 
        else {
            System.out.println("Patient not found in the admitted list.");
        }

        return;
    }


    // Discharge a patient from the clinic
    public void dischargePatient(Patient patient) {
        if (patient == null) {
            System.out.println("Invalid patient.");
            return;
        }

        if (admittedPatients.contains(patient)) {
            admittedPatients.remove(patient);
            System.out.println("Patient " + patient.getName() + " discharged.");
        } else {
            System.out.println("Patient not found in the admitted list.");
        }
        return;
    }

}
