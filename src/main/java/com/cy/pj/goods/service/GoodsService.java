package com.cy.pj.goods.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Package: com.cy.pj.goods.service
 * Description： TODO
 * Author: wengzejiang
 * Date: Created in 2021/3/7 0007 21:24
 * Company: 暂无
 * Version: 0.0.1
 * Modified By:
 */
public interface GoodsService {

    int deleteById(Integer id);

    int deleteByIds(@Param("ids")Integer... ids);
}
