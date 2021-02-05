package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_sys_msg")
@Data
public class SysMsg {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long mid;
  private long type;
  private long adminid;
  private long state;



}
