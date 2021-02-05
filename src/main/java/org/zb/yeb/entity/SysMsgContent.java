package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_sys_msg_content")
@Data
public class SysMsgContent {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String message;
  private LocalDateTime createDate;

}
