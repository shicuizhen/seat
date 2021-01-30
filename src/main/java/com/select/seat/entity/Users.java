package com.select.seat.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "users")
@Entity
@Table(name = "users")
@Data
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id" )
    @ApiModelProperty(value = "用户id" )
    private Integer id;

    @Column(name = "identity_id" )
    @ApiModelProperty(value = "身份证号后六位" )
    private String identityId;

    @Column(name = "password" )
    @ApiModelProperty(value = "密码" )
    private String password;

    @Column(name = "sno" )
    @ApiModelProperty(value = "学号" )
    private String sno;

}
