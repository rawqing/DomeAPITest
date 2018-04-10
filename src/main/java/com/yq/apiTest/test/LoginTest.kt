package com.yq.apiTest.test

import org.hamcrest.Matchers.equalTo
import org.junit.Test
import com.yq.apiTest.extend.*
import io.restassured.RestAssured
import io.restassured.RestAssured.*
import io.restassured.path.json.JsonPath.from

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
                header("Content-Type","application/json").
        When().
                post("https://oauth.jucaidao.com/oauth/access-token ").
        then().
                statusCode(200).
                body("token_type" ,equalTo("Bearer"))

    }

    @Test
    fun testOauth(){
        var g =  given().relaxedHTTPSValidation()
        var w = g.When().
                get("https://easy-mock.com/mock/5aa373a3ecd3e475c6ffb2ec/example/query")
        val statusCode = w.statusCode()
        val body = w.body()
        val n = body.jsonPath()
        val get = n.get<String>("data.name")


        var t = w.then()

        var b = t.body("data.name" , equalTo("hah"))


    }

    @Test
    fun testWan(){
        RestAssured.useRelaxedHTTPSValidation();
//        val xml = post("/greetXML?firstName=John&lastName=Doe").andReturn().asString()
//        val firstName = from(xml).get<String>("greeting.firstName")
        val b: String = get("https://easy-mock.com/mock/5aa373a3ecd3e475c6ffb2ec/example/query").andReturn().asString()
        val get = from(b).get<String>("data.name")
    }
}