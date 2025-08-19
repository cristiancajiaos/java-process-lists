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
}
