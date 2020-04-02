package com.mastercard;

import com.alibaba.fastjson.JSON;
import com.mastercard.api.MastercardAPI;
import com.mastercard.api.entity.OfferResp;

import java.util.List;

public class OfferTests {

    public static void main(String[] args) {
        String fileName = "C:/Users/Administrator/Desktop/3ti_prd_key-production.p12";
        String userName = "3ti_prd_key";
        String password = "q1w2e3r4t5";
        String oauth_consumer_key = "OH4q7S64RsAQAacQvT6rMgCFjhW9lfq3blaxdq95aac57d39!78ca1d91925b4c7c9088f13c1a4b51460000000000000000";
        String clientId = "test 3ti";
        String language = "en-SG";
        List<OfferResp> offers = MastercardAPI.getOffers(fileName, userName, password, oauth_consumer_key, clientId, language,
                null, null, null, null, null,
                null, null, null, null, null,
                null, "Golden Lotus Boutique Hotel", null, null, null, null);
        System.out.println(JSON.toJSONString(offers));
        offers.forEach(offerResp->{
            out("language-->"+offerResp.getLanguage());
            out("offerId-->"+offerResp.getOfferDetails().getOfferId());
            out("offerStartDate-->"+offerResp.getOfferDetails().getOfferStartDate());
            out("offerEndDate-->"+offerResp.getOfferDetails().getOfferEndDate());
            out("offerLastModifiedDate-->"+offerResp.getOfferDetails().getOfferLastModifiedDate());
            out("offerTitle-->"+offerResp.getOfferDetails().getOfferTitle());
            out("offerSubTitle-->"+offerResp.getOfferDetails().getOfferSubTitle());
            out("offerDescription-->"+offerResp.getOfferDetails().getOfferDescription());
            out("offerTermsAndConditions-->"+offerResp.getOfferDetails().getOfferTermsAndConditions());
            out("offerRedemptionCTAValue-->"+offerResp.getOfferDetails().getOfferRedemptionCTAValue());
            out("category-->"+offerResp.getOfferDetails().getCategory());
            out("merchantType()-->"+offerResp.getOfferDetails().getMerchantType());
            out("DTIPermit()-->"+offerResp.getOfferDetails().getDTIPermit());
            out("Pdfs()-->", offerResp.getOfferDetails().getPdfs());
            out("eligibleMastercardProducts()-->",offerResp.getEligibleMastercardProducts());
            out("eligibleMarkets()-->",offerResp.getEligibleMarkets());
            out("destinationMarkets()-->",offerResp.getDestinationMarkets());
            out("merchantName()-->"+offerResp.getMerchantDetails().getMerchantName());
            out("merchantLogo()-->"+offerResp.getMerchantDetails().getMerchantLogo());
            out("merchantEmailAddress()-->"+offerResp.getMerchantDetails().getMerchantEmailAddress());
            out("merchantPhoneNumber()-->"+offerResp.getMerchantDetails().getMerchantPhoneNumber());
            out("merchantCity()-->"+offerResp.getMerchantDetails().getMerchantCity());
            out("merchantCountry()-->"+offerResp.getMerchantDetails().getMerchantCountry());
            out("merchantCountryCode()-->"+offerResp.getMerchantDetails().getMerchantCountryCode());
            out("merchantWebsite()-->"+offerResp.getMerchantDetails().getMerchantWebsite());
            out("rectangleImage()-->"+offerResp.getOfferImages().getRectangleImage());
            out("squareImage()-->"+offerResp.getOfferImages().getSquareImage());
            offerResp.getMerchantDetails().getMerchantLocations().forEach(merchantLocationMO -> {
                out("latitude()-->"+merchantLocationMO.getLatitude());
                out("longitude()-->"+merchantLocationMO.getLongitude());
                out("merchantAddress()-->"+merchantLocationMO.getMerchantAddress());
            });
        });
    }

    public static void out(String value){
        System.out.println(value);
    }

    public static void out(String message, List<String> value){
        System.out.println(message+"-->"+JSON.toJSONString(value));
    }
}
