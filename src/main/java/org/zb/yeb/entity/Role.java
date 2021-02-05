package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_role")
@Data
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String nameZh;


}
