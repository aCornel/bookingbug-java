package bookingbugAPI.models;

import com.theoryinpractise.halbuilder.api.ContentRepresentation;
import com.theoryinpractise.halbuilder.api.Link;
import com.theoryinpractise.halbuilder.api.ReadableRepresentation;
import com.theoryinpractise.halbuilder.api.RepresentationException;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by sebi on 03.05.2016.
 */
public class BBRootTest {

    protected ContentRepresentation rep;
    //protected final Logger log = Logger.getLogger(this.getClass().getName());
    protected String auth_token = null;
    public String id;

    public BBRootTest(ContentRepresentation rep) {
        this.rep = rep;

        try{
            this.id = (String) this.rep.getValue("id");
            this.auth_token = (String) this.rep.getValue("auth_token");
        } catch (RepresentationException e) {
            //e.printStackTrace();
        }
    }

    public BBRootTest(ContentRepresentation rep, String auth_token) {
        this(rep);
        this.auth_token = auth_token;
    }

    public String get(String key){
        String val = null;
        try{
            val = (String)getRep().getValue(key);
        } catch (RepresentationException e) {
            //e.printStackTrace();
        }
        return val;
    }

    public List<? extends ReadableRepresentation> getResources(String rel) {
        List val = null;
        try {
            val = getRep().getResourcesByRel(rel);
        } catch (RepresentationException e) {

        }
        return val;
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        String val = this.get(key);
        if(val != null) return Boolean.parseBoolean(val);
        return defaultValue;
    }

    public int getInteger(String key, int defaultValue) {
        String val = this.get(key);
        if(val != null) return Integer.parseInt(val);
        return defaultValue;
    }


    public String getAuth_token() {
        return auth_token;
    }


    public String getLink(String rel) {
        String link = null;
        try {
            link = getRep().getLinkByRel(rel).getHref();
        } catch (RepresentationException e) {
            //e.printStackTrace();
        }
        return link;
    }

    public String get_selfLink() {
        return getLink("self");
    }


    public List<Link> getLinks() {
        return getRep().getLinks();
    }


    public ContentRepresentation getRep() {
        return rep;
    }


    public String toString() {
        return getRep().getContent();
    }

}
