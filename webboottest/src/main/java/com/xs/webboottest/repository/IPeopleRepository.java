package com.xs.webboottest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.xs.webboottest.domain.People;

public interface IPeopleRepository  extends JpaRepository<People, Long>{

}
