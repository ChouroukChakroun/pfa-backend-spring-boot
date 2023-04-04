package com.PFA.doc_Tunisia.repository;

import com.PFA.doc_Tunisia.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
