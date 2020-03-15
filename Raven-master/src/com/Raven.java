package com;

import java.util.ArrayList;

public class Raven {
    ArrayList<String> conversation = new ArrayList<>();


    public String getResponse(String str[]) {
        String rtnStr = "";
        int positiveCounter = 0;
        int negativeCounter = 0;
        for (int i = 0; i < str.length; i++) {
            if ((str[i].equalsIgnoreCase("good")) || (str[i].equalsIgnoreCase("glad")) ||
                    str[i].equalsIgnoreCase("happy") || (str[i].equalsIgnoreCase("relaxed")
                    || str[i].equalsIgnoreCase("accomplished") || (str[i].equalsIgnoreCase("alert")
                    || str[i].equalsIgnoreCase("creative"))))

                positiveCounter++;

            else if ((str[i].equalsIgnoreCase("bad") || (str[i].equalsIgnoreCase("sad")) ||
                    str[i].equalsIgnoreCase("tired") || (str[i].equalsIgnoreCase("angry")
                    || str[i].equalsIgnoreCase("anxious") || (str[i].equalsIgnoreCase("hungry"))
                    || str[i].equalsIgnoreCase("moody") || (str[i].equalsIgnoreCase("afraid")))))

                negativeCounter++;
        }
        if (positiveCounter > negativeCounter) {
            rtnStr = "I'm so happy for you... Yay...";
        } else if (negativeCounter > positiveCounter) {
            rtnStr = "Really! Why, tell me more!";
        } else if
                (negativeCounter == positiveCounter) {
            rtnStr = "Mey!";
        }
        return rtnStr;
    }
}



