package com.hybrid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hybrid.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Integer>{
	
	List<PostEntity> findTop5ByOrderByCreatedAtDesc();
	
	List<PostEntity> findTop12ByOrderByCreatedAtDesc();

	PostEntity findOneById(Integer id);
		
}
