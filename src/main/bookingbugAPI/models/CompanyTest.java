package bookingbugAPI.models;

import bookingbugAPI.api.AdminURLS;
import bookingbugAPI.models.params.ServiceListParams;
import bookingbugAPI.services.HttpService;
import com.damnhandy.uri.template.UriTemplate;
import com.theoryinpractise.halbuilder.api.ContentRepresentation;
import helpers.Utils;

import java.io.IOException;
import java.net.URL;

/**
 * Created by sebi on 03.05.2016.
 */
public class CompanyTest extends BBRootTest {

    public CompanyTest(ContentRepresentation rep) {
        super(rep);
    }

    public String get_companyID() {
        return get("id");
    }

    public String get_numericWidgetID() {
        return get("numeric_widget_id");
    }

    public String get_addressID() {
        return get("address_id");
    }

    public String get_name() {
        return get("name");
    }

    public String get_currencyCode() {
        return get("currency_code");
    }

    public String get_timezone() {
        return get("timezone");
    }

    public String get_multiStatus() {
        return get("multi_status");
    }

    public String get_website() {
        return get("website");
    }

    public String get_description() {
        return get("description");
    }

    public String get_countryCode() {
        return get("country_code");
    }

    public String get_live() {
        return get("live");
    }

    public String get_addressLink() {
        return getLink("addresses");
    }

    public String get_peopleLink() {
        return getLink("people");
    }

    public String get_categoriesLink() {
        return getLink("categories");
    }

    public String get_eventsLinks() {
        return getLink("events");
    }

    public String get_resourcesLink() {
        return getLink("resources");
    }

    public String get_servicesLink() {
        return getLink("services");
    }

    /**
     * List of Services for a Company.
     * @return BBCollection<Service>
     * @throws IOException
     */
    public BBCollection<Service> serviceList_Admin(ServiceListParams slParams) throws IOException {

        //TODO: return from cache if exists
        URL url = new URL(UriTemplate.fromTemplate(get_servicesLink()).expand());
        BBCollection<Service> services = new BBCollection<Service>(HttpService.api_GET(url, auth_token), auth_token, "services", Service.class);

        //TODO: Cache here the response for slParams
        return services;
    }

    //TODO: implement rest of methods here

}
