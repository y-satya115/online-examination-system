package com.satya.onlineexamsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.onlineexamsystem.entity.Question;
import com.satya.onlineexamsystem.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	public Question addQuestion(Question question) {
		return questionRepository.save(question);
	}

	public Question updateQuestion(Question question) {
		return questionRepository.save(question);
	}

	public Question showQuestion(int id) {
		return questionRepository.findById(id).get();
	}

	public List<Question> showAllQuestions() {
		return questionRepository.findAll();
	}

	public void deleteQuestion(Question question) {
		questionRepository.delete(question);
	}
}
