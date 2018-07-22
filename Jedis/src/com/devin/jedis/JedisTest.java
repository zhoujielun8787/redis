package com.devin.jedis;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	private Jedis jedis;
	
	@Before
	public void template() {
		jedis = new Jedis("192.168.181.100", 6379);
		
	}
	@Test	
	public void test() {
		String ping = jedis.ping();
		System.out.println(ping);
		
	}
	@Test	
	public void test1() {
		Set<String> keys = jedis.keys("*");
		for (String string : keys) {
			System.out.println(string);
			
		}
		
		System.out.println(jedis.exists("k1"));
		
		System.out.println(jedis.ttl("k2"));
		jedis.close();
	}
	@Test 
	public void test2() {
		jedis.mset("k11","v1","k12","v2");
		System.out.println(jedis.mget("k11","k12"));
		jedis.close();
		
	}
}
