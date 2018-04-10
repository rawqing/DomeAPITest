package com.yq.apiTest.extend

import groovy.json.JsonSlurper
import io.restassured.response.Response

import static io.restassured.http.ContentType.JSON

/**
 * Created by king on 2018/4/10.
 */
class JsonP {

    def static jp(String json,String p){
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText(json)

        println object.p


    }

    def static pp(Response response){
        def r = response.getGroovyResponse
        return response
    }

}
