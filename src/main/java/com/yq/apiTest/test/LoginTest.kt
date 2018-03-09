package com.yq.apiTest.test

import io.restassured.RestAssured.given
import org.hamcrest.Matchers.equalTo
import org.junit.Test

/**
 * Created by king on 2018/3/9.
 */
class LoginTest {

    @Test
    fun testLogin(){
        given().
                params(mapOf("client_id" to "u5ug5Mooh0eNfRHTgR01pMIgGfmGo0PxycLZIKrb",
                        "client_secret" to "HLx9Zlhy7zeLTLtWH5fkIbYtY1xVnY2vL8Ao7J4e",
                        "scope" to "basic",
                        "grant_type" to "password",
                        "username" to "quotation@trubuzz.com",
                        "password" to "0102sA")).
//                header("Content-Type","application/json").
        `when`().
                post("https://oauth.jucaidao.com/oauth/access-token ").
        then().
                statusCode(200).
                body("token_type" ,equalTo("Bearer"))

    }
}