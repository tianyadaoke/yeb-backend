package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_joblevel")
@Data
public class Joblevel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String titleLevel;
  private LocalDateTime createDate;
  private long enabled;

}
