package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_salary_adjust")
@Data
public class SalaryAdjust {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long eid;
  private LocalDate asDate;
  private long beforeSalary;
  private long afterSalary;
  private String reason;
  private String remark;


}
