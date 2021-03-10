package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Package: com.cy.pj.goods.dao
 * Description： TODO
 * Author: wengzejiang
 * Date: Created in 2021/3/6 0006 21:28
 * Company: 暂无
 * Version: 0.0.1
 * Modified By:
 */
@SpringBootTest
public class GoodsGaoTests {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private GoodsService goodsService;

    @Test
    public void deleteById(){
        int i = goodsDao.deleteById(2);
        System.out.println(i);
    }

    @Test
    public void deleteByIds(){
        goodsDao.deleteByIds(8,9);
    }

    @Test
    public void selectById(){
        List<Goods> goods = goodsDao.selectByIds(1, 5);
        System.out.println(goods);
    }

    @Test
    public void updateById(){
        int goods = goodsDao.updateByIds("Mysql","C3P0", 1,5);
        System.out.println(goods);
    }

    @Test
    public void testsqlSessionFactory(){
        System.out.println(sqlSessionFactory.getClass().getName());
    }

    @Test
    public void deleteId(){
        Integer id=3;
        int i = goodsService.deleteById(id);
        System.out.println(i);
    }
}
