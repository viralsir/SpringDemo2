package org.arham.springdemo2;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/*
     REST API :

     /students



     HTTPMethod :

     POST : create new record
     PUT  : UPDATE THE RECORD
     DELETE : DELETE THE RECORD
     GET   : VIEW THE RECORD

     /STUDENTS

 */



@RestController
@RequestMapping("/student")
public class StudentController
{
    //Student s1=new Student();

    ArrayList<Student> studentArrayList=new ArrayList<>();

    /*@RequestMapping("/add")
    public String addStudent(@RequestParam int rollno,@RequestParam String name ,@RequestParam int maths)
    {
            studentArrayList.add(new Student(rollno,name,maths));

            return "Student has been added successfully";
    }*/

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String addStudent(@RequestBody Student s1)
    {
        studentArrayList.add(s1);

        return "Student has been added successfully";
    }


    @RequestMapping("/view")
    public ArrayList<Student> viewStudent()
    {
        return studentArrayList;
    }

}
