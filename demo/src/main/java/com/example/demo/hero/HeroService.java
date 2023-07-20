package com.example.demo.hero;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


@Service
public class HeroService {

    private List<Hero> heroes = new ArrayList<>(
            Arrays.asList(
                    new Hero(1, "Night Stalker", "The beast of bedtime tales, Balanar is the primal terror that every child knows to fear.", "Void, Crippling Fear, Hunter in the Night, Dark Ascension"),
                    new Hero(2, "Earthshaker", "Woken from the depth of the earth, Raigor Stonehoof shapes the battlefield with seismic force.", "Fissue, Enchant Totem, Aftershock, Echo Slam"),
                    new Hero(3, "Gyrocopter", "The world's first non-magical flying device took over a decade to create, and less than a few seconds to shoot down.", "Rocket Barrage, Homing Missle, Flak Cannon, Call Down"),
                    new Hero(4, "Legion Commander", "Renowned for her intrepid defense of Stonehall, the commander of the Bronze Legion swore a brutal vengeance upon its Abyssal Invaders.", "Overwhelming Odds, Press the Attack, Moment of Courage, Duel"),
                    new Hero(5, "Huskar", "Rescued against his will from the Nothl Realm, the revived Huskar found supernatural strength in his own living essence.", "Inner Fire, Burning Spear, Berserker's Blood, Life Break")
            )
    );
    public List<Hero> getHeroes(){
        return heroes;
    }

    public Hero getHeroesById(Integer id){
        Hero hero = heroes.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);

        return hero;
    }
}
