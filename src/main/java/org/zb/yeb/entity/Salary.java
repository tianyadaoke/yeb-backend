package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_salary")
@Data
public class Salary {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long basicSalary;
  private long bonus;
  private long lunchSalary;
  private long trafficSalary;
  private long allSalary;
  private long pensionBase;
  private double pensionPer;
  private LocalDateTime createDate;
  private long medicalBase;
  private double medicalPer;
  private long accumulationFundBase;
  private double accumulationFundPer;
  private String name;


}
