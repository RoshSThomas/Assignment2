package com.ContactManagement.System.ContactManagement.JpaRepo;

import com.ContactManagement.System.ContactManagement.Entity.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<PersonDetails,Integer> {

}
