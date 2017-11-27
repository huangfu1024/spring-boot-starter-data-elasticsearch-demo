package com.nero.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 用户信息搜索基础实现
 * <p>
 * date : 2017/11/27
 * time : 15:29
 * </p>
 *
 * @author Nero
 */
interface UserRepositoryImpl extends ElasticsearchRepository<User, Long>{

    /**
     * 根据名称查询
     * @param name 名称
     * @return 用户列表
     */
    List<User> findByName(String name);
}
