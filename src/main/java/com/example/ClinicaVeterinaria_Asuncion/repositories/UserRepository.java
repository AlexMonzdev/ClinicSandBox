package com.example.ClinicaVeterinaria_Asuncion.repositories;

import com.example.ClinicaVeterinaria_Asuncion.entities.Pet;
import com.example.ClinicaVeterinaria_Asuncion.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

        User findByUsername(String username);

}
