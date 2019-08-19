package com.eor.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eor.application.modal.ProjectDetails;

@Repository
public interface ProjectDetialsRepository extends JpaRepository<ProjectDetails, Integer>{
}
