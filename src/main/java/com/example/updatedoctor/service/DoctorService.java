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

    public Doctor updateDoctor(Long id, Doctor updatedDoctor) {
        Optional<Doctor> existingDoctorOptional = doctorRepository.findById(id);
        if (existingDoctorOptional.isPresent()) {
            Doctor existingDoctor = existingDoctorOptional.get();
            existingDoctor.setName(updatedDoctor.getName());
            existingDoctor.setSpecialty(updatedDoctor.getSpecialty());
            return doctorRepository.save(existingDoctor);
        }
        throw new RuntimeException("Doctor not found with ID: " + id);
    }
}