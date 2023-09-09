package com.loadsapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loadsapi.entites.Payloads;

public interface LoadsRepo extends JpaRepository<Payloads,Integer> {

}
