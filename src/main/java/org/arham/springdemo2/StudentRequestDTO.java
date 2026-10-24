package org.arham.springdemo2;


import jakarta.validation.constraints.Positive;

public record StudentRequestDTO(
        @Positive(message = "rollno must be positive")
        int rollno,

        String name,
        @Positive(message = "maths must be positive")
        int maths) {
}
