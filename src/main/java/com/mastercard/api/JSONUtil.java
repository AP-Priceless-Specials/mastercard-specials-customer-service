package com.mastercard.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class JSONUtil {

    /*public static <T> String listToJson(List<T> ts) {
        String jsons = JSON.toJSONString(ts);
        return jsons;
    }
*/
    /**
     * json 转 List<T>
     */
    /*public static <T> List<T> jsonToList(String jsonString, Class<T> clazz) {
        @SuppressWarnings("unchecked")
        List<T> ts = (List<T>) JSONArray.parseArray(jsonString, clazz);
        return ts;
    }*/


   /* public static List<OfferResp> jsonToObject(String offer) {
        JSONObject jsonObject = JSON.parseObject(offer);
        String data = jsonObject.getObject("data", String.class);
        List<OfferResp> offerResps = jsonToList(data, OfferResp.class);
        return offerResps;
    }*/
}
