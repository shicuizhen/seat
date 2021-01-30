package com.select.seat.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "appoint")
@Entity
@Table(name = "appoint")
@Data
public class Appoint implements Serializable {

    @Column(name = "date" )
    @ApiModelProperty(value = "预约日期" )
    private Date date;

    @Column(name = "duration" )
    @ApiModelProperty(value = "本次使用时长" )
    private Integer duration;

    @Id
    @Column(name = "id" )
    @ApiModelProperty(value = "预约信息id" )
    private Integer id;

    @Column(name = "integrate" )
    @ApiModelProperty(value = "本次信誉积分" )
    private Integer integrate;

    @Column(name = "seat_id" )
    @ApiModelProperty(value = "座位号" )
    private String seatId;

    @Column(name = "uid" )
    @ApiModelProperty(value = "选座的用户id" )
    private Integer uid;

}
