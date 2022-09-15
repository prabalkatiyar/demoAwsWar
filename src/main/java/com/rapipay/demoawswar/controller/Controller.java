package com.rapipay.demoawswar.controller;

import com.rapipay.conf.appprop.ReadProperties;
import com.rapipay.demoawswar.responsemodel.ApiResponseData;
import com.rapipay.demoawswar.responsemodel.MobiToPosResponseDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Controller {

    public static final Logger log = LogManager.getLogger(Controller.class);

    @Value("${message}")
    public String message="";
    //    public String message=ReadProperties.getPropertyData("message");
    @GetMapping("/getMethodWar")
    public MobiToPosResponseDto getMethod() {
        MobiToPosResponseDto response = new MobiToPosResponseDto();
        ApiResponseData res = new ApiResponseData();
        response.setApiResponseData(res);
        try {
            response.setApiResponseCode("200");
            response.setApiResponseMessage("success");

            log.info("Inside getMethodWar Controller");
            log.info("Project has deployed on AWS "+message);
//            log.info("Project has deployed on AWS");

            response.getApiResponseData().setResponseCode("200");
            response.getApiResponseData().setResponseMessage("success");
            response.getApiResponseData().setResponseData("Project has deployed on AWS "+ message);
//            response.getApiResponseData().setResponseData("Project has deployed on AWS ");

        } catch (Exception e) {
            log.error("Exception occured in getMethod Controller");
            response.setApiResponseCode("401");
            response.setApiResponseMessage("something went wrong");
            response.getApiResponseData().setResponseCode("401");
            response.getApiResponseData().setResponseMessage("something went wrong");
            response.getApiResponseData().setResponseData(e.toString());
        }
        response.setApiResponseDateTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        response.setApiResponseFrom("DEMO AWS "+message);
        log.info("Response from Get API :- {} ",response.toString());
        return response;
    }

    @PostMapping("/postMethodWar")
    public MobiToPosResponseDto postMethod(@RequestBody String request) {
        MobiToPosResponseDto response = new MobiToPosResponseDto();
        ApiResponseData res = new ApiResponseData();
        response.setApiResponseData(res);
        try {
            response.setApiResponseCode("200");
            response.setApiResponseMessage("success");

            log.info("Inside postMethodWar Controller");
            log.info("Project has deployed on AWS "+message);
            log.info(request);

            response.getApiResponseData().setResponseCode("200");
            response.getApiResponseData().setResponseMessage("success");
            response.getApiResponseData().setResponseData(request+message);
//            response.getApiResponseData().setResponseData(request);

        } catch (Exception e) {
            log.error("Exception occured in postMethod Controller");
            response.setApiResponseCode("401");
            response.setApiResponseMessage("something went wrong");
            response.getApiResponseData().setResponseCode("401");
            response.getApiResponseData().setResponseMessage("something went wrong");
            response.getApiResponseData().setResponseData(e.toString());
        }
        response.setApiResponseDateTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        response.setApiResponseFrom("DEMO AWS "+message);
        log.info("Response from Post API :- {} ",response.toString());
        return response;
    }
}
