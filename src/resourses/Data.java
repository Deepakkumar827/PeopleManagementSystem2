package resourses;

import employee.Employee;

import java.util.HashSet;
import java.util.Hashtable;

public final class AllEmployee {
    public static Hashtable<Integer, Employee> allEmployee = new Hashtable<>();
    public static HashSet<Integer> adminId=new HashSet<>();


    private AllEmployee(){}
}
