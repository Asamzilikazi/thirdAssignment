package za.ac.mzilikazi;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Asavela on 2016-03-12.
 */
public class EmployeesSetTest {

    EmployeesSet empList;

    @Before
    public void setUp() throws Exception {
        empList = new EmployeesSet("Asavela", "Developer");

    }

    @Test
    public void testSetMaps() throws Exception {
        Set<String> set = new HashSet<String>();

        set.add("Developer");
        set.add("Analyst");
        set.add("Project Manager");
        set.add("Technician");
        set.add("Tester");
        set.add(empList.getDepartment());

        Assert.assertEquals("Developer", empList.getDepartment());

    }
}
