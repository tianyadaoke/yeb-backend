package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_employee_ec")
@Data
public class EmployeeEc {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long eid;
  private LocalDate ecDate;
  private String ecReason;
  private long ecPoint;
  private long ecType;
  private String remark;

}
