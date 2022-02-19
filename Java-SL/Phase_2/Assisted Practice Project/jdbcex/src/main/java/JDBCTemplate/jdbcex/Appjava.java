package JDBCTemplate.jdbcex;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Appjava
{
	public static void main( String[] args )
	{
  	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
  	StudentBean sb=ac.getBean(StudentBean.class);
  	StudentCRUD crud=ac.getBean(StudentDAO.class);
 	 
//    	int row=crud.save(sb);
//    	if(row>0) {
//   		 System.out.println("insertion is success");
//    	}
//    	else {
//   		 System.out.println("check the code");
//    	}
 	 
      	List<StudentBean> list=crud.getallStudents();
  	System.out.println(list);
   	 
   	 
	}
}
