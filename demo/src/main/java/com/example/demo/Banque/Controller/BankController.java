package com.example.demo.Banque.Controller;

import com.example.demo.Banque.Services.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Banque.domain.Banque;


@RestController
public class BankController {
    @Autowired
    BankService BS;

    @GetMapping("/Banque")
    private List<Banque> getAllBankBanks() {
        return BS.getAllBanks();
    }

    @DeleteMapping("/Banque/{idB}")
    private void deleteBank(@PathVariable("idB") int idB) {
        BS.delete(idB);
    }

    @PostMapping("/Banque")
    private String saveStudent(@RequestBody Banque B)
    {
        BS.saveOrUpdate(B);
        return B.getIdB();
    }


}

