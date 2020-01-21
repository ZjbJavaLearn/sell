package com.aidou.sell.repository;

import com.aidou.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: zhaojianbo
 * @create: 2020-01-21 14:45
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("fdaff");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    @Transactional
    public void updateTest() {
        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(1);
        productCategory.setCategoryName("我草地上");
        productCategory.setCategoryType(4);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(3);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        System.out.println(result.get(0).getCategoryName());
    }
}