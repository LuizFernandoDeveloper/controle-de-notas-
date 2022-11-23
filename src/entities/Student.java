package entities;
public class Student {
    private String studentName; 
    private double studentGradeOne;
    private double studentGradeTwo;
    private double studentGradeThree;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getStudentGradeOne() {
        return studentGradeOne;
    }
    public void setStudentGradeOne(double studentGradeOne) {
        this.studentGradeOne = studentGradeOne;
    }
    public double getStudentGradeTwo() {
        return studentGradeTwo;
    }
    public void setStudentGradeTwo(double studentGradeTwo) {
        this.studentGradeTwo = studentGradeTwo;
    }
    public double getStudentGradeThree() {
        return studentGradeThree;
    }
    public void setStudentGradeThree(double studentGradeThree) {
        this.studentGradeThree = studentGradeThree;
    }
    private double studentTotalgrade(){
        double result  = (studentGradeOne +  studentGradeTwo + studentGradeThree);
        if(result > 100 ){
            result = 100;
        }
        return result;
    }
    public String finalGrade(){
        return "FINAL GRADE = " + String.format("%.2f", studentTotalgrade());
    }

    public String result(){
        
        if(studentTotalgrade() > 60){
            return "PASS";
        }
        else{
            return"FAILED \n"+"MISSING: "+ String.format("%.2f", 60 - studentTotalgrade()) +" POINTS";
        }
    }
}
