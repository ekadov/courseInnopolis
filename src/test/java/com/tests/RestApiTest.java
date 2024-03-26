package com.tests;

import io.restassured.RestAssured;
import org.example.api.pojo.auth.AuthRequestPojo;
import org.example.api.pojo.booking.BookingResponsePojo;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Collections;

import static io.restassured.RestAssured.given;

public class RestApiTest {


    @BeforeSuite
    void beforeSuite() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @Test
    void authTest() {

        /*RequestSpecification specification =
                given()
                        .contentType(ContentType.JSON)
                .header()
                .header()
                .cookie();

        ResponseSpecification specification1 =
                given()
                        .contentType(ContentType.JSON)
                        .header()
                        .header()
                        .cookie();*/

        AuthRequestPojo authRequestPojo = new AuthRequestPojo()
                .setUsername("admin")
                .setPassword("password123");

        /*String token = given()
                .body(authRequestPojo)
                .spec(specification)
                .when()
                .post(Endpoints.AUTHORIZATION)
                .then()
                .extract()
                .path("token");*/

    }

    @Test(description = "Some test")
    void getAllBookingsTest() {

        //Type type = new TypeReference<List<BookingRequestPojo>>() {}.getType();

        /*ArrayList<BookingRequestPojo> bookingRequestPojo =
                given()
                .get("/booking")
                .then()
                .extract()
                .as(type);*/

        BookingResponsePojo[] bookingRequestPojo =
                given()
                        .get("/booking")
                        .then()
                        .extract()
                        .as(BookingResponsePojo[].class);

        bookingRequestPojo[0].setFirstname("Ivan").setLastname("Ivanov");

       /* given()
                .put("")
                        .body(bookingRequestPojo[0])*/

        System.out.println("");
    }

    @Test
    void getBookingTest() {

        String endpoint = "/booking/{id}/{country}";

        given()
                .get("/booking")
                .then()
                .body("", Matchers.not(Collections.emptyList()));

    }


}
