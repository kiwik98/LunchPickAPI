package kr.co.lunchpick.service;

import kr.co.lunchpick.domain.menu.MenuRepository;
import kr.co.lunchpick.dto.LunchPickResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LunchPickService {

    private final MenuRepository menuRepository;

    public List<LunchPickResponseDto> selectMenuListAll() {
        return menuRepository.findAll().stream()
                .map(LunchPickResponseDto::new)
                .collect(Collectors.toList());
    }

    public List<LunchPickResponseDto> selectMenuList(List<String> categoryCode) {
        return menuRepository.selectMenu(categoryCode).stream()
                .map(LunchPickResponseDto::new)
                .collect(Collectors.toList());
    }
}
