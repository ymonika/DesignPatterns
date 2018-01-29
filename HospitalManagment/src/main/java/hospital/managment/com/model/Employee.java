package hospital.managment.com.model;

import hospital.managment.com.ICallOnDuty;

public abstract class Employee implements ICallOnDuty {

    private String id;
    private String name;
    private String dept;
    private boolean onDuty;

    public abstract void callOnDuty();

    public Employee() {
    }

    public Employee(String id, String name, String dept, boolean onDuty) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.onDuty = onDuty;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", onDuty=" + onDuty +
                '}';
    }
}
