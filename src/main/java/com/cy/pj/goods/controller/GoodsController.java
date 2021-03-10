package com.cy.pj.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Package: com.cy.pj.goods.controller
 * Description： TODO
 * Author: wengzejiang
 * Date: Created in 2021/3/10 0010 22:42
 * Company: 暂无
 * Version: 0.0.1
 * Modified By:
 */
@Controller
@RequestMapping("/goods/")
public class GoodsController {

    @RequestMapping("doGoodsUI")
    public String doGoodsUI(){
        return "goods";
    }

}
