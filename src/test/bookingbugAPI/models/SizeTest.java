package bookingbugAPI.models;

import bookingbugAPI.api.AdminURLS;
import bookingbugAPI.services.HttpService;
import helpers.HttpServiceResponse;
import org.github.jamm.MemoryMeter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.instrument.Instrumentation;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by sebi on 03.05.2016.
 */
public class SizeTest {

    private static final String  companyId = "37025";
    private static final String token = "dMeFHWEHCoKsLSvrezqTgQ";
    private MemoryMeter meter = new MemoryMeter();

    public HttpServiceResponse getCompany() throws HttpException, MalformedURLException {
        URL url = new URL(AdminURLS.Company.company().set("companyId", companyId).expand());
        return HttpService.api_GET(url, token);
    }

    @Test
    public void pojoTest(){
        CompanyPojo company = null;
        System.gc();
        Runtime runtime = Runtime.getRuntime();

        float  memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        try {
            company = new CompanyPojo(getCompany().getRep());
        } catch (HttpException | MalformedURLException e) {
            e.printStackTrace();
        }

        float  memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.printf("Memory for pojo runtime: %f KB \n", (memoryAfter - memoryBefore) / 1000);
        assertNotNull(company);
        measure(company, "pojo");
    }

    @Test
    public void wrapperTest() {
        CompanyTest company = null;
        System.gc();
        Runtime runtime = Runtime.getRuntime();

        float  memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        try {
            company = new CompanyTest(getCompany().getRep());
        } catch (HttpException | MalformedURLException e) {
            e.printStackTrace();
        }
        float  memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.printf("Memory for wrapper runtime: %f KB \n", (memoryAfter - memoryBefore) / 1000);
        assertNotNull(company);
        measure(company, "wrapper");
    }

    private void measure(Object anObject, String tag) {

        System.out.printf("------------Size for %s-----------------\n", tag);
        System.out.printf("size: %d bytes\n", meter.measure(anObject));
        System.out.printf("retained size: %d bytes\n", meter.measureDeep(anObject));
        System.out.printf("inner object count: %d\n", meter.countChildren(anObject));
    }
}
