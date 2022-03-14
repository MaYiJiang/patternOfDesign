package com.tang.principle.fltWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:WebSiteFactory Package:com.tang.principle.fltWeight @Date:2021/10/24 16:27 @Author:TYH
 */
public class WebSiteFactory {
    Map<String, WebSite> map = new HashMap<>();
    /**
     * 功能描述 获取相应类型的网站
     *
     * @author TYH
     * @date 2021/10/24
     * @param * @param type
     * @return com.tang.principle.fltWeight.WebSite
     */
    public WebSite getWebSite(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new ConcreteWebSite(type));
        }
        return map.get(type);
    }
    /**
     * 功能描述 返回网站个数
     *
     * @author TYH
     * @date 2021/10/24
     * @param * @param
     * @return int
     */
    public int getNumOfWeb() {
        return map.size();
    }
}
