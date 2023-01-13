package org.example;

public class TVShow {
    private int numSeasons, episodesPerSeason;
    private String name, rating;

    public TVShow(String name, int numSeasons, int ep, String rating){
        this.name = name;
        this.numSeasons = numSeasons;
        episodesPerSeason = ep;
        this.rating = rating;
    }

    //overload
    public TVShow(String name, int numSeasons, int ep){
        rating = "N/A";
        this.name = name;
        this.numSeasons = numSeasons;
        episodesPerSeason = ep;
    }

    //getter review
    /*
        public datatype getProperty(){
            return property;
        }
     */

    //setter review
    /*
        public void setProperty(datatype newValue){
            property = newValue;
        }
     */

    public int getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(int numSeasons) {
        this.numSeasons = numSeasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String toString(){
        //for example with rating:
        //The show Grey's Anatomy, rated PG13, has been airing for 19 seasons

        //for example with NO rating:
        //The show Grey's Anatomy has been airing for 19 seasons
        StringBuilder sb = new StringBuilder("The show ");
        sb.append(name);
        //if the rating is NOT N/A
        if (!rating.equals("N/A")){
            sb.append(", rated ");
            sb.append(rating);
            sb.append(",");
        }
        sb.append(" has been airing for ");
        sb.append(getNumSeasons());
        sb.append(" seasons!");
        return sb.toString();
    }

    public int calculateTotalEpisodes(){
        return numSeasons * episodesPerSeason;
    }
}
