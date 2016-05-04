package bookingbugAPI.models;

import com.theoryinpractise.halbuilder.api.ContentRepresentation;
import com.theoryinpractise.halbuilder.api.RepresentationException;

/**
 * Created by sebi on 04.05.2016.
 */
public class SettingsPojo {
    protected String auth_token = null;

    private boolean has_coupons;
    private boolean has_deals;
    private boolean has_products;
    private boolean has_services;
    private boolean has_events;
    private boolean has_classes;
    private boolean payment_tax;
    private boolean currency;
    private boolean requires_login;
    private boolean has_wallets;

    private String selfLink;

    public SettingsPojo(ContentRepresentation rep) {

        has_coupons = Boolean.parseBoolean(get(rep, "has_coupons"));
        has_deals = Boolean.parseBoolean(get(rep, "has_deals"));
        has_products = Boolean.parseBoolean(get(rep, "has_products"));
        has_services = Boolean.parseBoolean(get(rep, "has_services"));
        has_events = Boolean.parseBoolean(get(rep, "has_events"));
        has_classes = Boolean.parseBoolean(get(rep, "has_classes"));
        payment_tax = Boolean.parseBoolean(get(rep, "payment_tax"));
        currency = Boolean.parseBoolean(get(rep, "currency"));
        requires_login = Boolean.parseBoolean(get(rep, "requires_login"));
        has_wallets = Boolean.parseBoolean(get(rep, "has_wallets"));

        selfLink = getLink(rep, "self");
    }

    public String get(ContentRepresentation rep, String key){
        String val = null;
        try{
            val = (String)rep.getValue(key);
        } catch (RepresentationException e) {
            //e.printStackTrace();
        }
        return val;
    }

    public String getLink(ContentRepresentation rep, String rel) {
        String link = null;
        try {
            link = rep.getLinkByRel(rel).getHref();
        } catch (RepresentationException e) {
            //e.printStackTrace();
        }
        return link;
    }

    public boolean isHas_coupons() {
        return has_coupons;
    }

    public void setHas_coupons(boolean has_coupons) {
        this.has_coupons = has_coupons;
    }

    public boolean isHas_deals() {
        return has_deals;
    }

    public void setHas_deals(boolean has_deals) {
        this.has_deals = has_deals;
    }

    public boolean isHas_products() {
        return has_products;
    }

    public void setHas_products(boolean has_products) {
        this.has_products = has_products;
    }

    public boolean isHas_services() {
        return has_services;
    }

    public void setHas_services(boolean has_services) {
        this.has_services = has_services;
    }

    public boolean isHas_events() {
        return has_events;
    }

    public void setHas_events(boolean has_events) {
        this.has_events = has_events;
    }

    public boolean isHas_classes() {
        return has_classes;
    }

    public void setHas_classes(boolean has_classes) {
        this.has_classes = has_classes;
    }

    public boolean isPayment_tax() {
        return payment_tax;
    }

    public void setPayment_tax(boolean payment_tax) {
        this.payment_tax = payment_tax;
    }

    public boolean isCurrency() {
        return currency;
    }

    public void setCurrency(boolean currency) {
        this.currency = currency;
    }

    public boolean isRequires_login() {
        return requires_login;
    }

    public void setRequires_login(boolean requires_login) {
        this.requires_login = requires_login;
    }

    public boolean isHas_wallets() {
        return has_wallets;
    }

    public void setHas_wallets(boolean has_wallets) {
        this.has_wallets = has_wallets;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }
}
