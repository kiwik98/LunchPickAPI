package kr.co.lunchpick.domain.menu;

import java.util.List;

public interface MenuCustomRepository {

    List<Menu> selectMenu(List<String> categoryCode);
}
