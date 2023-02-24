package BaseClasses;


import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;

import static data.SystemProperties.REMEDY_URL;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class BaseTest extends BaseWebTest {
    private final List<Feature> features = new ArrayList<>();
    private String NCSAURL=null;

    protected BaseTest() {
    }

    public BaseTest add(Feature feature) {
        features.add(feature);
        return this;
    }

    public void trigger() {
        openAfdalAnalytics();

        new FeatureExecutor(features).execute();
    }

    protected void openAfdalAnalytics()
    {

//
//        if(AUTHENTICATION_REQUIRED.trim().equals("Yes") ){
//            NCSAURL  = "https://"+USERNAME+":"+PASSWORD+"@wwwncsa.ncsasports.org/";
//            System.err.println("Executing on URL-->" + NCSAURL);
//            open(NCSAURL);
//        }
//        else{
            assertThat(REMEDY_URL).isNotNull();
            System.err.println("Executing on URL-->" + REMEDY_URL);

            open(REMEDY_URL);
        }

    }


