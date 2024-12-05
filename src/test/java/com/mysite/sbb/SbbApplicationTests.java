package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepostiory;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepostiory questionRepostiory;
	
	@Autowired
	private AnswerRepository answerRepository;

	@Test
	@Transactional
	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepostiory.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스트링 부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepostiory.save(q2);
		
		// 질문 조회하기
//		List<Question> all = this.questionRepostiory.findAll();
//		assertEquals(2, all.size());
//		
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
		// findById
//		Optional<Question> oq = this.questionRepostiory.findById(1);
//		if(oq.isPresent()) {
//			Question question = oq.get();
//			assertEquals("sbb가 무엇인가요?", question.getSubject());
//		}
		
		// findBySubjet
//		Question question = this.questionRepostiory.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1,question.getId());
		
		//findBySubejectAndContent
//		Question q = this.questionRepostiory.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//		assertEquals(1,q.getId());
		
		// findBySubjectLike
//		List<Question> qList = this.questionRepostiory.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
		// 질문 데이터 수정하기
//		Optional<Question> oq = this.questionRepostiory.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepostiory.save(q);
		
		// 질문 데이터 삭제하기
//		assertEquals(2, this.questionRepostiory.count());
//		Optional<Question> oq = this.questionRepostiory.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepostiory.delete(q);
//		assertEquals(1, this.questionRepostiory.count());
		
		// 답변 데이터 저장하기 
//		Optional<Question> oq = this.questionRepostiory.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
		
		// 답변 데이터 조회하기
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer answer = oa.get();
//		assertEquals(2, answer.getQuestion().getId());
		
		// 질문 데이터를 통해 답변 데이터 찾기
		Optional<Question> oq = this.questionRepostiory.findById(2);
		assertTrue(oq.isPresent());
		Question question = oq.get();
		
		List<Answer> answerList = question.getAnswereList();
		
		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}

}
