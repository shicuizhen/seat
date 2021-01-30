package com.select.seat.service.impl;

import com.select.seat.entity.Seat;
import com.select.seat.repository.SeatRepository;
import com.select.seat.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class SeatServiceImpl implements SeatService{

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public Seat addSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public void delSeat(int id) {
        seatRepository.deleteById((long) id);
    }

    @Override
    public Seat updateSeat(Seat seat){
        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> findAllSeat() {
        return seatRepository.findAll();
    }

}
