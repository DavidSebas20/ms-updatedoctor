// File: src/main/java/com/example/updatedoctor/repository/DoctorRepository.java
package com.example.updatedoctor.repository;

import com.example.updatedoctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}