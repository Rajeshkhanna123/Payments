package com.org.ded.controller;

import com.org.ded.model.Payments;
import com.org.ded.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rajded")
public class PaymentsController {

    @Autowired
    ServiceInterface ServiceInterface;

    //CRUD OPERATIONS  ("/create")
    @PostMapping("/create")
    public void addpayment(@RequestBody Payments Payments) {
        ServiceInterface.addpayment(Payments);
    }

    @PutMapping("/update")
    public void updatepayment(@RequestBody Payments Payments) {
        ServiceInterface.updatepayment(Payments);

    }
    @DeleteMapping("/remove/{address}")
    public String deleteByAddress(@PathVariable String address){
        String ss=ServiceInterface.deleteByAddress(address);
        return ss;

    }
    @DeleteMapping("/deleteById/{id}")
    public Integer deleteById(@PathVariable Integer id){
        Integer ii=ServiceInterface.deleteById(id);
        return ii;
    }
    @GetMapping("/getById/{id}")
    public Integer getById(@PathVariable Integer id){
        Integer ss=ServiceInterface.getById(id);
        return ss;
    }

}
/*@DeleteMapping("/deleteById/{id}")
    public String delateById(@PathVariable Integer id){
        String s=customeService.delateById(id);
        return s;*/