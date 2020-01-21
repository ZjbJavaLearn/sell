package com.aidou.sell.service;

import com.aidou.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author: zhaojianbo
 * @create: 2020-01-21 16:06
 **/
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
