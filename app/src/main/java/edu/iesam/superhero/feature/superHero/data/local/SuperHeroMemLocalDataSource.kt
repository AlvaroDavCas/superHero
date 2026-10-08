package edu.iesam.superhero.feature.superHero.data.local

import edu.iesam.superhero.feature.superHero.domain.SuperHero

class SuperHeroMemLocalDataSource {

    private val superHero = mutableListOf(
        SuperHero("1", "Aatrox", "aatrox", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Aatrox.png"),
        SuperHero("2", "Ahri", "ahri", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Ahri.png"),
        SuperHero("3", "Akali", "akali", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Akali.png"),
        SuperHero("4", "Akshan", "akshan", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Akshan.png"),
        SuperHero("5", "Alistar", "alistar", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Alistar.png"),
        SuperHero("6", "Amumu", "amumu", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Amumu.png"),
        SuperHero("7", "Anivia", "anivia", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Anivia.png"),
        SuperHero("8", "Annie", "annie", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Annie.png"),
        SuperHero("9", "Aphelios", "aphelios", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Aphelios.png"),
        SuperHero("10", "Ashe", "ashe", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Ashe.png"),
        SuperHero("11", "Aurelion Sol", "aurelion-sol", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/AurelionSol.png"),
        SuperHero("12", "Aurora", "aurora", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Aurora.png"),
        SuperHero("13", "Azir", "azir", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Azir.png"),
        SuperHero("14", "Bard", "bard", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Bard.png"),
        SuperHero("15", "Bel'Veth", "bel-veth", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Belveth.png"),
        SuperHero("16", "Blitzcrank", "blitzcrank", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Blitzcrank.png"),
        SuperHero("17", "Brand", "brand", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Brand.png"),
        SuperHero("18", "Braum", "braum", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Braum.png"),
        SuperHero("19", "Caitlyn", "caitlyn", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Caitlyn.png"),
        SuperHero("20", "Camille", "camille", "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/Camille.png")
    )

    fun getAll() : List<SuperHero> = superHero

}