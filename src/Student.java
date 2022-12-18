public class Student {
    private String name;
    private int points;

    private static int totalPointsEarned = 0;
    private static int greatestPoints = 0;


    public Student(String name){
        this.name = name;
    }

    public String studentInfo(){
        return "Student: " + name + "\nPoints: " + points;
    }

    public void addPoints(int numPoints){
        points += numPoints;
        totalPointsEarned += numPoints;
        if (points > greatestPoints){
            greatestPoints = points;
        }
    }

    public static int getTotalPointsEarned(){
        return totalPointsEarned;
    }

    public static int getGreatestPoints(){
        return greatestPoints;
    }

}
