package hospital.managment.com.runner;

import hospital.managment.com.ICallOnDuty;
import hospital.managment.com.model.Doctor;
import hospital.managment.com.model.Nurse;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementRunner {

    public static void main(String[] args) {
        List<ICallOnDuty> employeeList = new ArrayList<>();
        employeeList.add(new Doctor("dr-123", "Dr. ABC", "Emergncy", true));
        employeeList.add(new Nurse("nurse-123", "XYZ", "Emergncy", true));

        employeeList.stream().forEachOrdered( value -> value.callOnDuty());
    }
}
