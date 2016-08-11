package com.grass.gson;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.grass.generic.Test;

/**
 * Created by baidu on 16/8/11.
 */
public class HelloGson {
    public static void main(String[] args) {
        String jsonStr = "[{\"url\": \"www.baidu.com\",\"image\":\"1111111\"},{\"url\": \"www.baidu.com\","
                + "\"image\":\"1111111\"},{\"url\": \"www.baidu.com\",\"image\":\"1111111\"}]";

        Gson gson = new Gson();
        Type type = new TypeToken<List<TestActItem>>() {
        }.getType();
        List<TestActItem> list = gson.fromJson(jsonStr, type);
        for (TestActItem actItem : list) {
            System.out.println(actItem.toString());
        }
    }
}
