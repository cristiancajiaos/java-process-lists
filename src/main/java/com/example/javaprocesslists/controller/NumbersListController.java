package com.example.javaprocesslists.controller;

import com.example.javaprocesslists.entity.ListNumber;
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
    return numbers.stream().map(n -> n * 2).collect(Collectors.toList());
  }

  @PostMapping("/n-times")
  @ResponseBody
  public List<Long> nTimes(@RequestBody ListNumber listNumber) {
    return listNumber.getNumbersList().stream().map(n -> n * listNumber.getnTimes()).collect(
        Collectors.toList());
  }

  @PostMapping("/only-even")
  @ResponseBody
  public List<Long> recoverOnlyEvenNumbers(@RequestBody List<Long> numbers) {
    return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
  }

  @PostMapping("/sorted")
  @ResponseBody
  public List<Long> sortListNumbers(@RequestBody List<Long> numbers) {
    return numbers.stream().sorted().collect(Collectors.toList());
  }

  @PostMapping("/foo")
  @ResponseBody
  public List<Long> foo(@RequestBody List<Long> numbers) {
    return numbers.stream().sorted().collect(Collectors.toList());
  }
}
