package hospital.managment.com.model;

public class Nurse extends Employee {

    public Nurse(String id, String name, String dept, boolean onDuty) {
        super(id, name, dept, onDuty);
    }

    public void callOnDuty() {
        System.out.println("Nurse....start: "+getId());
        viewPatientsReport();
        updatePatientsReport();
        System.out.println("Nurse....end");
    }

    private void updatePatientsReport() {
        System.out.println("Nurse....update Patient's Report");
    }

    private void viewPatientsReport() {
        System.out.println("Nurse....view Patient's Report");
    }

}
