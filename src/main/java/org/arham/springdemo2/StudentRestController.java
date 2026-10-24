package org.arham.springdemo2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/studentrest")
public class StudentRestController
{
    ArrayList<Student> studentArrayList=new ArrayList<>();

    @PostMapping
    public String addStudent(@RequestBody Student s1){

        studentArrayList.add(s1);
        return "Student has been added Successfully";
    }

    @PutMapping
    public String updateStudent(@RequestBody Student s1){

        int studentindex=0;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if(studentArrayList.get(i).getRollno()==s1.rollno)
            {
                studentindex=i;
                break;
            }

        }
        studentArrayList.set(studentindex,s1);
        studentArrayList.add(s1);
        return "Student has been updated Successfully";
    }


    @DeleteMapping("/{rollno}")
    public String deleteStudent(@PathVariable int rollno)
    {

        int studentindex=0;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if(studentArrayList.get(i).getRollno()==rollno)
            {
                studentindex=i;
                break;
            }

        }
        studentArrayList.remove(studentindex);
        return "Student has been deleted successfully";
    }

    @GetMapping
    public ArrayList<Student> viewAllStudent()
    {
        return studentArrayList;
    }


}
