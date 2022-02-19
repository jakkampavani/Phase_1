package JDBCTemplate.jdbcex;

public class StudentBean {

    int studentid;
    String studentname;
    public int getStudentid() {
   	 return studentid;
    }
    public void setStudentid(int studentid) {
   	 this.studentid = studentid;
    }
    public String getStudentname() {
   	 return studentname;
    }
    public void setStudentname(String studentname) {
   	 this.studentname = studentname;
    }
    
    
    @Override
    public String toString() {
   	 return "StudentBean [studentid=" + studentid + ", studentname=" + studentname + "]";
    }
    
    
    
}
