package com.select.seat.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "seat")
@Entity
@Table(name = "seat")
@Data
public class Seat implements Serializable {

    @Id
    @Column(name = "id" )
    @ApiModelProperty(value = "座位id，即seat_id" )
    private Integer id;

    @Column(name = "line" )
    @ApiModelProperty(value = "行" )
    private Integer line;

    @Column(name = "row" )
    @ApiModelProperty(value = "列" )
    private Integer row;

}
