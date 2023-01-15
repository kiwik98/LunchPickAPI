package kr.co.lunchpick.controller;

import kr.co.lunchpick.dto.LunchPickResponseDto;
import kr.co.lunchpick.service.LunchPickService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LunchPickController {

    private final LunchPickService lunchPickService;

    @GetMapping("/pickmenu/all")
    public List<LunchPickResponseDto> pickMenuAll() {

        return lunchPickService.selectMenuListAll();
    }

    @GetMapping("/pickmenu")
    public List<LunchPickResponseDto> pickMenu(@RequestParam List<String> categoryCode) {

        return lunchPickService.selectMenuList(categoryCode);
    }

}
