package com.example.demo.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/hero")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService){
        this.heroService = heroService;
    }
    @GetMapping
    public List<Hero> getHeroes(){
        return heroService.getHeroes();
    }

    @RequestMapping("/{id}")
    public Hero getHeroesById(@PathVariable Integer id){
        return heroService.getHeroesById(id);
    }
}
