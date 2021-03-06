package za.ac.mzilikazi;

/**
 * Created by Asavela on 2016-03-12.
 */
public class EmployeesSet {
    private String Name;
    private String Department;

    public EmployeesSet() {
    }

    public EmployeesSet(String Name, String Department) {
        this.Name = Name;
        this.Department = Department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String brandName) {
        this.Name = brandName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String processor) {
        this.Department = processor;
    }

    @Override
    public String toString() {
        return "EmployeesSet{" +
                "Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
