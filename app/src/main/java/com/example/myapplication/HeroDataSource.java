package com.example.myapplication;

import android.widget.Button;

import java.util.ArrayList;

public class HeroDataSource {
    private static String[] heroNames = {
            "Arsenal",
            "Chelsea",
            "Everton",
            "Liverpool",
            "Leicester City",
            "Manchester City",
            "Manchester United",
            "Newcastle United",
            "Southampton",
            "Tottenham Hotspur"
    };


    private static String[] heroDetails = {
            "Arsenal\n" +
                    "Arsenal Football Club is a professional football club based in Islington, London, England that plays in the\n" +
                    "Premier League, the top flight of English football. The club has won 13 league titles (including one unbeaten\n" +
                    "title), a record 14 FA Cups, two League Cups, 16 FA Community Shields, the League Centenary Trophy, one\n" +
                    "European Cup Winners' Cup, and one Inter-Cities Fairs Cup.",
            "Chelsea\n" +
                    "Chelsea Football Club is an English professional football club based in Fulham, London. Founded in 1905,\n" +
                    "the club competes in the Premier League, the top division of English football. Chelsea are among England's\n" +
                    "most successful clubs, having won over thirty competitive honours, including six league titles and six European\n" +
                    "trophies. Their home ground is Stamford Bridge.",
            "Everton\n" +
                    "Everton Football Club (/ˈɛvərtən/) is an English professional football club based in Liverpool that competes\n" +
                    "in the Premier League, the top tier of English football. The club is a founding member of the Football League\n" +
                    "and has competed in the top division for a record 118 seasons since the Football League's creation, having\n" +
                    "missed only four top-flight seasons (1930–31, 1951–52, 1952–53, 1953–54). Everton is the second-longest\n" +
                    "continuous serving club in English top flight football[2] and has won nine league titles, five FA Cups, one\n" +
                    "European Cup Winners' Cup and nine Charity Shields.",
            "Liverpool\n" +
                    "Liverpool Football Club is a professional football club in Liverpool, England, that competes in the Premier\n" +
                    "League, the top tier of English football. Domestically, the club has won nineteen League titles, seven FA Cups,\n" +
                    "a record eight League Cups and fifteen FA Community Shields. In international competitions, the club has won\n" +
                    "six European Cups, more than any other English club, three UEFA Cups, four UEFA Super Cups (also English\n" +
                    "records) and one FIFA Club World Cup.",
            "Leicester City\n" +
                    "Leicester City Football Club is a professional football club based in Leicester in the East Midlands, England.\n" +
                    "The club competes in the Premier League, the top division of England's football league system, and plays its\n" +
                    "home matches at the King Power Stadium.",
            "Manchester City\n" +
                    "Manchester City Football Club is an English football club based in Manchester that competes in the Premier\n" +
                    "League, the top flight of English football. Founded in 1880 as St. Mark's (West Gorton), it became Ardwick\n" +
                    "Association Football Club in 1887 and Manchester City in 1894. The club's home ground is the Etihad\n" +
                    "Stadium in east Manchester, to which it moved in 2003, having played at Maine Road since 1923. The club\n" +
                    "adopted their sky blue home shirts in 1894 in the first season of the club's current iteration, that have been\n" +
                    "used ever since.",
            "Manchester United\n" +
                    "Manchester United Football Club is a professional football club based in Old Trafford, Greater Manchester,\n" +
                    "England, that competes in the Premier League, the top flight of English football. Nicknamed \"the Red Devils\",\n" +
                    "the club was founded as Newton Heath LYR Football Club in 1878, changed its name to Manchester United in\n" +
                    "1902 and moved to its current stadium, Old Trafford, in 1910.",
            "Newcastle United\n" +
                    "Newcastle United Football Club is an English professional football club based in Newcastle upon Tyne,\n" +
                    "Tyne and Wear, that plays in the Premier League, the top flight of English football. Founded in 1892 by the\n" +
                    "merger of Newcastle East End and Newcastle West End. The team plays its home matches at St. James' Park.\n" +
                    "Per the Taylor Report's requirement that all Premier League clubs have an all-seater stadium, the ground was\n" +
                    "adjusted in the mid-1990s and now has a capacity of 52,305.",
            "Southampton\n" +
                    "Southampton Football Club (/saʊθˈ(h)æmptən/ (About this soundlisten)) is an English professional football club based in\n" +
                    "Southampton, Hampshire, which plays in the Premier League, the top tier of English football. One of the\n" +
                    "founding members of the Premier League, they have spent the majority of their history in the top flight since\n" +
                    "their first promotion to it in 1966; their longest continuous period was for 27 seasons between 1978 and 2005.",
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Tottenham Hotspur\n" +
                    "Tottenham Hotspur Football Club, commonly referred to as Tottenham (/ˈtɒtənəm/) or Spurs, is an\n" +
                    "English professional football club in Tottenham, London, that competes in the Premier League. Tottenham\n" +
                    "Hotspur Stadium has been the club's home ground since April 2019, replacing their former home of White Hart\n" +
                    "Lane, which had been demolished to make way for the new stadium on the same site. Their training ground is\n" +
                    "on Hotspur Way in Bulls Cross in the London Borough of Enfield. The club is owned by ENIC Group. Tottenham\n" +
                    "have played in a first (home) strip of white shirts and navy blue shorts since the 1898–99 season. The club's\n" +
                    "emblem is a cockerel standing upon a football, with a Latin motto Audere est Facere (\"To Dare Is to Do\")."
    };



    private static int[] heroesImages = {
            R.drawable.arsenal,
            R.drawable.chelsea,
            R.drawable.everton,
            R.drawable.liverpool,
            R.drawable.leicester,
            R.drawable.mc,
            R.drawable.mu,
            R.drawable.nu,
            R.drawable.southampton,
            R.drawable.tot
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }

    static Hero getDataIndex(int position) {
        Hero hero = new Hero();
        hero.setName(heroNames[position]);
        hero.setDetail(heroDetails[position]);
        hero.setPhoto(heroesImages[position]);
        return hero;
    }
}