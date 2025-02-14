package com.example.updatedoctor.service;

import com.example.updatedoctor.entity.Doctor;
import com.example.updatedoctor.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Optional<Doctor> updateDoctor(Long id, Doctor updatedDoctor) {
        return doctorRepository.findById(id).map(existingDoctor -> {
            existingDoctor.setName(updatedDoctor.getName());
            existingDoctor.setSpecialty(updatedDoctor.getSpecialty());
            existingDoctor.setEmail(updatedDoctor.getEmail());
            return doctorRepository.save(existingDoctor);
        });
    }
}