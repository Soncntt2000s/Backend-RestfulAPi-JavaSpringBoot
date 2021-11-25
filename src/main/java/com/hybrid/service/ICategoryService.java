package com.hybrid.service;

import java.util.List;

import com.hybrid.request.CategoryRequest;
import com.hybrid.response.BaseResponse;
import com.hybrid.response.HomeCategoryResponse;

public interface ICategoryService {
	List<HomeCategoryResponse> getHomeCategory();

	BaseResponse saveCategory(CategoryRequest categoryRequest);

	BaseResponse updateCategory(CategoryRequest categoryRequest, Integer id);

	void deleteCategory(Integer id);
}
