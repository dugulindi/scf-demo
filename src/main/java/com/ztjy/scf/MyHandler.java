package com.ztjy.scf;

import com.qcloud.scf.runtime.AbstractSpringHandler;

/**
 * @author 林弟 lindi
 * @Title:TODO 类描述
 * @Description:TODO 详细描述
 * @Copyright: 2014-现在 厦门神州鹰掌通家园项目组
 * @date: 2021/4/23 10:45
 */
public class MyHandler  extends AbstractSpringHandler {
    @Override
    public void startApp() {
        // 修改为项目的入口主函数
        ScfDemoApplication.main(new String[]{""});
    }
}
