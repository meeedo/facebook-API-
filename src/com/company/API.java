package com.company;

public class API {

    public static void main(String[] args) {
        // write your code here
        USER_CONTROLER user1 = new USER_CONTROLER();
        USER_CONTROLER user2 = new USER_CONTROLER();
        USER_CONTROLER user3 = new USER_CONTROLER();
        GROUP_CONTROLER group = new GROUP_CONTROLER();
        MESSAGE_CONTROLER message = new MESSAGE_CONTROLER();
        POST_CONTROLER post = new POST_CONTROLER();
        PAGE_CONTROLER page = new PAGE_CONTROLER();
        HASHTAG hashtag = new HASHTAG();
        USER kilany = new USER();
        USER wagdy = new USER();
        USER shaaban = new USER();
        wagdy = user1.signup("mahmoud", "wagde","wegs","wagdy.20@gmail.com",
                "01212121","01212121","premium","male","22","2589424649562485");

        kilany = user2.signup("mohamed", "alaa","kilany","medo.145@gmail.com",
                "01313131","01313131","normal","male","23","");

        shaaban = user3.signup("mohamed", "shaaban","sha3bola","sha3ban.12@gmail.com",
                "0123123123","0123123123","normal","male","20","");

        user2.manage_account("kilany");

        wagdy = user1.login("wegs","71212121");

        user1.add_friend(wagdy,kilany.username);
        user1.add_friend(wagdy,shaaban.username);
        user2.freind_request(kilany,wagdy);
        user3.freind_request(shaaban,wagdy);



        for (int i=0;i<wagdy.friends.size();i++)
        {
            System.out.println(wagdy.friends.get(i).username);
        }


    }

}
