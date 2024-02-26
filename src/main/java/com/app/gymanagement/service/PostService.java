package com.app.gymanagement.service;

import com.app.gymanagement.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getById(long id);

    PostDto updateById(PostDto postDto,long id);

    void deleteById(long id);

}
