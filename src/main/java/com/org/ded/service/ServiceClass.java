package com.org.ded.service;

import com.org.ded.model.Payments;
import com.org.ded.repository.PaymentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
    public String deletePayment(Integer Payments) {
        PaymentsRepo.deletePayment(Payments);
            return "gg";
        }
    }

/*@Override
    public String delateById(Integer id) {
        customerRepo.deleteById(id);
        return "success";*/