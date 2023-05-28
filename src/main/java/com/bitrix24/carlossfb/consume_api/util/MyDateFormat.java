package com.bitrix24.carlossfb.consume_api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormat {

    public String myDateFormat(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        return format.format(date);
    }
}
