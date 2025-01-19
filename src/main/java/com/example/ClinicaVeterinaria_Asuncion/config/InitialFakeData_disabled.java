package com.example.ClinicaVeterinaria_Asuncion.config;


import com.example.ClinicaVeterinaria_Asuncion.entities.Guardian;
import com.example.ClinicaVeterinaria_Asuncion.entities.Pet;
import com.example.ClinicaVeterinaria_Asuncion.repositories.AppointmentsRepository;
import com.example.ClinicaVeterinaria_Asuncion.repositories.GuardianRepository;
import com.example.ClinicaVeterinaria_Asuncion.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

//@Configuration
public class InitialFakeData_disabled {

/*
    @Autowired
    GuardianRepository guardianRepository;
    PetRepository petRepository;
    AppointmentsRepository appointmentsRepository;

    @Bean
    public CommandLineRunner initData(GuardianRepository guardianRepository, PetRepository petRepository, AppointmentsRepository appointmentRepository) {
        return args -> {
            // Crear un Guardian
            Guardian guardian = Guardian.builder()
                    .name("John Doe")
                    .phone("123456789")
                    .email("john@example.com")
                    .address("123 Elm St")
                    .build();
            guardianRepository.save(guardian);
            Long guardianId = guardian.getId();
            Guardian existingGuardian = guardianRepository.findById(guardianId).orElseThrow(() -> new RuntimeException("Guardian not found"));
            // Crear una Mascota
            Pet pet = Pet.builder()
                    .name("Buddy")
                    .species("Dog")
                    .breed("Golden Retriever")
                    .birthDate(LocalDate.of(2018, 5, 20))
                    .guardian(existingGuardian)
                    .build();
            petRepository.save(pet);

        };
    }
*/
}

