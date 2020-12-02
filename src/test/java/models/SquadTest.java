package models;


import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void newSquadInstantiatesCorrectly_true() {
        Squad mySquad = setUpNewSquad();
        assertEquals(true,mySquad instanceof Squad);
    }

    @Test
    public void newSquadNameIsInstantiated_String() {
        Squad mySquad = setUpNewSquad();
        assertEquals("Justice League", mySquad.getSquadName());
    }

    @Test
    public void newMaxSizeIsInstantiatedCorrectly_Int() {
        Squad mySquad = setUpNewSquad();
        assertEquals(7, mySquad.getMaxSize());

    }

    @Test
    public void newSquadCauseIsInstantiatedCorrectly_String() {
        Squad mySquad = setUpNewSquad();
        assertEquals("Fighting Evil", mySquad.getSquadCause());
    }

    @Test
    public void all_returnsAllSquadInstances_true() {
        Squad firstSquad = setUpNewSquad();
        Squad secondSquad = new Squad("Nerdies",22,"Computer Illetracy");
        assertEquals(true,Squad.all().contains(firstSquad));
        assertEquals(true,Squad.all().contains(secondSquad));


    }

    @Test
    public void clear_clearsAllSquadsFromList_0() {
        Squad mySquad = setUpNewSquad();
        Squad.clear();
        assertEquals(Squad.all().size(),0);
    }

    @Test
    public void getId_squadsInstantiateWithIdOfOne_1() {
        Squad.clear();
        Squad mySquad = setUpNewSquad();
        assertEquals(1,mySquad.getId());
    }

    @Test
    public void find_getsSquadWithSpecifiedId_true() {
        Squad.clear();
        Squad firstSquad = setUpNewSquad();
        Squad secondSquad = new Squad("nerdies",22,"computer Illiteracy");
        assertEquals(Squad.findById(secondSquad.getId()),secondSquad);

    }

    @Test
    public void getHeroesInitiallyReturnsEmptyList() {
        Squad.clear();
        Squad mySquad = setUpNewSquad();
        assertEquals(0,mySquad.getHeroes().size());
    }

    @Test
    public void addHeroes_addsHeroToHeroList_true() {
        Squad mySquad = setUpNewSquad();
        Individual_Hero testHero = new Individual_Hero("Wonder Woman", 12,"speed" ,"sloths");
        mySquad.addHero(testHero);
        assertTrue(mySquad.getHeroes().contains(testHero));
    }

    public Squad setUpNewSquad(){
        return new Squad("Justice League",7,"Fighting Evil");
    }


}