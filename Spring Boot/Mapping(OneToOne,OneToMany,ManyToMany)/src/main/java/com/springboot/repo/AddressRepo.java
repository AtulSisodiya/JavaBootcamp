package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{

}
