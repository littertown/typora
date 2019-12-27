package com.study.mywhile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.town.test.model.Classes;
import com.town.test.model.School;
import com.town.test.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestFastjson {

    public static String objToJson(){
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //school
        School schcool = new School();
        schcool.setName("大树");
        schcool.setCreateTime(new Date());
        schcool.setSchoolname("衡水中学");
        //奥数班级
        Classes asb = new Classes();
        asb.setClassName("奥数班");
        asb.setClassNo("NO1");
        asb.setSum(60);
        //人员
        User xm = new User();
        xm.setName("小明");
        xm.setAge(20);
        xm.setTel("12306");
        User xd = new User();
        xd.setName("小东");
        xd.setAge(21);
        xd.setTel("12345");
        List<User> userList = new ArrayList<User>();
       // userList.add(xm);
        userList.add(xd);
        asb.setUsers(userList);
        //班级
        Classes yyb = new Classes();
        yyb.setClassName("英语班");
        yyb.setClassNo("NO2");
        yyb.setSum(39);
        //yyb.setUsers(userList);
        List<Classes> classList = new ArrayList<Classes>();
        classList.add(yyb);
        classList.add(asb);
        schcool.setClasses(classList);
        //fastjosn
        String json = JSONObject.toJSONString(schcool);
        School classes = JSONObject.parseObject(json,School.class);

        return json;
    }

    public static  Object jsonToObj(String json){

        Object c = new Object();
        c =  JSONObject.parse(json);
        return c;
    }

    public static Object jsonToObj2(String json){

        Object c = new Object();
        c = JSONArray.parse(json);
        return c;
    }

    public static Object jsonToObj3(String json){

        Object c = new Object();
        c = JSONArray.parseObject(json,Classes.class);
        return c;
    }

    public  static Object jsonToObj4(String json){

        Object c = new Object();
        c = JSONArray.parseObject(json,Classes.class);
        return c;
    }
    public static Object simpelObj(){

        String json = "{\"name\":\"小明\",\"age\":\"20\",\"tel\":\"12306\"}";
         User user =  JSONObject.parseObject(json,User.class);
         return user;
    }
    public static void main(String[] args) {

        String json = objToJson();
        System.out.println(json);

        simpelObj();


    }
}
