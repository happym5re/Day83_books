package com.yonsai.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yonsai.books.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
