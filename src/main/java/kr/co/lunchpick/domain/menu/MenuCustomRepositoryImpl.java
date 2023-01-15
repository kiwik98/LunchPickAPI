package kr.co.lunchpick.domain.menu;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static kr.co.lunchpick.domain.menu.QMenu.menu;

@Repository
public class MenuCustomRepositoryImpl implements MenuCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;


    public MenuCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<Menu> selectMenu(List<String> categoryCode) { //카테고리 선택 - 메뉴 조회
        return jpaQueryFactory
                .select(menu)
                .from(menu)
                .where(menu.MENU_CATEGORY_CD.in(categoryCode))
                .fetch();
    }
}
