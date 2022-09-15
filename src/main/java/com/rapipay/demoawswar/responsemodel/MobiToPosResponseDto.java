package com.rapipay.demoawswar.responsemodel;

public class MobiToPosResponseDto {

    private String apiResponseCode;
    private String apiResponseMessage;
    private ApiResponseData apiResponseData;
    private String apiResponseFrom;
    private String apiResponseDateTime;

    public MobiToPosResponseDto() {
        super();

    }

    public String getApiResponseCode() {
        return apiResponseCode;
    }

    public void setApiResponseCode(String apiResponseCode) {
        this.apiResponseCode = apiResponseCode;
    }

    public String getApiResponseMessage() {
        return apiResponseMessage;
    }

    public void setApiResponseMessage(String apiResponseMessage) {
        this.apiResponseMessage = apiResponseMessage;
    }

    public ApiResponseData getApiResponseData() {
        return apiResponseData;
    }

    public void setApiResponseData(ApiResponseData apiResponseData) {
        this.apiResponseData = apiResponseData;
    }

    public String getApiResponseFrom() {
        return apiResponseFrom;
    }

    public void setApiResponseFrom(String apiResponseFrom) {
        this.apiResponseFrom = apiResponseFrom;
    }

    public String getApiResponseDateTime() {
        return apiResponseDateTime;
    }

    public void setApiResponseDateTime(String apiResponseDateTime) {
        this.apiResponseDateTime = apiResponseDateTime;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "apiResponseCode='" + apiResponseCode + '\'' +
                ", apiResponseMessage='" + apiResponseMessage + '\'' +
                ", apiResponseData=" + apiResponseData +
                ", apiResponseFrom='" + apiResponseFrom + '\'' +
                ", apiResponseDateTime='" + apiResponseDateTime + '\'' +
                '}';
    }
}
