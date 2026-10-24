package org.arham.springdemo2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
    static Student s1=new Student();


    @RequestMapping("/home")
    public String home()
    {
        return "<h1>this is my home api</h1>";
    }

    @RequestMapping("/aboutus")
    public String aboutus(){
           return "this is a about us page";
    }

    @RequestMapping("/contactus")
    public String contactus()
    {
        return "this is a contact us page";
    }

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name)
    {
        return "hello "+ name ;
    }

    @RequestMapping("/person")
    public String person_detail(@RequestParam String name,@RequestParam int age){
        return "Person name is "+name +" and age is "+ age;
    }

  /*  @RequestMapping("/students/view")
    public Student viewstudents()
    {
        return new Student(1,"amit",23);
    }
*/


}
