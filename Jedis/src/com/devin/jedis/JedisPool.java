package com.devin.jedis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisPool {
	@Test
	public void test() {
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		System.out.println(poolConfig);
		redis.clients.jedis.JedisPool jedisPool = new redis.clients.jedis.JedisPool(poolConfig, "192.168.181.100", 6379, 60000);
		Jedis jedis = jedisPool.getResource();
		System.out.println(jedis.ping());
	}
}
