package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_employee_remove")
@Data
public class EmployeeRemove {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long eid;
  private long afterDepId;
  private long afterJobId;
  private LocalDate removeDate;
  private String reason;
  private String remark;

}
