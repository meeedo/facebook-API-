package com.company;

import java.util.ArrayList;

public class DATABASE {
    public static ArrayList<USER> api_users = new ArrayList<USER>();


    public  static void add_user(USER test)
    {
        api_users.add(test);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static USER check_data_for_login(String username , String password)
    {
        int count = 0;
        for (int i=0 ; i < api_users.size() ; i++)
        {
            if((api_users.get(i).username == username) && (api_users.get(i).password ==password))
            {
                break;
            }
            count++;
        }

        return api_users.get(count);

    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean check_data_for_signup(String username , String email)
    {
        boolean test = true;
        for (int i=0 ; i < api_users.size() ; i++)
        {
            if((api_users.get(i).username == username) && (api_users.get(i).email ==email))
            {
                test = false;
            }

        }

        return test;

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static USER search_users(String friend_name)
    {
        USER user = new USER();

        for (int i=0 ; i < api_users.size() ; i++)
        {
            if(api_users.get(i).username == friend_name)
            {
                user = api_users.get(i);
                break;
            }

        }

        return user;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void search_type(String username) {
        USER user = new USER();

        for (int i = 0; i < api_users.size(); i++) {
            if (api_users.get(i).username == username) {
                api_users.get(i).type = "premium";
                api_users.get(i).credit = "123456789";
                // System.out.println("-------------------------"+api_users.size());
                user = api_users.get(i);
                break;
            }

        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void update_user(USER update)
    {
        //to apdate the user data in database after the function execute
    }


}
