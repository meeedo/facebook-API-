package com.company;

public class GROUP_CONTROLER {

    GROUP grouppp = new GROUP();
    //USER_CONTROLER kilo = new USER_CONTROLER();
    //POST_CONTROLER wagdy = new POST_CONTROLER();

    public static GROUP create_group(String group_name,String type, USER cg)
    {
        GROUP group = new GROUP();
        group.group_name = group_name;
        group.group_type = type;

        return group;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static GROUP join_group(String group_name, USER jg)
    {
        GROUP group = new GROUP();

        return group;

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static GROUP manage_group(String group_name, USER mg)
    {
        GROUP group = new GROUP();
        return group;

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void leave_group(String group_name, USER lg)
    {

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
