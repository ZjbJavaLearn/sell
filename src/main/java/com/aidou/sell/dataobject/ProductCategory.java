package com.aidou.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 类目
 * Created by zhaojianbo
 * 2020-01-21 14:30
 * */

// data 注解使用 需要使用lombok插件 pom.xml需要配置 同事idea工具也需要安装这个插件
// dynamicUpdate 注解使用 自动更新数据库的update_time
@Entity
@Data
@DynamicUpdate
public class ProductCategory {

    /** 类目id */
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Id
    private Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {}
}
