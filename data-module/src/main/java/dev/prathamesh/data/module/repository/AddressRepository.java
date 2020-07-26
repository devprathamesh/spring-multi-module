package dev.prathamesh.data.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.prathamesh.data.module.dto.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
