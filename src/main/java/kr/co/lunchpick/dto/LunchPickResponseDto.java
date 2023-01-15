package kr.co.lunchpick.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import kr.co.lunchpick.domain.menu.Menu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LunchPickResponseDto {

    @JsonProperty("MENU_CD")
    private Long MENU_CD;
    @JsonProperty("MENU_CATEGORY_CD")
    private String MENU_CATEGORY_CD;
    @JsonProperty("MENU_NAME")
    private String MENU_NAME;
    @JsonProperty("RESTAURANT_NAME")
    private String RESTAURANT_NAME;
    @JsonProperty("RESTAURANT_LOCATION")
    private String RESTAURANT_LOCATION;

    public LunchPickResponseDto(Menu entity) {
        this.MENU_CD = entity.getMENU_CD();
        this.MENU_CATEGORY_CD = entity.getMENU_CATEGORY_CD();
        this.MENU_NAME = entity.getMENU_NAME();
        this.RESTAURANT_NAME = entity.getRESTAURANT_NAME();
        this.RESTAURANT_LOCATION = entity.getRESTAURANT_LOCATION();
    }
}
