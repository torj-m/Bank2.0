package com.example.demo.Banque.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Banque.domain.Banque;

public interface BankRepository extends CrudRepository<Banque,Integer>{


}
