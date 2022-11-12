package com.org.ded.service;

import com.org.ded.model.Payments;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


public interface ServiceInterface {
    public void addpayment(Payments payments);

    public void updatepayment(Payments Payments);

    public String deleteByAddress(String address);

    public Integer deleteById(Integer id);
    public Integer getById(Integer id);

}
