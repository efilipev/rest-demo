package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public final class TeamsHelper {

    private static final String losAngelesKings = "44151f7a-0f24-11e2-8525-18a905767e44";
    private static final String arizona = "44153da1-0f24-11e2-8525-18a905767e44";
    private static final String sanJose = "44155909-0f24-11e2-8525-18a905767e44";
    private static final String calgary = "44159241-0f24-11e2-8525-18a905767e44";
    private static final String vancouver = "4415b0a7-0f24-11e2-8525-18a905767e44";
    private static final String edmonton = "4415ea6c-0f24-11e2-8525-18a905767e44";
    private static final String anaheim = "441862de-0f24-11e2-8525-18a905767e44";
    private static final String dallas = "44157522-0f24-11e2-8525-18a905767e44";
    private static final String colorado = "4415ce44-0f24-11e2-8525-18a905767e44";
    private static final String minnesota = "4416091c-0f24-11e2-8525-18a905767e44";
    private static final String chicago = "4416272f-0f24-11e2-8525-18a905767e44";
    private static final String nashville = "441643b7-0f24-11e2-8525-18a905767e44";
    private static final String stLouis = "441660ea-0f24-11e2-8525-18a905767e44";
    private static final String winnipeg = "44180e55-0f24-11e2-8525-18a905767e44";
    private static final String detroit = "44169bb9-0f24-11e2-8525-18a905767e44";
    private static final String boston = "4416ba1a-0f24-11e2-8525-18a905767e44";
    private static final String buffalo = "4416d559-0f24-11e2-8525-18a905767e44";
    private static final String ottawa = "4416f5e2-0f24-11e2-8525-18a905767e44";
    private static final String montreal = "441713b7-0f24-11e2-8525-18a905767e44";
    private static final String toronto = "441730a9-0f24-11e2-8525-18a905767e44";
    private static final String tampaBay = "4417d3cb-0f24-11e2-8525-18a905767e44";
    private static final String florida = "4418464d-0f24-11e2-8525-18a905767e44";
    private static final String columbus = "44167db4-0f24-11e2-8525-18a905767e44";
    private static final String newJersey = "44174b0c-0f24-11e2-8525-18a905767e44";
    private static final String newYorkIslanders = "441766b9-0f24-11e2-8525-18a905767e44";
    private static final String newYorkRangers = "441781b9-0f24-11e2-8525-18a905767e44";
    private static final String philadelphia = "44179d47-0f24-11e2-8525-18a905767e44";
    private static final String pittsburgh = "4417b7d7-0f24-11e2-8525-18a905767e44";
    private static final String washington = "4417eede-0f24-11e2-8525-18a905767e44";
    private static final String carolina = "44182a9d-0f24-11e2-8525-18a905767e44";

    public static Map<String,String> teamIdHolder(){
         Map<String,String> teamsId = new HashMap<>();
         teamsId.put("Kings", TeamsHelper.losAngelesKings);
         teamsId.put("Coyotes", TeamsHelper.arizona);
         teamsId.put("Sharks", TeamsHelper.sanJose);
         teamsId.put("Flames", TeamsHelper.calgary);
         teamsId.put("Canucks", TeamsHelper.vancouver);
         teamsId.put("Oilers", TeamsHelper.edmonton);
         teamsId.put("Ducks", TeamsHelper.anaheim);
         teamsId.put("Stars", TeamsHelper.dallas);
         teamsId.put("Avalanche", TeamsHelper.colorado);
         teamsId.put("Wild", TeamsHelper.minnesota);
         teamsId.put("Blackhawks", TeamsHelper.chicago);
         teamsId.put("Predators", TeamsHelper.nashville);
         teamsId.put("Blues", TeamsHelper.stLouis);
         teamsId.put("Jets", TeamsHelper.winnipeg);
         teamsId.put("Red Wings", TeamsHelper.detroit);
         teamsId.put("Bruins", TeamsHelper.boston);
         teamsId.put("Sabres", TeamsHelper.buffalo);
         teamsId.put("Senators", TeamsHelper.ottawa);
         teamsId.put("Canadiens", TeamsHelper.montreal);
         teamsId.put("Maple Leafs", TeamsHelper.toronto);
         teamsId.put("Lightning", TeamsHelper.tampaBay);
         teamsId.put("Panthers", TeamsHelper.florida);
         teamsId.put("Blue Jackets", TeamsHelper.columbus);
         teamsId.put("Devils", TeamsHelper.newJersey);
         teamsId.put("Islanders", TeamsHelper.newYorkIslanders);
         teamsId.put("Rangers", TeamsHelper.newYorkRangers);
         teamsId.put("Flyers", TeamsHelper.philadelphia);
         teamsId.put("Penguins", TeamsHelper.pittsburgh);
         teamsId.put("Capitals", TeamsHelper.washington);
         teamsId.put("Hurricanes", TeamsHelper.carolina);

         return teamsId;

    }
}
