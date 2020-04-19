package com.company;

import org.junit.Assert;

import static org.junit.Assert.*;

public class Testing {


    @org.junit.Test
    public void signup() {
    USER_CONTROLER user = new USER_CONTROLER();
    USER test = new USER();

        test=user.signup("mahmoud", "wagde","wegs","wagdy.20@gmail.com",
            "01212121","01212121","premium","male","22","2589424649562485");
        Assert.assertEquals(test.username,DATABASE.api_users.get(0).username);


    }

    @org.junit.Test
    public void add_friend() {
        USER_CONTROLER user1 = new USER_CONTROLER();
        USER_CONTROLER user2 = new USER_CONTROLER();
        USER test1 = new USER();
        USER test2 = new USER();

        test1=user1.signup("mahmoud", "wagde","wegs","wagdy.20@gmail.com",
                "01212121","01212121","premium","male","22","2589424649562485");
        test2=user2.signup("mohamed", "alaa","kilany","medo.145@gmail.com",
                "01313131","01313131","normal","male","23","");

        user1.add_friend(test1,test2.username);

        Assert.assertEquals(DATABASE.api_users.get(1),test2);
    }

    @org.junit.Test
    public void freind_request() {

        USER_CONTROLER user1 = new USER_CONTROLER();
        USER_CONTROLER user2 = new USER_CONTROLER();
        USER test1 = new USER();
        USER test2 = new USER();

        test1=user1.signup("mahmoud", "wagde","wegs","wagdy.20@gmail.com",
                "01212121","01212121","premium","male","22","2589424649562485");
        test2=user2.signup("mohamed", "alaa","kilany","medo.145@gmail.com",
                "01313131","01313131","normal","male","23","");

        user1.add_friend(test1,test2.username);
        user2.freind_request(test2,test1);

        Assert.assertEquals(DATABASE.api_users.get(0).friends.get(0),test2);

    }
}