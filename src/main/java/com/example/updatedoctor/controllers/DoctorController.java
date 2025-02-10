package com.example.updatedoctor.controllers;

import com.example.updatedoctor.entity.Doctor;
import com.example.updatedoctor.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable Long id, @RequestBody Doctor updatedDoctor) {
        Doctor doctor = doctorService.updateDoctor(id, updatedDoctor);
        return ResponseEntity.ok(doctor);
    }
}