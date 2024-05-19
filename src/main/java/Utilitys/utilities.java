package Utilitys;

import java.util.Date;

public class utilities {

    public static   String genarateWithEmailTimeStamp(){
        Date date= new Date();
        String timestamp = date.toString().replace(" ", "_").replace(":", "_");
        return "suramvind"+timestamp+"@gmail.com";

    }
}
