package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.parkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository //esteriótipo para transação de dados
public interface parkingSpotRepository extends JpaRepository<parkingSpotModel, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSportNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
