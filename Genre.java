import java.util.ArrayList;

public class Genre {
    public String name;
    private ArrayList<Genre> descendants = new ArrayList<Genre>();
    public static Genre genres = new Genre("allGenres");

    Genre() {
    }

    Genre(String name){
        this.name = name;
    }

    public void addGenre(String name) {
        this.descendants.add(new Genre(name));
    }

    public void addGenre(String genre, String parent){
        this.findGenre(parent).addGenre(genre);
    }

    public boolean isDescendantOf(Genre descendant) {
        if ((this.findGenre(descendant.name)) != null) return true;
        return false;
    }


    public Genre findGenre(String name) {
        if (this.name.equals(name)) return this;
        if (this.descendants.isEmpty()) return null;
        for (Genre i : this.descendants) {
            Genre temp = i.findGenre(name);
            if (temp != null) return temp;
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((Genre)o).name);
    }

    @Override
    public String toString() {
        String temp = name;
        return temp;
    }
}