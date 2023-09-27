package br.com.brunofarina8.rentacar.repository;

import br.com.brunofarina8.rentacar.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Integer> {
}
