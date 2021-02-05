package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_politics_status")
@Data
public class PoliticsStatus {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;


}
