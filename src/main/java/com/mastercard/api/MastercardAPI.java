package com.mastercard.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.mastercard.api.entity.*;
import com.mastercard.api.filter.OAuth;
import org.springframework.util.StringUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.*;

public class MastercardAPI {

    private static final String httpURL = "https://api.mastercard.com/priceless/specials/v1";

    public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;

    public static List<LanguageResp> getLanguages(String fileName, String userName, String password, String oauth_consumer_key, String clientId) throws Exception {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/languages");
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String language = sb.toString();
            if(StringUtils.isEmpty(language)) return null;
            String data = JSON.parseObject(language).getObject("data", String.class);
            List<LanguageResp> offerResps = JSON.parseObject(data, new TypeReference<List<LanguageResp>>() {});
            return offerResps;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<CategoryResp> getCagtegories(String fileName, String userName, String password, String oauth_consumer_key, String clientId, String language) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/categories?language=" + language);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.setRequestProperty("x-openApi-clientId", clientId);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String categories = sb.toString();
            if(StringUtils.isEmpty(categories)) return null;
            String data = JSON.parseObject(categories).getObject("data", String.class);
            List<CategoryResp> categoryResp = JSON.parseObject(data, new TypeReference<List<CategoryResp>>() {});
            return categoryResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<MerchantRespVM> getMerchants(String fileName, String userName, String password, String oauth_consumer_key, String clientId, String country_code, String merchant_id, String merchant_name) {
        if (StringUtils.isEmpty(merchant_name)) {
            merchant_name = "";
        }
        if (StringUtils.isEmpty(merchant_id)) {
            merchant_id = "";
        }
        if (StringUtils.isEmpty(country_code)) {
            country_code = "";
        }
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/merchants?merchant_name=" + merchant_name + "&merchant_id=" + merchant_id + "&country_code=" + country_code);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String merchants = sb.toString();
            if(StringUtils.isEmpty(merchants)) return null;
            String data = JSON.parseObject(merchants).getObject("data", String.class);
            List<MerchantRespVM> merchantResp = JSON.parseObject(data, new TypeReference<List<MerchantRespVM>>() {});
            return merchantResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<CountryResp> getCountries(String fileName, String userName, String password, String oauth_consumer_key, String clientId, String language) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/countries?language=" + language);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String countries = sb.toString();
            if(StringUtils.isEmpty(countries)) return null;
            String data = JSON.parseObject(countries).getObject("data", String.class);
            List<CountryResp> countriesResp = JSON.parseObject(data, new TypeReference<List<CountryResp>>() {});
            return countriesResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<MastercardProductResp> getMastercardProducts(String fileName, String userName, String password, String oauth_consumer_key, String clientId, String language) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/mastercard-products?language=" + language);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String mastercardProducts = sb.toString();
            if(StringUtils.isEmpty(mastercardProducts)) return null;
            String data = JSON.parseObject(mastercardProducts).getObject("data", String.class);
            List<MastercardProductResp> mastercardProductsResp = JSON.parseObject(data, new TypeReference<List<MastercardProductResp>>() {});
            return mastercardProductsResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ProgramResp> getPrograms(String fileName, String userName, String password, String oauth_consumer_key, String clientId, String language, String eligible_markets) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/programs?language=" + language + "&eligible_markets=" + eligible_markets);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String programs = sb.toString();
            if(StringUtils.isEmpty(programs)) return null;
            String data = JSON.parseObject(programs).getObject("data", String.class);
            List<ProgramResp> ProgramRespResp = JSON.parseObject(data, new TypeReference<List<ProgramResp>>() {});
            return ProgramRespResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<TagVO> getTags(String fileName, String userName, String password, String oauth_consumer_key, String clientId) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/get-all-tags");
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String tags = sb.toString();
            if(StringUtils.isEmpty(tags)) return null;
            String data = JSON.parseObject(tags).getObject("data", String.class);
            List<TagVO> tagsResp = JSON.parseObject(data, new TypeReference<List<TagVO>>() {});
            return tagsResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<BenefitResp> getBenefits(String fileName, String userName, String password,
                                     String oauth_consumer_key, String clientId,
                                     String language,
                                     String category,
                                     String eligible_markets, String destination_markets,
                                     String mastercard_product, String last_modified_date,
                                     String coordinates, String merchant_name,
                                     String benefit_title,
                                     Integer limit, Integer offset,
                                     String sort) {
        if (StringUtils.isEmpty(language)) {
            language = "";
        }
        if (StringUtils.isEmpty(category)) {
            category = "";
        }
        if (StringUtils.isEmpty(eligible_markets)) {
            eligible_markets = "";
        }
        if (StringUtils.isEmpty(destination_markets)) {
            destination_markets = "";
        }
        if (StringUtils.isEmpty(mastercard_product)) {
            mastercard_product = "";
        }
        if (StringUtils.isEmpty(last_modified_date)) {
            last_modified_date = "";
        }
        if (StringUtils.isEmpty(coordinates)) {
            coordinates = "";
        }
        if (StringUtils.isEmpty(merchant_name)) {
            merchant_name = "";
        }
        if (StringUtils.isEmpty(benefit_title)) {
            benefit_title = "";
        }
        String lim = "";
        if (limit == null) {
            lim = "";
        } else {
            lim = String.valueOf(limit);
        }
        String off = "";
        if (offset == null) {
            off = "";
        } else {
            off = String.valueOf(offset);
        }
        if (sort == null) {
            sort = "";
        }
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/benefits?language=" + language + "&category=" + category + "&eligible_markets=" + eligible_markets + "&destination_markets=" + destination_markets + "&mastercard_product=" + mastercard_product + "&last_modified_date=" + last_modified_date + "&coordinates=" + coordinates + "&merchant_name=" + merchant_name + "&benefit_title=" + benefit_title + "&limit=" + lim + "&offset=" + off + "&sort=" + sort);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, fileName, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String benefits = sb.toString();
            if(StringUtils.isEmpty(benefits)) return null;
            String data = JSON.parseObject(benefits).getObject("data", String.class);
            List<BenefitResp> benefitsResp = JSON.parseObject(data, new TypeReference<List<BenefitResp>>() {});
            return benefitsResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<OfferResp> getOffers(String filePath, String userName, String password,
                                            String oauth_consumer_key, String clientId,
                                            String language,
                                            String category, String eligible_markets,
                                            String destination_markets, String mastercard_product, String program, String tags,
                                            String last_modified_date, String coordinates, String merchantName,
                                            String card_product_id, String issuer_id,
                                            String offer_title, String merchant_type,
                                            Integer limit, Integer offset, String sort) {
        if (StringUtils.isEmpty(language)) {
            language = "";
        }
        if (StringUtils.isEmpty(category)) {
            category = "";
        }
        if (StringUtils.isEmpty(eligible_markets)) {
            eligible_markets = "";
        }
        if (StringUtils.isEmpty(destination_markets)) {
            destination_markets = "";
        }
        if (StringUtils.isEmpty(mastercard_product)) {
            mastercard_product = "";
        }
        if (StringUtils.isEmpty(program)) {
            program = "";
        }
        if (StringUtils.isEmpty(tags)) {
            tags = "";
        }
        if (StringUtils.isEmpty(last_modified_date)) {
            last_modified_date = "";
        }
        if (StringUtils.isEmpty(coordinates)) {
            coordinates = "";
        }
        if (StringUtils.isEmpty(merchantName)) {
            merchantName = "";
        }else{
            merchantName = dealWithString(merchantName);
        }
        if (StringUtils.isEmpty(card_product_id)) {
            card_product_id = "";
        }
        if (StringUtils.isEmpty(issuer_id)){
            issuer_id = "";
        }
        if (StringUtils.isEmpty(offer_title)) {
            offer_title = "";
        }else{
            offer_title = dealWithString(offer_title);
        }
        if (StringUtils.isEmpty(merchant_type)) {
            merchant_type = "";
        }
        String lim = "";
        if (limit == null) {
            lim = "";
        } else {
            lim = String.valueOf(limit);
        }
        String off = "";
        if (offset == null) {
            off = "";
        } else {
            off = String.valueOf(off);
        }
        if (sort == null) {
            sort = "";
        }
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/offers?language=" + language + "&category=" + category + "&eligible_markets=" + eligible_markets + "&destination_markets=" + destination_markets + "&mastercard_product=" + mastercard_product + "&program=" + program + "&tags=" + tags + "&last_modified_date=" + last_modified_date + "&coordinates=" + coordinates + "&merchantName=" + merchantName + "&card_product_id=" + card_product_id + "&issuer_id=" + issuer_id + "&offer_title=" + offer_title + "&merchant_type=" + merchant_type + "&limit=" + lim + "&offset=" + off + "&sort=" + sort);
            System.out.println(url);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
            connection.setRequestProperty("x-openApi-clientId", clientId);
            sign(connection, filePath, userName, password, oauth_consumer_key);
            connection.connect();
            InputStream is = null;
            if (connection.getResponseCode() != 200) {
                is = connection.getErrorStream();
            } else {
                is = connection.getInputStream();
            }
            BufferedReader bis = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8.name()));
            StringBuffer sb = new StringBuffer();
            while (true) {
                String response = bis.readLine();
                if (response == null) {
                    break;
                }
                sb.append(response);
            }
            connection.disconnect();
            String jsonOffer = sb.toString();
            if(StringUtils.isEmpty(jsonOffer)) return null;
            String data = JSON.parseObject(jsonOffer).getObject("data", String.class);
            List<OfferResp> offerResps = JSON.parseObject(data, new TypeReference<List<OfferResp>>() {});
            return offerResps;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String dealWithString(String string) {
        String blank = string.replace(" ", "%20");
        String and =  blank.replace("&", "%26");
        String que = and.replace("?", "%3F");
        return que;
    }

    public static void sign(HttpsURLConnection req, String fileName, String userName, String password, String oauth_consumer_key) throws Exception {
        URI uri;
        try {
            uri = req.getURL().toURI();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("The provided URL could not be converted to an URI representation", e);
        }
        JSONObject jsonObject = new JSONObject();
        String method = req.getRequestMethod();
//        String authHeader = OAuth.getAuthorizationHeader(uri, method, jsonObject.toString(), StandardCharsets.UTF_8, oauth_consumer_key, loadSigningKey(getFilePath(fileName) + fileName, userName, password));
        String authHeader = OAuth.getAuthorizationHeader(uri, method, jsonObject.toString(), StandardCharsets.UTF_8, oauth_consumer_key, loadSigningKey(fileName, userName, password));
//        String authHeader = OAuth.getAuthorizationHeader(uri, method, jsonObject.toString(), StandardCharsets.UTF_8, oauth_consumer_key, loadSigningKey(fileName, userName, password));
        req.setRequestProperty(OAuth.AUTHORIZATION_HEADER_NAME, authHeader);
    }

    private static String getFilePath(String fileName) {
        /*String path = MastercardAPI.class.getClassLoader().getResource(fileName).getPath();
        if(!StringUtils.isEmpty(path)){
            return path;
        }else{
            throw new RuntimeException("Please put the certificate in the appropriate folder of the project!");
        }*/
        URL u = Thread.currentThread().getContextClassLoader().getResource(fileName);
        if (u == null) {
            throw new RuntimeException("Please put the certificate in the appropriate folder of the project!");
        }
        System.out.println(u.getPath());
        File f = new File(u.getPath());
        if (f.exists()) {
            return u.getPath();
        } else {
            throw new RuntimeException("Please put the certificate in the appropriate folder of the project!");
        }
    }

    public static PrivateKey loadSigningKey(String pkcs12KeyFilePath, String signingKeyAlias, String signingKeyPassword) throws Exception {
        KeyStore pkcs12KeyStore = KeyStore.getInstance("PKCS12", "SunJSSE");
        pkcs12KeyStore.load(new FileInputStream(pkcs12KeyFilePath), signingKeyPassword.toCharArray());
        return (PrivateKey) pkcs12KeyStore.getKey(signingKeyAlias, signingKeyPassword.toCharArray());
    }

}


