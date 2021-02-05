package org.zb.yeb.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_appraise")
@Data
public class Appraise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long eid;
    private LocalDate appDate;
    private String appResult;
    private String appContent;
    private String remark;

}
