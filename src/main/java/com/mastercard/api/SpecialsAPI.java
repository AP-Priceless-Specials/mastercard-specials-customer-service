package com.mastercard.api;

import com.alibaba.fastjson.JSONObject;
import com.mastercard.api.filter.OAuth;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.PrivateKey;

/**
 * sanbox接口SDK
 */
public class SpecialsAPI {

    private static final String httpURL = "https://sandbox.api.mastercard.com/priceless/specials/v1";

    public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;

    public static String getLanguages(String fileName, String userName, String password, String oauth_consumer_key) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/languages");
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getCagtegories(String fileName, String userName, String password, String oauth_consumer_key, String language) {
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getMerchants(String fileName, String userName, String password, String oauth_consumer_key, String country_code, String merchant_id, String merchant_name) {
        if (merchant_name == null) {
            merchant_name = "";
        }
        if (merchant_id == null) {
            merchant_id = "";
        }
        if (country_code == null) {
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getCountries(String fileName, String userName, String password, String oauth_consumer_key, String language) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/countries?language=" + language);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getMastercardProducts(String fileName, String userName, String password, String oauth_consumer_key, String language) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/mastercard-products?language=" + language);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getPrograms(String fileName, String userName, String password, String oauth_consumer_key, String language, String eligible_markets) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/programs?language=" + language + "&eligible_markets=" + eligible_markets);
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getTags(String fileName, String userName, String password, String oauth_consumer_key) {
        try {
            StringBuffer url = new StringBuffer();
            url.append(httpURL);
            url.append("/get-all-tags");
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getBenefits(String fileName, String userName, String password,
                                     String oauth_consumer_key, String language,
                                     String category,
                                     String eligible_markets, String destination_markets,
                                     String mastercard_product, String last_modified_date,
                                     String coordinates, String merchant_name,
                                     String benefit_title,
                                     Integer limit, Integer offset,
                                     String sort) {
        if (language == null) {
            language = "";
        }
        if (category == null) {
            category = "";
        }
        if (eligible_markets == null) {
            eligible_markets = "";
        }
        if (destination_markets == null) {
            destination_markets = "";
        }
        if (mastercard_product == null) {
            mastercard_product = "";
        }
        if (last_modified_date == null) {
            last_modified_date = "";
        }
        if (coordinates == null) {
            coordinates = "";
        }
        if (merchant_name == null) {
            merchant_name = "";
        }
        if (benefit_title == null) {
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
    }

    public static String getOffers(String fileName, String userName, String password,
                                   String oauth_consumer_key, String language,
                                   String category, String eligible_markets,
                                   String destination_markets, String mastercard_product, String program, String tags,
                                   String last_modified_date, String coordinates, String merchantName,
                                   String card_product_id, String issuer_id,
                                   String offer_title, String merchant_type,
                                   Integer limit, Integer offset, String sort) {
        if (language == null) {
            language = "";
        }
        if (category == null) {
            category = "";
        }
        if (eligible_markets == null) {
            eligible_markets = "";
        }
        if (destination_markets == null) {
            destination_markets = "";
        }
        if (mastercard_product == null) {
            mastercard_product = "";
        }
        if (program == null) {
            program = "";
        }
        if (tags == null) {
            tags = "";
        }
        if (last_modified_date == null) {
            last_modified_date = "";
        }
        if (coordinates == null) {
            coordinates = "";
        }
        if (merchantName == null) {
            merchantName = "";
        }
        if (card_product_id == null) {
            card_product_id = "";
        }
        if (issuer_id == null) {
            issuer_id = "";
        }
        if (offer_title == null) {
            offer_title = "";
        }
        if (merchant_type == null) {
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
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url.toString()).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=" + UTF8_CHARSET.name());
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
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        }
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
        String authHeader = OAuth.getAuthorizationHeader(uri, method, jsonObject.toString(), StandardCharsets.UTF_8, oauth_consumer_key, loadSigningKey(getFilePath(fileName) + fileName, userName, password));
//        String authHeader = OAuth.getAuthorizationHeader(uri, method, jsonObject.toString(), StandardCharsets.UTF_8, oauth_consumer_key, loadSigningKey(fileName, userName, password));
        req.setRequestProperty(OAuth.AUTHORIZATION_HEADER_NAME, authHeader);
    }

    private static String getFilePath(String fileName) {
        /*String path = SpecialsAPI.class.getClassLoader().getResource(fileName).getPath();
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
