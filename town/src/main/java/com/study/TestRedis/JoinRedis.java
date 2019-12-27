package com.study.TestRedis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JoinRedis {

    //String
    public static void myString(Jedis redis){
        redis.set("1","长江一号");
        String value = redis.get("1");
        System.out.println("1的value="+value);
    }

    //list
    public static void myList(Jedis redis){
        String[] strs = new String[]{"test1","test2","test3"};
        redis.lpush("list",strs);
        List<String> list = redis.lrange("list",0,10);
        int i = 0;
        for(String str : strs){
            i++;
            System.out.println("List["+i+"]"+str);
        }
    }

    //set
    public static void mySet(Jedis redis){

        String[] strs = new String[]{"set1","set2","set3"};
        redis.sadd("hashset",strs);
        Set set = redis.smembers("hashset");
        Iterator iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()){
            i++;
            System.out.println("set["+i+"]="+iterator.next());
        }
    }

    public static void main(String[] args) {

        Jedis redis = new Jedis("localhost");
        System.out.println("redis服务连接"+redis.ping());

        //插入String
        //myString(redis);

        //list
        //myList(redis);

        //set
        mySet(redis);
    }
}
