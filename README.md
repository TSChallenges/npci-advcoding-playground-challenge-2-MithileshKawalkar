[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pmXpv9pE)
# Clinic Management System


## Problem Statement
The **Clinic Management System** is a Java-based tool that helps to manage a Clinic by providing assistance in:
- Admitting patients
- Scheduling the appointments
- Updating appointments based on patients being admitted
- Discharging patients


## Steps to Follow
1. This GitHub repository will be accessible to you once you accept the Playground Challenge.
2. You have to work directly in this GitHub repository. It is like your own copy of the original repository.

3. The folder structure is as given below:
   ```
   src
   ├── Patient.java
   ├── Clinic.java
   └── ClinicManagementSystem.java
   ```

4. Review the code/comments present in above files to understand the structure.
5. Implement the missing methods marked with **TODO** comments.
6. To work on the files, you can clone this GitHub repository onto your system and then open it with an IDE like IntelliJ, or Eclipse.
7. Once done, push your changes to this remote GitHub repository.


## Files to Work On
- `src/Patient.java`
- `src/Clinic.java`
- `src/ClinicManagementSystem.java`


## Requirements
- **`Patient.java`**:
  - Implement the getter and setter methods for Patient class.

- **`Clinic.java`**:
  - Implement the `admitPatient` method to admit a patient.
  - Implement the `getSchedule` method to schedule appointments (maximum 3 patients per day).
  - Implement the `providedTreatment` method to provide treatment or prescription for a patient after their appointment
  - Implement the `getPatientDetails` method to get the details of a patient
  - Implement the `getAppointmentDetails` method to get the appointment details of a patient
  - Implement the `dischargePatient` method to discharge a patient from the clinic

- **`ClinicManagementSystem.java`**:
  - Use this file to import and test the functionalities present in `Patient.java` and `Clinic.java` files.


## Submission Guidelines
After completing the challenge and developing the solution code in your system, commit and push the changes to this repository. 
  - Stage your changes and commit the files:
    ```
    git add .
    git commit -m "Completed playground challenge"
    ```
  - Push your changes to the GitHub repository:
    ```
    git push
    ```


## Expected Output
The output can be similar to below

![Expected output image](Clinic-java-output.png)


Good luck, and happy coding!
