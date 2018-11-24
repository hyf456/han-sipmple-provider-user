package com.han.cloud.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @ClassName User
 * @Description TODO
 * @Author hanyf
 * @Date 2018\11\4 0004 13:52
 * @Version 1.0
 **/
@Data
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Short age;
    @Column
    private BigDecimal balance;
}
