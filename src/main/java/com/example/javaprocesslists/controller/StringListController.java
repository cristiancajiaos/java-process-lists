package com.example.javaprocesslists.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string-list")
public class StringListController {

  @PostMapping("/filter-start-a")
  @ResponseBody
  public List<String> filterByStartWithA(@RequestBody List<String> stringList) {
    return stringList.stream().filter(s -> s.toLowerCase().startsWith("a")).collect(Collectors.toList());
  }

  @PostMapping("/not-spam")
  @ResponseBody
  public List<String> filterListByNotSpam(@RequestBody List<String> stringList) {
    return stringList.stream().filter(s -> !(s.toLowerCase().contains("spam"))).collect(Collectors.toList());
  }

  @PostMapping("/replace-spam-up")
  @ResponseBody
  public List<String> replaceSpamAndUp(@RequestBody List<String> stringList) {
    return stringList.stream().map(s -> s.replaceAll("spam", "not spam")).map(s -> s.toUpperCase()).collect(Collectors.toList());
  }

  @PostMapping("/foo")
  @ResponseBody
  public List<String> foo(@RequestBody List<String> stringList) {
    return stringList.stream().map(s -> s.replaceAll("spam", "not spam")).map(s -> s.toUpperCase()).collect(Collectors.toList());
  }
}
