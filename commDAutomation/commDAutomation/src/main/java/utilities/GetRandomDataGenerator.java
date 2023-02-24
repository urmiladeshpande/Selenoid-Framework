package utilities;

import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GetRandomDataGenerator
{

  public static final String configFile="src/main/resources/config.properties";


    public static String getFirstName() {

        Random r = new Random(System.currentTimeMillis());
        int randomData = ((1 + r.nextInt(2)) * 1000 + r.nextInt(1000));
        String firstName = String.valueOf(randomData);
        firstName = "Alex"+firstName;

        System.out.println(firstName);
        return firstName;


    }
    public static String getRealName() {

        String[] names = {"Bob", "Jill", "Tom", "Jacob","Michael","Matthew","Joshua","Christopher","Nicholas","Andrew","Joseph","Daniel","Tyler","William","Brandon","Ryan","John","Zachary","David","Anthony","James","Justin","Alexander","Jonathan","Christian","Austin","Dylan","Ethan","Benjamin","Noah","Samuel","Robert","Nathan","Cameron","Kevin","Thomas","Jose","Hunter","Jordan","Kyle","Caleb","Jason","Logan","Aaron","Eric","Brian","Gabriel","Adam","Jack","Isaiah","Juan","Luis","Connor","Charles","Elijah","Isaac","Steven","Evan","Jared","Sean","Timothy","Luke","Cody","Nathaniel","Alex","Seth","Mason","Richard","Carlos","Angel","Patrick","Devin","Bryan","Cole","Jackson","Ian","Garrett","Trevor","Jesus",};
        int index = (int) (Math.random() * names.length);
        String name = names[index];
        return name;


    }



    public static String generatePhoneNumber()
    {
        long phoneNumber = (long) (Math.random() * 100000 + 3333300000L);
        String phone = String.valueOf(phoneNumber);
        return phone;
    }

    public static String getEmail()
    {

        Random r = new Random(System.currentTimeMillis());
        int randomData = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        String firstName = String.valueOf(randomData);
        String email = "Remedy_Bot"+firstName+"@yopmail.com";
        System.out.println(email);
        return email;


    }
    public static String getCityData() {
        List<String> namesList = Arrays.asList("New York","California", "Illinois", "Texas", "Arizona", "Pennsylvania");

        ArrayList<String> sportLists = new ArrayList<>();
        sportLists.addAll(namesList);
        int i = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        System.out.println(sportLists.get(i));

        return sportLists.get(i);


    }


    public static String getZipcode()
    {
        String zipcode =String.valueOf(ThreadLocalRandom.current().nextInt(90000, 96160+ 1));
        return zipcode;
    }

    public static String readProperty() {

        Properties pr = new Properties(System.getProperties());

        String browserName=null;
        try {
            File file = new File(configFile);
            InputStream fis = new FileInputStream(file);

            pr.load(fis);
            System.setProperties(pr);

            browserName = System.getProperty("browserName");




        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return browserName;

    }

}
