import java.util.ArrayList;

public class Genre {
    private String name;
    private Genre parent;
    private ArrayList<Genre> descendants;
    private static ArrayList<Genre> allGenres = new ArrayList<Genre>();

    Genre(String name) {
        this.name = name;
        this.descendants = new ArrayList<Genre>();
        allGenres.add(this);
    }

    Genre(String name, Genre parent) {
        this.name = name;
        this.parent = parent;
        this.descendants = new ArrayList<Genre>();
        this.parent.addDescendants(this);
        allGenres.add(this);
    }

    public void addDescendants(Genre genre) {
        descendants.add(genre);
    }

    public boolean isDescendant(Genre other) {
        if (this == other) return true;
        Genre parent = other.parent;
        while (parent != null && parent != this) {
            parent = parent.parent;
        }
        if (parent != null) return true;
        return false;
    }

    public ArrayList<Genre> getAllDescendants() {
        ArrayList<Genre> result = new ArrayList<Genre>();
        result.add(this);
        for (Genre genre : descendants) {
            result.add(genre);
            result.addAll(genre.getAllDescendants());
        }
        return descendants;
    }

    public static Genre findGenre(String name) {
        for (Genre i : allGenres) {
            if (i.toString().equals(name)) return i;
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}