package com.example.ClinicaVeterinaria_Asuncion.services;

import com.example.ClinicaVeterinaria_Asuncion.entities.SecurityUser;
import com.example.ClinicaVeterinaria_Asuncion.entities.User;
import com.example.ClinicaVeterinaria_Asuncion.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDeatailsService implements UserDetailsService  {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new SecurityUser(user);
    }
}
