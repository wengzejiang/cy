package com.cy.pj.datasource;

import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import cn.hutool.http.HttpUtil;
import com.cy.pj.goods.config.CloseableHttpClientUtil;
import com.cy.pj.goods.config.HttpUtils;
import com.cy.pj.goods.dao.GoodsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;

/**
 * Package: com.cy.pj.datasource
 * Description： TODO
 * Author: wengzejiang
 * Date: Created in 2021/3/6 0006 15:13
 * Company: 暂无
 * Version: 0.0.1
 * Modified By:
 */
@SpringBootTest
public class DataSourceTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void testGetConnection() throws Exception {
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void deleteById(){
        goodsDao.deleteById(1);
    }


    @Test
    public void http() throws IOException {
        String url="http://apis.juhe.cn/simpleWeather/query?city=%E5%AE%81%E6%B3%A2&key=c6559c63660a168903c712c137a3bd8b";
//        HttpUtils httpUtils = new HttpUtils();
//        String form = httpUtils.postForm(url);
//        System.out.println(form);

        String buildUrl = UrlBuilder.create()
                .setScheme("https")
                .setHost("apis.juhe.cn/simpleWeather")
                .addPath("/query")
                .addQuery("city", "宁波")
                .addQuery("key", "c6559c63660a168903c712c137a3bd8b")
                .build();
        System.out.println(buildUrl);
        HttpUtils httpUtils = new HttpUtils();
        String form = httpUtils.postForm(buildUrl);
        System.out.println(form);
    }

    @Test
    public void sign(){
        byte[] data = "我是一段测试字符串".getBytes();
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA);
        System.out.println(sign);
        //签名
        byte[] signed = sign.sign(data);
        System.out.println(signed);
        //验证签名
        boolean verify = sign.verify(data, signed);
        System.out.println(verify);

        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("city", "宁波");
        paramMap.put("key", "c6559c63660a168903c712c137a3bd8b");

        String result3= HttpUtil.get("http://apis.juhe.cn/simpleWeather/query", paramMap);
        System.out.println(result3);

        
    }


}
