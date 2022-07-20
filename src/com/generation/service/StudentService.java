package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;
import com.generation.service.StudentService;
import com.generation.utils.PrinterHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        //TODO implement
        System.out.println(students);
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
