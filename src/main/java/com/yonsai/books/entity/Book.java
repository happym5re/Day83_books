package com.yonsai.books.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 
 *  도서 정보 관리 엔티티
 *  [설계 의도]
 *  review와는 1:n 양방향의 관계를 가지며, 도서가 삭제되면 리뷰도 함께 삭제된다.
 */
@Entity
@Table(name="books")
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long bookId;
	
	@Column(nullable = false)
	private String title;				
	
	@Column(name="sub_title", nullable= false)
	private String subTitle;					
	
	@Column(nullable = false)
	private String author;					
	
	@Column(nullable = false)
	private String publisher;			
	
	@Column(name="category_rank", nullable = false)
	private String categoryRank;	//카테고리 랭킹
		

	private double rating;
	@Column(name="review_count")
	private Integer reviewCount;	//리뷰 총 갯수
	
	private String deliveryType;		//일반 배송, 새벽 배송 등의 배송 타입
	
	private Integer price;						//정가 가격
	private Integer discountRate;
	
	// 1:N 설정 (review 클래스에 있는 book 필드에 매핑)
	@Builder.Default
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<Review> reviews = new ArrayList<>();
	
}



