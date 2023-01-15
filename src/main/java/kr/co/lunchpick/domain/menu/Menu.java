package kr.co.lunchpick.domain.menu;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table
public class Menu {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MENU_CD;

    @Column(nullable = false)
    private String MENU_CATEGORY_CD;

    @Column(nullable = false)
    private String MENU_NAME;

    @Column(nullable = false)
    private String RESTAURANT_NAME;

    @Column(nullable = true)
    private String RESTAURANT_LOCATION;


}
