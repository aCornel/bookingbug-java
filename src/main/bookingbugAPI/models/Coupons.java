package bookingbugAPI.models;

import helpers.HttpServiceResponse;


public class Coupons extends BBRoot {

    public Coupons(HttpServiceResponse httpServiceResponse){
        super(httpServiceResponse);
    }


    public Coupons(HttpServiceResponse httpServiceResponse, String auth_token){
        super(httpServiceResponse, auth_token);
    }


    public Coupons() {}

}
