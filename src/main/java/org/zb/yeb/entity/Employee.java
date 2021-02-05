package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String gender;
    private LocalDate birthday;
    private String idCard;
    private String wedlock;
    private long nationId;
    private String nativePlace;
    private long politicId;
    private String email;
    private String phone;
    private String address;
    private long departmentId;
    private long jobLevelId;
    private long posId;
    private String engageForm;
    private String tiptopDegree;
    private String specialty;
    private String school;
    private java.sql.Date beginDate;
    private String workState;
    private String workId;
    private double contractTerm;
    private LocalDate conversionTime;
    private LocalDate notWorkDate;
    private LocalDate beginContract;
    private LocalDate endContract;
    private long workAge;
    private long salaryId;


}
