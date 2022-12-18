public class Employee {
    private String firstName;
    private String lastName;
    private int ID;
    private static int IDNum = 100;
    private static int employeeHires;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        IDNum +=1;
        ID = IDNum;
        employeeHires +=1;
    }

    public int getID(){
        return ID;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    public static int getRecentID (){
        return IDNum;
    }

    public static int getNumEmployees(){
        return employeeHires;
    }

    public String employeeInfo(){
        return "Name: " + firstName + " " + lastName + "\n"
                + "Employee ID: " + ID;
    }

    public static String classInfo(){
        return "Most recent ID assigned: " + IDNum + "\n"
                + "Total employees hired: " + employeeHires;
    }

}
