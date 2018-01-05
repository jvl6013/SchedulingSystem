package schedulingsystem;

public class Student extends User{
    String major;
    int year;
    Schedule sch;
    
    public Student(String fName, String lName, String major, int year){
        this.fName = fName;
        this.lName = lName;
        this.major = major;       
        this.year = year;
        
        generateID();
        
        sch = new Schedule();
    }
    
    public Schedule getStudentSchedule(){
        return sch;
    }

    public void setStudentMajor(String major){
        this.major = major;
    }
    
    public String getStudentMajor(){
        return major;
    }
    
    @Override
    public void generateID(){
        //generate studentID code...
        id = "0000A1";
    }
    
    public void enrollClass(int classID){
        if(sch.canEnroll(classID)){
            sch.enroll(classID);
        }
        else{
            //Display a window that says class cannot be added.
        }
    }
    
    public void dropClass(int classID){
        if(sch.canDrop(classID)){
            sch.drop(classID);
        }
        else{
            //Display a window that says the student does not have the class enrolled.
        }
    }
}
