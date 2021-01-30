package com.select.seat.service;

import com.select.seat.entity.Seat;

import java.util.List;

public interface SeatService {

    /**
     * 添加数据
     * @param seat
     * @return
     */
    Seat addSeat(Seat seat);

    /**
     * 删除数据
     * @param id
     * @return
     */
    void delSeat(int id);

    /**
     * 更新数据
     * @param seat
     * @return
     */
    Seat updateSeat(Seat seat);


    /**
     * 查询全部数据
     * @return
     */
    List<Seat> findAllSeat();
}
