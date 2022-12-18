public class EmployeeRunner {
    public static void main (String[] args){

        //Case 1
        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());
        System.out.println(Employee.classInfo());

        //Case 2
        System.out.println(Employee.getRecentID());
        System.out.println(Employee.getNumEmployees());

        //Case 3
        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo());
        System.out.println(Employee.classInfo());

        //Case 4
        Employee employee3 = new Employee("Bob", "Ross");
        Employee employee4 = new Employee("Cindy", "Nox");

        System.out.println(employee3.employeeInfo());
        System.out.println(employee4.employeeInfo());
        System.out.println(Employee.classInfo());

        //Case 5
        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());

        //Case 6
        System.out.println(Employee.getRecentID());
        System.out.println(Employee.getNumEmployees());
    }
}
