package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "t_oplog")
@Data
public class Oplog {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private LocalDate addDate;
  private String operate;
  private long adminid;


}
