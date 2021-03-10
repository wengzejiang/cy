package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Package: com.cy.pj.goods.dao
 * Description： TODO
 * Author: wengzejiang
 * Date: Created in 2021/3/6 0006 21:09
 * Company: 暂无
 * Version: 0.0.1
 * Modified By:
 */
@Mapper
public interface GoodsDao {

    @Delete("delete from tb_goods where id=#{id}")
    int deleteById(Integer id);


    int deleteByIds(@Param("ids")Integer... ids);//方法参数为可变参数（可以将其理解为特殊的数组）

    List<Goods> selectByIds(@Param("ids")Integer... ids);

    int updateByIds(@Param("name")String name,@Param("remark")String remark,@Param("ids")Integer... ids);


}
