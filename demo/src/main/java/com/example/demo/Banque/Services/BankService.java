package com.example.demo.Banque.Services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Banque.Repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Banque.domain.Banque;

@Service
public class BankService {
    //getting all banks:
    BankRepository BR;
    public List<Banque> getAllBanks(){
        List<Banque> Banks=new ArrayList<Banque>();
        BR.findAll().forEach(Banque -> Banks.add(Banque));
        return Banks;
    }
    //saving:
    public  void saveOrUpdate(Banque bank){
        BR.save(bank);
    }
    //getting a certain Bank:
    public Banque getBankByID(int id){
        return BR.findById(id).get();
    }

    //deleting a bank
    public void delete(int id) {
       BR.deleteById(id);

    }
}
