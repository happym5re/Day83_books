package com.yonsai.books.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 
 *  N:1의 관계가 성립되는 주인 entity
 * */

@Entity
@Getter @Setter
@NoArgsConstructor
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String userId;
	private String content;
	private double rating;
	
	@Column(name="create_at", updatable = false)
	private LocalDateTime createAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="book_id") 			// 외래키 컬럼명
	private Book book;
	
	@PrePersist
	public void prePersist() {
		this.createAt = LocalDateTime.now();
	}
}
