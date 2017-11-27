package com.nero.elasticsearch;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * 用户实体
 * <p>
 * date : 2017/10/31
 * time : 16:07
 * </p>
 *
 * @author Nero
 */
@Data
@ToString
@Document(indexName = "my_test", type = "user", createIndex = false)
public class User implements Serializable {

    @Id
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String desc;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 所在科室
     */
    private Integer hid;
}
