package com.leaf.club.dao;

import com.leaf.club.model.BlogComments;

/**
 * @author LL
 */
public interface IBlogCommentsDao {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    BlogComments getBlogCommentsById(int id);
}