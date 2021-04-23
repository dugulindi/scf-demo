package com.ztjy.scf;



import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 林弟 lindi
 * @Title:TODO 类描述
 * @Description:TODO 详细描述
 * @Copyright: 2014-现在 厦门神州鹰掌通家园项目组
 * @date: 2021/4/23 11:23
 */

@RestController
public class HelloSpringboot {
    @RequestMapping({"/test"})
    public JSONObject jsonRes() {
        JSONObject info = new JSONObject();
        info.put("message", "test springboot");
        return info;
    }
}
