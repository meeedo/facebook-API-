package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class USER_CONTROLER {

    DATABASE test = new DATABASE();
    public static USER user = new USER();
    /*
    GROUP_CONTROLER usergroup = new GROUP_CONTROLER();
    MESSAGE_CONTROLER usermessage = new MESSAGE_CONTROLER();
    POST_CONTROLER userpost = new POST_CONTROLER();
    PAGE_CONTROLER userpage = new PAGE_CONTROLER();
    HASHTAG userhashtag = new HASHTAG();

    */
    public USER signup(String firstname,String lastname,String username,
                       String email,String password,String confirm_password,String type ,String gender,String age,String creit )
    {
        USER test = new USER();
        String confirm = confirm_password;
        test.firstname = firstname;
        test.lastname = lastname;
        test.username = username;
        test.email = email;
        test.password = password;
        test.type = type;
        test.gender = gender;
        test.age = age;

        if (confirm.equals(test.password)) {
            if (DATABASE.check_data_for_signup(test.username, test.email) == true) {
                System.out.println(test.username + "  you are signing in : " );
                DATABASE.add_user(test);
            }
        }

        user=test;
        return user;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void add_friend(USER sender,String receiver_name)
    {
        USER receiver = new USER();
        receiver = DATABASE.search_users(receiver_name);
        System.out.println(sender.username + " your freind request is sent to " + receiver_name);
        // freind_request(receiver,sender);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void get_notification()
    {

    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void freind_request(USER user,USER sender)
    {
        ArrayList<USER> request_list = new ArrayList<USER>();
        request_list.add(sender);
        System.out.println(user.username + " the request accepted ");
        user.friends.add(sender);
        sender.friends.add(user);



    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static USER login (String username,String password)
    {
        USER userrrr = new USER();
        userrrr = DATABASE.check_data_for_login(username,password);
        System.out.println(userrrr.username + " login successfull");

        user = userrrr;
        return userrrr;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void manage_account(String username)
    {
        USER user = new USER();
        user.username = username;
        DATABASE.search_type(username);
        System.out.println(user.username +  "  you have pay 99$ for change the type to premium");

    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static USER get_user(String user_name)
    {
        USER el_user = new USER();

        el_user = DATABASE.search_users(user_name);
        return el_user;
    }

}
