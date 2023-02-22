
 com.wipro.SpringL2Assignment1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    Student s1=new Student(1, "chinmay");
    Student s2=new Student(2, "krishna");
    
    //insert
    StudentDao student=context.gtBean("stDao", StudentDAO.class);
    StudentDao.insert(s1);
    StudentDao.insert(s2);
    
    //get all students
    List<Student> students=studentDao.getAllStudents();
    for(Student std:students)
    {
    	System.out.println(std);
    }
    
    //get specific student
    Student s3=studentDao.getStudent(1);
    System.out.println(s3);
    
    //update student
    s3.setName("chinmay");
    studentDao.update(s3);
    
    //verify
    Students5=studentDao.getStudent(1);
    System.out.prinln(s5);
    
    //delete
    studentDao.delete(s2);
    
    //verify
    students=studentDao.getAllStudent();
    for(Student std:students)
    {
    	System.out.println(std);
    }
    context.close();
    
}
}