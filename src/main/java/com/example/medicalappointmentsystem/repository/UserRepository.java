package com.example.medicalappointmentsystem.controller;

import com.example.medicalappointmentsystem.model.User;
import com.example.medicalappointmentsystem.model.User.Role;
import com.example.medicalappointmentsystem.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final UserRepository userRepository;

    public DoctorController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllDoctors() {
        return userRepository.findByRole(Role.DOCTOR); // ✅ Using enum
    }
}
