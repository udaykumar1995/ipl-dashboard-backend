package com.consistentlearners.ipldashboard.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.consistentlearners.ipldashboard.entity.Team;


public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}