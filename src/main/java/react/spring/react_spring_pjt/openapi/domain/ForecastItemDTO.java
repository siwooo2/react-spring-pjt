package react.spring.react_spring_pjt.openapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) //없는 데이터 처리를 위해서?
public class ForecastItemDTO {

    @JsonProperty("beachNum")
    private String beachNum;

    @JsonProperty("baseDate")
    private String baseDate;

    @JsonProperty("baseTime")
    private String baseTime;

    @JsonProperty("category")
    private String category;

    @JsonProperty("fcstDate")
    private String fcstDate;

    @JsonProperty("fcstTime")
    private String fcstTime;

    @JsonProperty("fcstValue")
    private String fcstValue;

    @JsonProperty("nx")
    private int nx;

    @JsonProperty("ny")
    private int ny;

    private String categoryName;

}
