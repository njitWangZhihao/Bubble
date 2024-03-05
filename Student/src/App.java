public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    // Constructor
    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    // Getter and setter methods for studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter and setter methods for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and setter methods for extraActivities
    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    // Method to add extra activities
    public void addExtraActivity(int numActivities, String activity) {
        if (numActivities <= extraActivities.length) {
            extraActivities[numActivities - 1] = activity;
        } else {
            System.out.println("Number of activities exceeds the array size.");
        }
    }

    // Method to display student details
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        sb.append("Student Name: ").append(studentName).append("\n");
        sb.append("Extra Activities: ");
        for (String activity : extraActivities) {
            if (activity != null) {
                sb.append(activity).append(", ");
            }
        }
        return sb.toString();
    }
}
