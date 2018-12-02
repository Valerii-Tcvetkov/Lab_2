public class Main {
    public static void main(String[] args) {


        Genre.genres.addGenre("rock");
        Genre.genres.addGenre("pop");
        Genre.genres.addGenre("metal", "rock");
        Genre.genres.addGenre("heavymetal", "metal");


        Song song1 = new Song();
        Song song2 = new Song();
        Song song3 = new Song();
        Song song4 = new Song();

        song1.setName("Enjoy the silence");
        song1.setGenre("rock");
        song1.setLength("3.04");
        song1.setSinger("Depeche Mode");
        song1.setReleaseDate("1999");

        song2.setGenre("metal");
        song2.setSinger("Rammstein");
        song2.setName("Sonne");
        song2.setLength("3.45");

        song3.setName("Poker Face");
        song3.setGenre("pop");
        song3.setSinger("Lady Gaga");
        song3.setReleaseDate("2001");

        song4.setName("Decadance");
        song4.setSinger("Disturbed");
        song4.setReleaseDate("1999");
        song4.setGenre("heavymetal");

        Album album1 = new Album();

        album1.setName("My lovely songs");
        album1.setGenre("rock");
        album1.addSong(song1);
        album1.addSong(song2);

        Engine engine = new Engine();
        engine.addEngineObject(song1)
                .addEngineObject(song2)
                .addEngineObject(song3)
                .addEngineObject(song4)
                .addEngineObject(album1);

        Query query = new QueryBuilder().setProperty("name", "My lovely songs").build();
        System.out.println(engine.find(query).toString());

        query = new QueryBuilder().setProperty("genre", "metal").build();
        System.out.println(engine.find(query).toString());

        query = new QueryBuilder().setProperty("release", "1999").setProperty("singer", "Depeche Mode").build();
        System.out.println(engine.find(query).toString());

        query = new QueryBuilder().setProperty("genre", "pop").build();
        System.out.println(engine.find(query).toString());

    }
}