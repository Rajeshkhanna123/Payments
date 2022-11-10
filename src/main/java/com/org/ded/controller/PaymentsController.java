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
    @DeleteMapping("/delete/{Id}")
    public String deletePayment(@PathVariable Integer Payments){
       String s= ServiceInterface.deletePayment(Payments);
       return s;
    }
}
/*@DeleteMapping("/deleteById/{id}")
    public String delateById(@PathVariable Integer id){
        String s=customeService.delateById(id);
        return s;*/