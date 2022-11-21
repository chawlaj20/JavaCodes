package com.course;
import java.util.ArrayList;
import java.util.List;

import com.dao.CourseDao;
import com.dao.InstructorDao;
import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetail;


public class App {
	
	public static void main( String[] args )
    {
        // Save two instructors
        Instructor instructor = new Instructor("jyoti", "chawla", "jyoti459@gmai.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Piano");
        instructorDetail.setInstructor(instructor);
        instructor.setInstructorDetail(instructorDetail);
       
        Instructor instructor1 = new Instructor("Shruti", "trimukhe", "shruti23@gmail.com");
        InstructorDetail instructorDetail1 = new InstructorDetail("http://www.youtube.com", "Guitar");
        instructorDetail1.setInstructor(instructor1);
        instructor1.setInstructorDetail(instructorDetail1);
        
        Instructor instructor2 = new Instructor("priya", "bansi", "priyabansi@gmail.com");
        InstructorDetail instructorDetail2 = new InstructorDetail("http://www.youtube.com", "Teaching");
        instructorDetail2.setInstructor(instructor2);
        instructor2.setInstructorDetail(instructorDetail2);
        
       
        List<Course> courses=new ArrayList<>();
        //Create some courses
        Course c=new Course("Java");
        c.setInstructor(instructor);
        courses.add(c);
        
        Course c1=new Course("C#");
        c1.setInstructor(instructor);
        courses.add(c1);
        
        Course c2=new Course("python");
        c2.setInstructor(instructor1);
        courses.add(c2);
        
        Course c3=new Course("C++");
        c3.setInstructor(instructor2);
        courses.add(c3);
        
        
        
        CourseDao coursedao=new CourseDao();
        coursedao.saveCourse(c);
        coursedao.saveCourse(c1);
        coursedao.saveCourse(c2);	
        coursedao.saveCourse(c3);
        
    }

}
