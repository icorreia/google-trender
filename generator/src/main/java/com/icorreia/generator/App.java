package com.icorreia.generator;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import static io.codearte.jfairy.producer.person.PersonProperties.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    /**
     * A Logger for this class.
     */
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try {
            Fairy fairy = Fairy.create();
            Person person = fairy.person();

            System.out.println(person.fullName());
            // Chloe Barker
            System.out.println(person.email());
            // barker@yahoo.com
            System.out.println(person.telephoneNumber());
            // 690-950-802

            Person adultMale = fairy.person(male(), minAge(21));
            System.out.println(adultMale.isMale());
            // true
            System.out.println(adultMale.dateOfBirth());
            // at least 21 years earlier
        } catch (Exception e) {
            logger.error("Error while reading stock: ", e);
        }
    }

}


