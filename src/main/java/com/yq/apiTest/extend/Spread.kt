package com.yq.apiTest.extend

import io.restassured.RestAssured
import io.restassured.RestAssured.`when`
import io.restassured.specification.RequestSender
import io.restassured.specification.RequestSpecification

/**
 * Created by king on 2018/3/10.
 */


fun RequestSpecification.When(): RequestSpecification {
    return this.`when`()
}

fun When(): RequestSender{
    return `when`()
}