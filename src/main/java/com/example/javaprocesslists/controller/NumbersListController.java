package com.example.javaprocesslists.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers-list")
public class NumbersListController {

  @PostMapping("/double")
  @ResponseBody
  public List<Long> doubleNumbers(@RequestBody List<Long> numbers) {
    return numbers.stream().map(this::doubleNumber).collect(Collectors.toList());
  }

  @PostMapping("/only-even")
  @ResponseBody
  public List<Long> recoverOnlyEvenNumbers(@RequestBody List<Long> numbers) {
    return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
  }

  private Long doubleNumber(Long number) {
    return number * 2;
  }

}
