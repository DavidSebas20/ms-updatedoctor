package com.example.updatedoctor.repository;

import com.example.updatedoctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Aquí puedes definir métodos personalizados si es necesario
}
