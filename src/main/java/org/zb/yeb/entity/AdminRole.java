package org.zb.yeb.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "t_admin_role")
@Data
public class AdminRole {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long adminId;
  private long rid;

}
