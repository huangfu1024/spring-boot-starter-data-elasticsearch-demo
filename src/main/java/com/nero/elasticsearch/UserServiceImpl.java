package com.nero.elasticsearch;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户信息搜索服务
 * <p>
 * date : 2017/11/27
 * time : 15:43
 * </p>
 *
 * @author Nero
 */
@Component
public class UserServiceImpl {

    @Autowired
    private UserRepositoryImpl userRepository;

    public Iterable<User> findByDesc(String desc) {

        QueryBuilder queryBuilder = QueryBuilders.matchQuery("desc", desc);
        return userRepository.search(queryBuilder);
    }

}
