package com.example.demo.domain;
import jakarta.persistence.*;
import com.example.ht.domain.CourseType;

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name ="name")
    private String name ;

    @Column ( name = "credits")
    private Integer credits;

    private Integer code;
    
    private Integer HRGroup;

    private Integer cycle;

    private String VRGroup;

   @ManyToOne
   @JoinColumn(name="course_type_id")
   private CourseType courseType;

   public Course(){
    
   }

public Long getId() {
    return id;
}

public String getName() {
    return name;
}

public Integer getCredits() {
    return credits;
}

public Integer getCode() {
    return code;
}

public Integer getHRGroup() {
    return HRGroup;
}

public Integer getCycle() {
    return cycle;
}

public String getVRGroup() {
    return VRGroup;
}

public CourseType getCourseType() {
    return courseType;
}
    }
