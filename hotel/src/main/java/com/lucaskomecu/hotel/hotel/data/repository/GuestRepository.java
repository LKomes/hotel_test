package com.lucaskomecu.hotel.hotel.data.repository;

import com.lucaskomecu.hotel.hotel.data.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    Optional<Guest> findByFirstNameIgnoreCase(String firstName);
}
