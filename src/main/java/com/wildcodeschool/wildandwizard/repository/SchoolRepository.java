package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

// TODO : update this interface
@ResponseBody
public interface SchoolRepository extends JpaRepository<School, Long> {
}
