package hospital.managment.com.model;

public class Doctor extends Employee  {

    public Doctor(String id, String name, String dept, boolean onDuty){
        super(id,name,dept,onDuty);
    }

    public void callOnDuty() {
        System.out.println("Doctor...Start: "+getId());
        prescribeMedicine();
        System.out.println("Doctor...End");
    }

    private void prescribeMedicine() {
        System.out.println("prescribe Medicine");
    }
}
