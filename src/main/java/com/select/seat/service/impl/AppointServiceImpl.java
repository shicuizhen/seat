package com.select.seat.service.impl;

import com.select.seat.entity.Appoint;
import com.select.seat.repository.AppointRepository;
import com.select.seat.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AppointServiceImpl implements AppointService{

    @Autowired
    private AppointRepository appointRepository;

    @Override
    public Appoint addAppoint(Appoint appoint) {
        return appointRepository.save(appoint);
    }

    @Override
    public void delAppoint(int id) {
        appointRepository.deleteById((long) id);
    }

    @Override
    public Appoint updateAppoint(Appoint appoint){
        return appointRepository.save(appoint);
    }

    @Override
    public List<Appoint> findAllAppoint() {
        return appointRepository.findAll();
    }

}
