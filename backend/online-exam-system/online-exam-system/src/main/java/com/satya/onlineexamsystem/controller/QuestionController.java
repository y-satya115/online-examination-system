package com.satya.onlineexamsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.onlineexamsystem.entity.Question;
import com.satya.onlineexamsystem.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	// method to add a question
	@GetMapping("/addquestion")
	public Question addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}

	// method to update a question
	@GetMapping("/updatequestion")
	public Question updateQuestion(@RequestBody Question question) {
		return questionService.updateQuestion(question);
	}

	// method to display all questions
	@GetMapping("/allquestions")
	public List<Question> displayAllQuestions() {
		return questionService.showAllQuestions();
	}

	// method to display question by question ID
	@GetMapping("{id}")
	public Question displayQuesion(@PathVariable("id") int id) {
		return questionService.showQuestion(id);
	}

	// method to delete question
	@GetMapping("deletequestion")
	public void deleteQuestion(@RequestBody Question question) {
		questionService.deleteQuestion(question);
	}
}
