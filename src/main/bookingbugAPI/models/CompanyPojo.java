package bookingbugAPI.models;

import bookingbugAPI.models.params.ServiceListParams;
import bookingbugAPI.services.HttpService;
import com.damnhandy.uri.template.UriTemplate;
import com.theoryinpractise.halbuilder.api.ContentRepresentation;
import com.theoryinpractise.halbuilder.api.RepresentationException;

import java.io.IOException;
import java.net.URL;

/**
 * Created by sebi on 03.05.2016.
 */
public class CompanyPojo {

    protected String auth_token = null;

    private String companyID;
    private String addressID;
    private String numericWidgetID;
    private String name;
    private String currencyCode;
    private String timezone;
    private String multiStatus;
    private String settings;
    private String website;
    private String description;
    private String countryCode;
    private String live;

    private String peopleLink;
    private String selfLink;
    private String eventsLink;
    private String addressLink;
    private String categoriesLink;
    private String resourcesLink;
    private String servicesLink;
    private String timesLink;
    private String parentLink;
    private String settingsLink;
    private String addressesLink;
    private String bookLink;
    private String named_categoriesLink;
    private String clinicsLink;
    private String event_chainsLink;
    private String event_groupsLink;
    private String client_detailsLink;
    private String packagesLink;
    private String bulk_purchasesLink;
    private String checkoutLink;
    private String totalLink;
    private String loginLink;
    private String clientLink;
    private String client_by_emailLink;
    private String booking_textLink;
    private String basketLink;
    private String daysLink;
    private String couponLink;
    private String email_password_resetLink;
    private String facebook_loginLink;
    private String new_personLink;
    private String new_resourceLink;
    private String schedulesLink;
    private String new_scheduleLink;
    private String administratorsLink;
    private String new_administratorLink;
    private String slotsLink;
    private String new_event_chainLink;
    private String new_event_groupLink;
    private String calendar_eventsLink;
    private String new_serviceLink;
    private String bookingsLink;
    private String new_bookingLink;
    private String queuersLink;
    private String client_queuesLink;
    private String new_queuerLink;
    private String pusherLink;

    private SettingsPojo settingsPojo;

    public CompanyPojo(ContentRepresentation rep) {
        companyID = get(rep, "id");
        addressID = get(rep, "address_id");
        numericWidgetID = get(rep, "numeric_widget_id");
        name = get(rep, "name");
        currencyCode = get(rep, "currency_code");
        timezone = get(rep, "timezone");
        multiStatus = get(rep, "multi_status");
        settings = get(rep, "embedded.settings");
        website = get(rep, "website");
        description = get(rep, "description");
        countryCode = get(rep, "country_code");
        live = get(rep, "live");

        selfLink = getLink(rep, "self");
        peopleLink = getLink(rep, "people");
        eventsLink = getLink(rep, "events");
        addressLink = getLink(rep, "addresses");
        categoriesLink = getLink(rep, "categories");
        resourcesLink = getLink(rep, "resources");
        servicesLink = getLink(rep, "services");
        parentLink = getLink(rep, "parent");
        settingsLink = getLink(rep, "settings");
        addressesLink = getLink(rep, "addresses");
        bookLink = getLink(rep, "book");
        named_categoriesLink = getLink(rep, "named_categories");
        clinicsLink = getLink(rep, "clinics");
        event_chainsLink = getLink(rep, "event_chains");
        event_groupsLink = getLink(rep, "event_groups");
        client_detailsLink = getLink(rep, "client_details");
        packagesLink = getLink(rep, "packages");
        bulk_purchasesLink = getLink(rep, "bulk_purchases");
        checkoutLink = getLink(rep, "checkout");
        totalLink = getLink(rep, "total");
        loginLink = getLink(rep, "login");
        clientLink = getLink(rep, "client");
        client_by_emailLink = getLink(rep, "client_by_email");
        booking_textLink = getLink(rep, "booking_text");
        basketLink = getLink(rep, "basket");
        daysLink = getLink(rep, "days");
        couponLink = getLink(rep, "coupon");
        email_password_resetLink = getLink(rep, "email_password_reset");
        facebook_loginLink = getLink(rep, "facebook_login");
        new_personLink = getLink(rep, "new_person");
        new_resourceLink = getLink(rep, "new_resource");
        schedulesLink = getLink(rep, "schedules");
        new_scheduleLink = getLink(rep, "new_schedule");
        administratorsLink = getLink(rep, "administrators");
        new_administratorLink = getLink(rep, "new_administrator");
        slotsLink = getLink(rep, "slots");
        new_event_chainLink = getLink(rep, "new_event_chain");
        new_event_groupLink = getLink(rep, "new_event_group");
        calendar_eventsLink = getLink(rep, "calendar_events");
        new_serviceLink = getLink(rep, "new_service");
        bookingsLink = getLink(rep, "bookings");
        new_bookingLink = getLink(rep, "new_booking");
        queuersLink = getLink(rep, "queuers");
        client_queuesLink = getLink(rep, "client_queues");
        new_queuerLink = getLink(rep, "new_queuer");
        pusherLink = getLink(rep, "pusher");

        settingsPojo = new SettingsPojo((ContentRepresentation) rep.getResourcesByRel("settings").get(0));
    }

