package org.haosapp.autoconf;

import org.haosapp.autoconf.annotation.AutoConfFile;
import org.haosapp.autoconf.annotation.AutoConfItem;

/**
 * Redis配置类，模拟spring单例
 * Created by wangwenhao on 2018/1/10.
 */
@AutoConfFile(filename = "redis-2.properties")
public class RedisConf {

    private RedisConf(){}

    private static RedisConf redisConf = new RedisConf();

    /**
     * 测试中约定必须有次方法
     * @return
     */
    public static RedisConf getInstance(){
        return redisConf;
    }

    @AutoConfItem(key="host")
    private String host;

    @AutoConfItem(key="port")
    private int port;

    @AutoConfItem(key="password")
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
