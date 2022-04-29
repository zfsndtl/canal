package com.alibaba.otter.canal.example.rocketmq;

import com.alibaba.otter.canal.example.BaseCanalClientTest;

public abstract class AbstractRocektMQTest extends BaseCanalClientTest {

    public static String  topic              = "example";
    public static String  groupId            = "canal";
    public static String  nameServers        = "192.168.120.110:9876";
    public static String  accessKey          = "";
    public static String  secretKey          = "";
    public static boolean enableMessageTrace = false;
    public static String  accessChannel      = "local";//
    public static String  namespace          = "";
}
//rocketmq.producer.group = canal
//rocketmq.enable.message.trace = false
//rocketmq.customized.trace.topic = example
//rocketmq.namespace =
//rocketmq.namesrv.addr = 192.168.120.110:9876
//rocketmq.retry.times.when.send.failed = 0
//rocketmq.vip.channel.enabled = false
//rocketmq.tag =
