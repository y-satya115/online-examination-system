package com.satya.onlineexamsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.onlineexamsystem.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