    public CompanyPojo(ContentRepresentation rep, String auth_token) {
        this(rep);

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

    public String getCompanyID() {
        return companyID;
    }

    public String getAddressID() {
        return addressID;
    }

    public String getNumericWidgetID() {
        return numericWidgetID;
    }

    public String getName() {
        return name;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getMultiStatus() {
        return multiStatus;
    }

    public String getSettings() {
        return settings;
    }

    public String getWebsite() {
        return website;
    }

    public String getDescription() {
        return description;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLive() {
        return live;
    }

    public String getPeopleLink() {
        return peopleLink;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public String getEventsLink() {
        return eventsLink;
    }

    public String getAddressLink() {
        return addressLink;
    }

    public String getCategoriesLink() {
        return categoriesLink;
    }

    public String getResourcesLink() {
        return resourcesLink;
    }

    public String getServicesLink() {
        return servicesLink;
    }

    public String getTimesLink() {
        return timesLink;
    }

    public String getParentLink() {
        return parentLink;
    }

    public String getSettingsLink() {
        return settingsLink;
    }

    public String getAddressesLink() {
        return addressesLink;
    }

    public String getBookLink() {
        return bookLink;
    }

    public String getNamed_categoriesLink() {
        return named_categoriesLink;
    }

    public String getClinicsLink() {
        return clinicsLink;
    }

    public String getEvent_chainsLink() {
        return event_chainsLink;
    }

    public String getEvent_groupsLink() {
        return event_groupsLink;
    }

    public String getClient_detailsLink() {
        return client_detailsLink;
    }

    public String getPackagesLink() {
        return packagesLink;
    }

    public String getBulk_purchasesLink() {
        return bulk_purchasesLink;
    }

    public String getCheckoutLink() {
        return checkoutLink;
    }

    public String getTotalLink() {
        return totalLink;
    }

    public String getLoginLink() {
        return loginLink;
    }

    public String getClientLink() {
        return clientLink;
    }

    public String getClient_by_emailLink() {
        return client_by_emailLink;
    }

    public String getBooking_textLink() {
        return booking_textLink;
    }

    public String getBasketLink() {
        return basketLink;
    }

    public String getDaysLink() {
        return daysLink;
    }

    public String getCouponLink() {
        return couponLink;
    }

    public String getEmail_password_resetLink() {
        return email_password_resetLink;
    }

    public String getFacebook_loginLink() {
        return facebook_loginLink;
    }

    public String getNew_personLink() {
        return new_personLink;
    }

    public String getNew_resourceLink() {
        return new_resourceLink;
    }

    public String getSchedulesLink() {
        return schedulesLink;
    }

    public String getNew_scheduleLink() {
        return new_scheduleLink;
    }

    public String getAdministratorsLink() {
        return administratorsLink;
    }

    public String getNew_administratorLink() {
        return new_administratorLink;
    }

    public String getSlotsLink() {
        return slotsLink;
    }

    public String getNew_event_chainLink() {
        return new_event_chainLink;
    }

    public String getNew_event_groupLink() {
        return new_event_groupLink;
    }

    public String getCalendar_eventsLink() {
        return calendar_eventsLink;
    }

    public String getNew_serviceLink() {
        return new_serviceLink;
    }

    public String getBookingsLink() {
        return bookingsLink;
    }

    public String getNew_bookingLink() {
        return new_bookingLink;
    }

    public String getQueuersLink() {
        return queuersLink;
    }

    public String getClient_queuesLink() {
        return client_queuesLink;
    }

    public String getNew_queuerLink() {
        return new_queuerLink;
    }

    public String getPusherLink() {
        return pusherLink;
    }

    public SettingsPojo getSettingsPojo() {
        return settingsPojo;
    }

    /**
     * List of Services for a Company.
     * @return BBCollection<Service>
     * @throws IOException
     */
    public BBCollection<Service> serviceList_Admin(ServiceListParams slParams) throws IOException {

        //TODO: return from cache if exists
        URL url = new URL(UriTemplate.fromTemplate(getServicesLink()).expand());
        BBCollection<Service> services = new BBCollection<Service>(HttpService.api_GET(url, auth_token), auth_token, "services", Service.class);

        //TODO: Cache here the response for slParams
        return services;
    }

    //TODO: implement rest of methods here
}
