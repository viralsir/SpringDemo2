package org.arham.springdemo2;

public record StudentResponseDTO(int rollno,String name) {

    public static StudentResponseDTO fromEntity(Student student){
        return new StudentResponseDTO(student.getRollno(), student.getName());
    }
}
