/*
 * Copyright (c) 31.10.2020.
 *
 * Plugin by Lucas
 * Created at 31.10.2020
 */

package de.lucas.teamspeakbot.load;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.ReconnectStrategy;
import com.github.theholywaffle.teamspeak3.api.wrapper.Client;

public class TeamspeakBot {

    public static final TS3Config config = new TS3Config();
    public static final TS3Query query = new TS3Query(config);
    public static final TS3Api api = query.getApi();


    public static void main(String[] args) {

        /*
        CONFIG
         */
        config.setHost("45.89.124.58");
        config.setQueryPort(10011);

        /*
        QUERY
         */
        query.connect();


        /*
        API
         */
        api.login("serveradmin", "leFYYRBR");
        api.selectVirtualServerByPort(9987);
        //api.selectVirtualServerById(1);
        api.setNickname(Datasave.botname);
        System.out.println(Datasave.getInstance().getDatePrefix() + "[START] Teamspeak-Query started!");

        Datasave.getInstance().sendStartScreen();

        /*
        [EVENT BASE]
         */
    }
}
