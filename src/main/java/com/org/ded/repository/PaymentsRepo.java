package com.org.ded.repository;

import com.org.ded.model.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PaymentsRepo extends JpaRepository<Payments,Integer> {

    @Transactional
    String deleteByAddress(String address);
    @Transactional
    void deleteById(Integer id);
}
    /*public String deleteByAddress(@PathVariable String address){
        String ss=ServiceInterface.deleteByAddress(address);
        return ss;*/