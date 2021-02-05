package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_nation")
@Data
public class Nation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;



}
