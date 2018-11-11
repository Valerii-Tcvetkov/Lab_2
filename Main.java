public class Main {
    public static void main(String[] args) {
        Genre rock = new Genre("rock");
        Genre pop = new Genre("pop");
        Genre metal = new Genre("metal", rock);
        Genre heavymetal = new Genre("heavymetal", metal);

        EngineObject song1 = new Song();
        EngineObject song2 = new Song();
        EngineObject song3 = new Song();
        EngineObject song4 = new Song();

        ((Song) song1).setName("Enjoy the silence");
        ((Song) song1).setGenre("rock");
        ((Song) song1).setLength("3.04");
        ((Song) song1).setSinger("Depeche Mode");
        ((Song) song1).setReleaseDate("1999");

        ((Song) song2).setGenre("metal");
        ((Song) song2).setSinger("Rammstein");
        ((Song) song2).setName("Sonne");
        ((Song) song2).setLength("3.45");

        ((Song) song3).setName("Poker Face");
        ((Song) song3).setGenre("pop");
        ((Song) song3).setSinger("Lady Gaga");
        ((Song) song3).setReleaseDate("2001");

        ((Song) song4).setName("Decadance");
        ((Song) song4).setSinger("Disturbed");
        ((Song) song4).setReleaseDate("1999");
        ((Song) song4).setGenre("heavymetal");

        EngineObject album1 = new Album();

        ((Album) album1).setName("My lovely songs");
        ((Album) album1).setGenre("rock");
        ((Album) album1).addSong((Song)song1);
        ((Album) album1).addSong((Song)song2);

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