package com.zcw.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.stereotype.Component;

/**
 * @ClassName : TestEvent
 * @Description : 服务监控
 * @Author : Zhaocunwei
 * @Date: 2020-07-22 16:22
 */
@Component
public class TestEvent {
    public void listen(EurekaInstanceCanceledEvent event){
        System.out.println("下线："+event.getServerId());
    }
}
