package com.PFA.doc_Tunisia.repository;

import com.PFA.doc_Tunisia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<User,Long> {
}
