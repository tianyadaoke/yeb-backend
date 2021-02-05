package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_menu_role")
@Data
public class MenuRole {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long mid;
  private long rid;

}
