package com.mastercard;

import com.alibaba.fastjson.JSON;
import com.mastercard.api.MastercardAPI;
import com.mastercard.api.entity.*;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.List;

public class getLanguaes {

    public static void main(String[] args) throws Exception {
        String fileName = "C:/Users/Administrator/Desktop/3ti_prd_key-production.p12";
        String userName = "3ti_prd_key";
        String password = "q1w2e3r4t5";
        String oauth_consumer_key = "OH4q7S64RsAQAacQvT6rMgCFjhW9lfq3blaxdq95aac57d39!78ca1d91925b4c7c9088f13c1a4b51460000000000000000";
        String clientId = "test 3ti";
        String languge = "";
        List<TagVO> languages = MastercardAPI.getTags(fileName, userName, password, oauth_consumer_key, clientId);
        System.out.println(JSON.toJSONString(languages));
    }
}
