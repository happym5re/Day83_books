package com.yonsai.books;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yonsai.books.entity.Book;
import com.yonsai.books.entity.Review;
import com.yonsai.books.repository.BookRepository;

@SpringBootTest
class BooksApplicationTests {
	
	@Autowired
	private BookRepository repo;

	@Test
	@DisplayName("book review 저장 테스트")
	void bookWithReviewTest() {
		// 1. given
		Book book = Book.builder()
				.title("돈의 속성")
				.subTitle("400쇄 리커버")
				.author("김승호")
				.publisher("스노우폭스북스")
				.price(16020)
				.discountRate(10)
				.deliveryType("일반 배송")
				.build();
		
		Review review = new Review();
		review.setContent("정말 유익해요");
		review.setRating(5.0);
		review.setBook(book);
		
		// 관계 맺기
		book.getReviews().add(review);
		
		// 2. when
		Book savedBook = repo.save(book);
		
		// 3. then
		Assertions.assertNotNull(savedBook.getBookId());
		Assertions.assertEquals("돈의 속성", savedBook.getTitle());
		
	}

}
