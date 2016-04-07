/**
 * Created by sachin on 7/4/16.
 */
public class TopPlayerObject {

    String name,title,country,rating,games,b_year;

    public TopPlayerObject(String name, String title, String country, String rating, String games, String b_year) {
        this.name = name;
        this.title = title;
        this.country = country;
        this.rating = rating;
        this.games = games;
        this.b_year = b_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getB_year() {
        return b_year;
    }

    public void setB_year(String b_year) {
        this.b_year = b_year;
    }
}
