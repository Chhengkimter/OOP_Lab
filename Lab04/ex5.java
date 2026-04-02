package Lab04;

import java.util.Scanner;

public class ex5 {

    public static class Song {
        private String title;
        private String signer;
        private String length;
        private double price;

        public Song(String title, String signer, String length, double price) {
            this.title = title;
            this.signer = signer;
            this.length = length;
            this.price = price;
        }

        public String getTitle() { return title; }
        public String getSigner() { return signer; }
        public String getLength() { return length; }
        public double getPrice() { return price; }
    }

    public static class Album {
        private String title;
        private String genre;
        private Song[] songs;
        private int songCount;

        public Album(String title, String genre) {
            this.title = title;
            this.genre = genre;
            this.songs = new Song[100];
            this.songCount = 0;
        }

        public String getTitle() { return title; }
        public int getSongCount() { return songCount; }

        public void addSong(Song song) {
            if (songCount < 100) {
                songs[songCount++] = song;
            }
        }

        public Song getSong(int index) { return songs[index]; }
    }

    public static int createAlbum(Scanner input, Album[] albums, int albumCount) {
        System.out.print("Album title: ");
        String title = input.nextLine();
        System.out.print("Genre: ");
        String genre = input.nextLine();

        albums[albumCount] = new Album(title, genre);
        albumCount++;
        System.out.println();
        return albumCount;
    }

    public static int addSong(Scanner input, Album[] albums, int albumCount) {
        if (albumCount == 0) {
            System.out.println("No albums available. Please create an album first.");
            return albumCount;
        }

        System.out.println("==== Add a new song ====");
        System.out.println("Select following album:");
        for (int i = 0; i < albumCount; i++) {
            System.out.println((i + 1) + ". " + albums[i].getTitle());
        }
        System.out.print("Choose an opt: ");
        int albumChoice = input.nextInt() - 1;
        input.nextLine();

        if (albumChoice < 0 || albumChoice >= albumCount) {
            System.out.println("Invalid album choice.");
            return albumCount;
        }

        System.out.print("Song title: ");
        String title = input.nextLine();
        System.out.print("Signer: ");
        String signer = input.nextLine();
        System.out.print("Length: ");
        String length = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        Song newSong = new Song(title, signer, length, price);
        albums[albumChoice].addSong(newSong);

        System.out.println("\nA new song added to the album");
        return albumCount;
    }

    public static void viewMusicStore(Album[] albums, int albumCount) {
        System.out.println("====== Music Store ======");
        for (int i = 0; i < albumCount; i++) {
            Album album = albums[i];
            System.out.println("Album: " + album.getTitle());
            if (album.getSongCount() == 0) {
                System.out.println("None of song");
            } else {
                for (int j = 0; j < album.getSongCount(); j++) {
                    Song song = album.getSong(j);
                    System.out.printf("| %-2d | %-20s | %-10s | %-6s | %-5.0f$ |%n",
                            j + 1, song.getTitle(), song.getSigner(), song.getLength(), song.getPrice());
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Album[] albums = new Album[100];
        int albumCount = 0;

        while (true) {
            System.out.println("====== Menu ======");
            System.out.println("1. View a music store");
            System.out.println("2. Add a song");
            System.out.println("3. Create an album");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    viewMusicStore(albums, albumCount);
                    break;
                case 2:
                    albumCount = addSong(input, albums, albumCount);
                    break;
                case 3:
                    albumCount = createAlbum(input, albums, albumCount);
                    break;
                case 4:
                    System.out.println("ByeBye!");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}