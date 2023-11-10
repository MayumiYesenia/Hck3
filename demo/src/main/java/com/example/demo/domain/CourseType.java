package com.example.demo.domain;
import jakarta.persistence.*;

@Entity
@Table(name="course_types")
public class CourseType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name ="name")
    private String name ;

    public CourseType() {}

    
    public CourseType(String name) {
        this.name =name;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
