package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_employee_train")
@Data
public class EmployeeTrain {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long eid;
  private LocalDate trainDate;
  private String trainContent;
  private String remark;


}
