package za.ac.mzilikazi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asavela on 2016-03-12.
 */
public class EmployeesListTest {


    EmployeesList management;
    EmployeesList topLevel;
    EmployeesList midLevel1;
    EmployeesList midLevel2;
    EmployeesList lowerLevel;

    @Before
    public void setUp() throws Exception {
        management = new EmployeesList("Lindokuhle", "Project Manager");
        topLevel = new EmployeesList("Asavela", "Analyst");
        midLevel1 = new EmployeesList("Mandisi", "Developer");
        midLevel2 = new EmployeesList("Milisa", "Technician");
        lowerLevel = new EmployeesList("Linamandla", "Tester");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testLists() throws Exception {

        List empList = new ArrayList();

        empList.add(management.getDepartment());
        empList.add(topLevel.getDepartment());
        empList.add(midLevel1.getDepartment());
        empList.add(midLevel2.getDepartment());
        empList.add(lowerLevel.getDepartment() + "\n");

        System.out.print(empList + "\n");
        System.out.print("The size of Employees is:  " + empList.size() + "\n");

        empList.add(0, midLevel1.getDepartment());
        System.out.print(empList + "\n");
        System.out.print("The size of Employees is now:  " + empList.size());

        empList.remove(0);
        System.out.print(empList);
        System.out.print("And The size of Employees is now:  " + empList.size());

        Assert.assertEquals("Project Manager", management.getDepartment());
    }
}


