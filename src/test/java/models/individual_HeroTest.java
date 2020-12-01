package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Individual_HeroTest {

    @Test
    public void newHeroObjectIsCorrectlyCreated_true() throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals(true, hero instanceof Individual_Hero);

    }

    @Test
    public void HeroInstantiateWithName_String() throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals("Batman",hero.getName());
    }

    @Test
    public void HeroInstantiateWithAge_Int () throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals(22,hero.getAge());
    }

    @Test
    public void heroInstantiatesWithHeroWeakness_String() throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals("light",hero.getWeakness());
    }

    @Test
    public void heroInstantiatesWithSpecialPower_String() {
        Individual_Hero hero = setUpNewHero();
        assertEquals("Flying in the dark",hero.getSpecialPower());
    }

    @Test
    public void heroInstantiatesWithCorrectId_Int() {
        Individual_Hero hero = setUpNewHero();
        hero.clear();
        assertEquals(1,hero.getId());
    }

    public Individual_Hero setUpNewHero(){
        return new Individual_Hero("Batman",22,"Flying in the dark","light");
    }
}