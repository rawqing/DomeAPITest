package com.yq.apiTest.test;

import com.yq.apiTest.extend.JsonP;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.lang.annotation.Target;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by king on 2018/4/10.
 */
public class TestBody {

    @Test
    public void test01(){
        RequestSpecification g = given().relaxedHTTPSValidation();
        Response w = g.when().
                get("https://easy-mock.com/mock/5aa373a3ecd3e475c6ffb2ec/example/query");
        int statusCode = w.statusCode();
        ResponseBody body = w.body();

        RestAssuredResponseImpl ra = (RestAssuredResponseImpl) w;
        RestAssuredResponseOptionsGroovyImpl groovyResponse = ra.getGroovyResponse();
        groovyResponse.setContentType("text/html");
//        ra.setContentType(JSON);
//        ra.then().body("data.name", equalTo("hah"));
//        Response pp = (Response) JsonP.pp(w);

//        String s = body.asString();
//        String p = "data.name";
//        JsonP.jp(s,p);

        ValidatableResponse t = w.then();
//
        ValidatableResponse b = t.body("data.name", equalTo("hah"));
    }
}
