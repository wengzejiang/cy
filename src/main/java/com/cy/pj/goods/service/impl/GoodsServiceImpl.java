package com.cy.pj.goods.service.impl;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: com.cy.pj.goods.service.impl
 * Description： TODO
 * Author: wengzejiang
 * Date: Created in 2021/3/7 0007 21:25
 * Company: 暂无
 * Version: 0.0.1
 * Modified By:
 */
@Service  //是一个特殊的@Component,一般描述对象不同
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public int deleteById(Integer id) {
        //1.参数校验
        if(id==null || id<=0){
            throw new IllegalArgumentException("请指定id的值");
        }
        //2.执行删除动作
        int byId = goodsDao.deleteById(id);
        //3.对结果进行校验
        if(byId==0){
            throw new RuntimeException("id不存在");
        }
        return byId;
    }

    @Override
    public int deleteByIds(Integer... ids) {
        int byIds = goodsDao.deleteByIds();
        return byIds;
    }
}
