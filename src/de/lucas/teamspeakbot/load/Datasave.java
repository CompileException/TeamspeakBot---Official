/*
 * Copyright (c) 31.10.2020.
 *
 * Plugin by Lucas
 * Created at 31.10.2020
 */

package de.lucas.teamspeakbot.load;

import com.github.theholywaffle.teamspeak3.TS3Api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datasave {
    /*
    START STRINGS
     */

    public static final String botversion = "0.0.1";
    public static final String lastupdate = "31.10.2020 || 18:15 Uhr";

    public static final String botname = "TS-Query[" + getInstance().getRandomNumber(1, 20) + "]";

    /*
    GET DATE
     */

    public String getDatePrefix() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("[HH:mm:ss] ");
        return simpleDateFormat.format(Calendar.getInstance().getTime());
    }

    /*
    GET INSTANCE OF DATASAVE
     */
    public static Datasave getInstance() { return new Datasave(); }

    /*
    [MAIN] SEND START SCREEN
     */

    void sendStartScreen() {
        System.out.println(getDatePrefix() + "[INFO] Version: " + Datasave.botversion);
        System.out.println(getDatePrefix() + "[INFO] Author: Lucas");
        System.out.println(getDatePrefix() + "[INFO] Last Update: " + Datasave.lastupdate);
        System.out.println(getDatePrefix() + "[INFO] Bot Name: " + Datasave.botname);
        System.out.println("");
        System.out.println("╔╦╗┌─┐┌─┐┌┬┐┌─┐┌─┐┌─┐┌─┐┬┌─╔╗ ┌─┐┌┬┐");
        System.out.println(" ║ ├┤ ├─┤│││└─┐├─┘├┤ ├─┤├┴┐╠╩╗│ │ │ ");
        System.out.println(" ╩ └─┘┴ ┴┴ ┴└─┘┴  └─┘┴ ┴┴ ┴╚═╝└─┘ ┴ ");
        System.out.println("");
    }

    /*
    GET A RANDOM NUMER
     */
    public int getRandomNumber(int min, int max) { return (int) ((Math.random() * (max - min)) + min); }
}
