package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_menu")
@Data
public class Menu {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String url;
  private String path;
  private String component;
  private String name;
  private String iconCls;
  private long keepAlive;
  private long requireAuth;
  private long parentId;
  private long enabled;

}
