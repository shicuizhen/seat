package com.select.seat.controller;

import com.select.seat.entity.Appoint;
import com.select.seat.service.AppointService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import com.select.seat.common.response.BaseResponse;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import com.select.seat.common.exception.BusinessException;
import com.select.seat.common.enums.ResultCodeEnum;

@Api(tags = "appoint相关接口", description = "提供预定服务管理的相关查询接口")
@RestController
@RequestMapping("/appoint")
public class AppointController {

    @Autowired
    private AppointService appointService;

    @ApiOperation(value = "添加数据")
    @PostMapping
    @ApiResponse(code = 200, message = "ok", response = BaseResponse.class)
    public BaseResponse addAppoint(@ApiParam("实体对象") @Valid @RequestBody Appoint appoint){
        Appoint obj = appointService.addAppoint(appoint);
        if (Objects.isNull(obj)){
            throw new BusinessException(ResultCodeEnum.AddDataError);
        }
        return BaseResponse.ok().data(obj);
    }

    @ApiOperation(value = "根据id删除数据")
    @DeleteMapping("/del/{id}")
    public BaseResponse delAppoint(@PathVariable int id){
        appointService.delAppoint(id);
        return BaseResponse.ok();
    }

    @ApiOperation(value = "更新数据")
    @PutMapping
    public BaseResponse updateAppoint(@RequestBody Appoint appoint){
        Appoint obj = appointService.updateAppoint(appoint);
        if (Objects.isNull(obj)){
            throw new BusinessException(ResultCodeEnum.UpdateDataError);
        }
        return BaseResponse.ok().data(obj);
    }

    @ApiOperation(value = "查询全部数据")
    @GetMapping("/datas")
    public BaseResponse findAllAppoint(){
        List<Appoint> lists = appointService.findAllAppoint();
        if (Objects.isNull(lists)){
            throw new BusinessException(ResultCodeEnum.FindDataError);
        }
        return BaseResponse.ok().data(lists);
    }
}
