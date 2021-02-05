package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_mail_log")
@Data
public class MailLog {
  @Id
  private String msgId;
  private long eid;
  private long status;
  private String routeKey;
  private String exchange;
  private long count;
  private LocalDateTime tryTime;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;


}
