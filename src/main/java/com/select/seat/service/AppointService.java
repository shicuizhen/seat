package com.select.seat.service;

import com.select.seat.entity.Appoint;

import java.util.List;

public interface AppointService {

    /**
     * 添加数据
     * @param appoint
     * @return
     */
    Appoint addAppoint(Appoint appoint);

    /**
     * 删除数据
     * @param id
     * @return
     */
    void delAppoint(int id);

    /**
     * 更新数据
     * @param appoint
     * @return
     */
    Appoint updateAppoint(Appoint appoint);


    /**
     * 查询全部数据
     * @return
     */
    List<Appoint> findAllAppoint();
}
