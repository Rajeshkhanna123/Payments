package com.org.ded.service;

import com.org.ded.model.Payments;
import com.org.ded.repository.PaymentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass implements ServiceInterface {
    @Autowired
    PaymentsRepo PaymentsRepo;

    @Override
    public void addpayment(Payments Payments) {
        PaymentsRepo.save(Payments);
    }

    @Override
    public void updatepayment(Payments Payments) {
        PaymentsRepo.save(Payments);
    }

    @Override
    public String deleteByAddress(String address) {
        String s = PaymentsRepo.deleteByAddress(address);
        return s;
    }

   @Override
    public Integer deleteById(Integer id) {
        PaymentsRepo.deleteById(id);
        return null;
    }

    /*@Override
    public Integer deleteById(Integer id){
        Integer i = PaymentsRepo.deleteById(id);
        return i;
    }*/

    }





/*@Override
    public String delateById(Integer id) {
        customerRepo.deleteById(id);
        return "success";*/