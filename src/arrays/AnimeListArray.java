package arrays;

import java.util.ArrayList;
import java.util.List;

public class AnimeListArray {

    // Class definition  Anime
    public static class Anime {
        private String title;
        private double rating;
        private String description;
        private int year;
        private int episodes;
        private String status;

        public Anime(String title, double rating, String description, int year, int episodes, String status) {
            this.title = title;
            this.rating = rating;
            this.description = description;
            this.year = year;
            this.episodes = episodes;
            this.status = status;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public double getRating() {
            return rating;
        }

        public String getDescription() {
            return description;
        }

        public int getYear() {
            return year;
        }

        public int getEpisodes() {
            return episodes;
        }

        public String getStatus() {
            return status;
        }
    }

    // Data definition
    private static final String[] animeTitles = {
            "Jujutsu Kaisen", "Attack on Titan: The Final Season", "Dr. Stone: Stone Wars",
            "The Promised Neverland Season 2", "Re:Zero - Starting Life in Another World Season 2",
            "Sword Art Online: Alicization - War of Underworld", "Mushoku Tensei: Jobless Reincarnation",
            "Wonder Egg Priority", "Vivy: Fluorite Eye’s Song", "86", "Tokyo Revengers",
            "To Your Eternity", "Sk8 the Infinity", "Higehiro: After Being Rejected, I Shaved and Took in a High School Runaway",
            "Komi Can't Communicate", "My Hero Academia Season 5", "Ranking of Kings", "Takt Op. Destiny",
            "Blue Period", "Platinum End", "Shaman King (2021)", "Sonny Boy", "Shadows House",
            "The Case Study of Vanitas", "Edens Zero", "That Time I Got Reincarnated as a Slime Season 2",
            "The Rising of the Shield Hero Season 2", "So I'm a Spider, So What?", "Mushoku Tensei: Jobless Reincarnation Part 2",
            "Re:Zero - Starting Life in Another World Season 2 Part 2", "My Hero Academia Season 6", "Overlord IV",
            "Made in Abyss: The Golden City of the Scorching Sun", "Demon Slayer: Kimetsu no Yaiba - Entertainment District Arc",
            "Attack on Titan: The Final Season Part 2", "Kaguya-sama: Love is War -Ultra Romantic-",
            "Spy x Family", "Summertime Rendering", "Chainsaw Man", "Mob Psycho 100 III",
            "Blue Lock", "Classroom of the Elite Season 2", "Lycoris Recoil", "Call of the Night",
            "Made in Abyss: The Golden City of the Scorching Sun", "Overlord IV", "Re:Zero - Starting Life in Another World Season 2",
            "The Devil Is a Part-Timer! Season 2", "Drifters", "Ascendance of a Bookworm", "Gate: Thus the JSDF Fought There!",
            "My Next Life as a Villainess: All Routes Lead to Doom!", "Seirei Gensouki: Spirit Chronicles",
            "The Rising of the Shield Hero Season 2", "Tsukimichi: Moonlit Fantasy", "The World's Finest Assassin Gets Reincarnated in Another World as an Aristocrat",
            "Jobless Reincarnation: Part 2", "Welcome to Demon School! Iruma-kun", "Cautious Hero: The Hero Is Overpowered but Overly Cautious",
            "Uncle from Another World", "Dead Mount Death Play", "Shangri-La Frontier",
            "Isekai Cheat Magician", "In Another World with My Smartphone", "Log Horizon",
            "The World's Finest Assassin Gets Reincarnated in Another World as an Aristocrat", "How a Realist Hero Rebuilt the Kingdom",
            "Grimgar: Ashes and Illusions", "Restaurant to Another World", "Nobunaga Concerto",
            "Amatsuki", "Kaminaki Sekai no Kamisama Katsudou", "Isekai de Cheat Skill wo Te ni Shita Ore wa, Genjitsu Sekai wo mo Musou Suru",
            "Outbreak Company", "Level 1 dakedo Unique Skill de Saikyou desu", "Jitsu wa Ore, Saikyou deshita?",
            "Higeki no Genkyou to Naru Saikyou Gedou Last Boss Joou wa Tami no Tame ni Tsukushimasu",
            "Kaiju No. 8", "Chained Soldier", "Fluffy Paradise", "The Weakest Tamer Began a Journey to Pick Up Trash",
            "The Wrong Way to Use Healing Magic", "My Instant Death Ability Is So Overpowered, No One in This Other World Stands a Chance Against Me!",
            "Re: Monster", "Dog Days", "Twelve Kingdoms", "Gate: Thus the JSDF Fought There!",
            "Dahliya in Bloom", "A Journey Through Another World: Raising Kids While Adventuring",
            "The New Gate", "Mission: Yozakura Family", "Whisper Me a Love Song",
            "As a Reincarnated Aristocrat, I’ll Use My Appraisal Skill to Rise in the World", "Laid-Back Camp Season 3",
            "Bleach: Thousand-Year Blood War – The Conflict (Part 3)", "Tower of God Season 2",
            "Spice and Wolf: Merchant Meets Wise Wolf", "I’m Standing on a Million Lives", "By the Grace of the Gods",
            "Arifureta: From Commonplace to World's Strongest", "Seirei Gensouki: Spirit Chronicles",
            "The Genius Prince's Guide to Raising a Nation Out of Debt", "Reborn as a Vending Machine, I Now Wander the Dungeon",
            "Prince Lloyd: I Was a Sorcerer in My Previous Life", "Whisper Me a Love Song",
            "Blue Exorcist Season 3", "Dandadan", "Delicious in Dungeon", "Demon Slayer Season 4",
            "Devil May Cry", "Dragon Ball Daima", "Frieren: Beyond Journey's End", "Tokyo Revengers Season 3",
            "Spy Classroom", "Campfire Cooking in Another World with My Absurd Skill",
            "Buta no Liver wa Kanetsu Shiro", "Metallic Rouge", "Tower of God Season 2",
            "Konosuba: God’s Blessing on This Wonderful World! 3", "The Fire Hunter Season 2",
            "The Dangers in My Heart Season 2"
    };

    private static final List<Anime> animeList = new ArrayList<>();

    // Data definition
    static {
        String[][] animeData = {
                {"8.7", "A boy swallows a cursed talisman...", "2020", "24", "Ended"},
                {"9.1", "The battle between Marley and Eldia...", "2020", "16", "Ended"},
                {"8.2", "Senku and his friends go to war...", "2021", "11", "Ended"},
                {"6.5", "Emma and the children of Grace Field House...", "2021", "11", "Ended"},
                {"8.4", "Subaru returns to life...", "2020", "13", "Ended"},
                {"7.5", "Kirito, Eugeo, and Alice fight to protect the Underworld...", "2020", "12", "Ended"},
                {"8.4", "A man is reincarnated in a magical world...", "2021", "23", "Ended"},
                {"7.7", "A girl dealing with her friend's suicide...", "2021", "12", "Ended"},
                {"8.3", "An AI songstress fights to save the future...", "2021", "13", "Ended"},
                {"8.1", "A war between autonomous drones...", "2021", "23", "Ended"},
                {"8.2", "A man travels back in time to save his friends...", "2021", "24", "Ended"},
                {"8.5", "An immortal being takes on different forms...", "2021", "20", "Ended"},
                {"8.0", "Reki and Langa skateboard together...", "2021", "12", "Ended"},
                {"7.4", "A man takes in a runaway girl...", "2021", "13", "Ended"},
                {"8.1", "A high school girl with social anxiety...", "2021", "24", "Ended"},
                {"7.9", "Heroes-in-training face new challenges...", "2021", "25", "Ended"},
                {"8.6", "A deaf and powerless prince...", "2021", "23", "Ended"},
                {"7.5", "A conductor and his musicart fight...", "2021", "12", "Ended"},
                {"7.9", "A high school student discovers his love for art...", "2021", "12", "Ended"},
                {"7.1", "A boy who is saved by an angel...", "2021", "24", "Ended"},
                {"7.4", "Shamans who can communicate with ghosts...", "2021", "52", "Ended"},
                {"7.6", "Students with superpowers are transported to another dimension...", "2021", "12", "Ended"},
                {"7.8", "Living dolls and their shadow masters...", "2021", "13", "Ended"},
                {"7.9", "A vampire and a doctor team up to cure vampirism...", "2021", "24", "Ended"},
                {"7.4", "A boy and his robot friends travel through space...", "2021", "25", "Ended"},
                {"8.1", "A man reincarnated as a slime...", "2021", "24", "Ended"},
                {"7.4", "Naofumi fights new threats to his kingdom...", "2022", "13", "Ended"},
                {"7.4", "A girl reincarnated as a spider in a dungeon...", "2021", "24", "Ended"},
                {"8.4", "A man continues his journey in a magical world...", "2021", "12", "Ended"},
                {"8.4", "Subaru continues his quest to save his friends...", "2021", "12", "Ended"},
                {"7.9", "Heroes face a new threat...", "2022", "25", "Ended"},
                {"7.9", "Ainz Ooal Gown continues to expand his empire...", "2022", "13", "Ended"},
                {"8.7", "Riko, Reg, and Nanachi continue their journey...", "2022", "12", "Ended"},
                {"8.7", "Tanjiro and his friends battle demons in the entertainment district...", "2022", "11", "Ended"},
                {"9.1", "Eren and his allies face new challenges...", "2022", "12", "Ended"},
                {"8.6", "Kaguya and Miyuki continue their romantic battles...", "2022", "12", "Ended"},
                {"8.4", "A spy creates a fake family for a mission...", "2022", "25", "Ended"},
                {"7.8", "A boy returns to his hometown and uncovers dark secrets...", "2022", "24", "Ended"},
                {"8.5", "A boy with the ability to transform into chainsaw weaponry...", "2022", "12", "Ended"},
                {"8.6", "Mob faces new psychic threats...", "2022", "12", "Ended"},
                {"8.1", "A deaf and powerless prince embarks on an adventure...", "2021", "23", "Ended"},
                {"7.4", "A conductor and his musicart battle mysterious creatures...", "2021", "12", "Ended"},
                {"7.5", "An artist struggles to find his identity...", "2021", "12", "Ended"},
                {"7.6", "Students with special abilities navigate a strange world...", "2021", "12", "Ended"},
                {"7.7", "A girl investigates her friend's mysterious death...", "2021", "13", "Ended"},
                {"7.8", "A vampire and a doctor join forces...", "2021", "24", "Ended"},
                {"7.9", "A boy explores a universe of ghosts and spirits...", "2021", "25", "Ended"},
                {"8.0", "A high school student navigates his social anxiety...", "2021", "24", "Ended"},
                {"7.4", "A war between ancient spirits...", "2021", "52", "Ended"},
                {"8.1", "A boy reincarnated as a slime embarks on new adventures...", "2021", "24", "Ended"},
                {"7.5", "A prince with no power embarks on an epic journey...", "2021", "23", "Ended"},
                {"8.4", "An immortal being faces new challenges...", "2021", "20", "Ended"},
                {"8.7", "A journey through a magical abyss...", "2022", "12", "Ended"},
                {"7.9", "A time traveler tries to save his friends...", "2021", "24", "Ended"},
                {"8.0", "A skateboarder explores new tricks...", "2021", "12", "Ended"},
                {"8.3", "A singing AI tries to save the future...", "2021", "13", "Ended"},
                {"7.6", "A boy returns to his hometown to uncover dark secrets...", "2022", "24", "Ended"},
                {"8.5", "A demon hunter faces new threats...", "2022", "12", "Ended"},
                {"7.9", "A man reincarnated as a slime continues his adventures...", "2021", "24", "Ended"},
                {"7.8", "A vampire and a doctor investigate mysterious cases...", "2021", "24", "Ended"},
                {"7.4", "A war between ancient spirits and modern technology...", "2021", "52", "Ended"},
                {"8.6", "A deaf prince and his journey to find his voice...", "2021", "23", "Ended"},
                {"8.7", "A boy with chainsaw powers fights demons...", "2022", "12", "Ended"},
                {"8.5", "A high school student navigates a strange world of superpowers...", "2021", "12", "Ended"},
                {"7.7", "A girl solves supernatural mysteries...", "2021", "13", "Ended"},
                {"8.4", "An epic battle between humans and demons...", "2022", "12", "Ended"},
                {"7.6", "A time traveler tries to save his loved ones...", "2021", "24", "Ended"},
                {"8.3", "A singing AI saves the future through music...", "2021", "13", "Ended"},
                {"7.8", "A war between ancient spirits and modern technology...", "2021", "52", "Ended"},
                {"7.4", "A boy with superpowers navigates a strange world...", "2021", "12", "Ended"},
                {"8.1", "A slime reincarnated in a magical world...", "2021", "24", "Ended"},
                {"7.9", "A high school student finds his passion in art...", "2021", "12", "Ended"},
                {"8.6", "A prince with no power embarks on a journey...", "2021", "23", "Ended"},
                {"8.7", "A magical abyss and its secrets...", "2022", "12", "Ended"},
                {"8.4", "A man reincarnated in a magical world...", "2021", "23", "Ended"},
                {"7.8", "A vampire and a doctor team up to solve cases...", "2021", "24", "Ended"},
                {"8.0", "A boy discovers his love for skateboarding...", "2021", "12", "Ended"},
                {"7.5", "A conductor and his musicart battle supernatural forces...", "2021", "12", "Ended"},
                {"8.7", "A journey through the abyss...", "2022", "12", "Ended"},
                {"7.9", "A boy tries to save his friends in a gang war...", "2021", "24", "Ended"},
                {"8.4", "An AI songstress fights to save humanity...", "2021", "13", "Ended"},
                {"8.0", "A boy and his friends navigate a post-apocalyptic world...", "2021", "24", "Ended"},
                {"7.9", "A boy travels back in time to save his friends...", "2021", "24", "Ended"},
                {"8.1", "A boy and his friends face new challenges...", "2021", "25", "Ended"},
                {"8.4", "A boy and his robot friends explore space...", "2021", "25", "Ended"},
                {"7.7", "A girl investigates her friend's mysterious death...", "2021", "13", "Ended"},
                {"8.4", "A boy reincarnated as a slime continues his adventures...", "2021", "24", "Ended"},
                {"7.9", "A high school student discovers his love for art...", "2021", "12", "Ended"},
                {"8.6", "A prince with no power embarks on a journey...", "2021", "23", "Ended"},
                {"8.7", "A magical abyss and its secrets...", "2022", "12", "Ended"},
                {"7.9", "A time traveler tries to save his loved ones...", "2021", "24", "Ended"},
                {"8.0", "A boy reincarnated in a magical world...", "2021", "24", "Ended"},
                {"8.4", "A boy discovers his love for skateboarding...", "2021", "12", "Ended"},
                {"7.5", "A conductor and his musicart battle supernatural forces...", "2021", "12", "Ended"},
                {"8.4", "A man reincarnated in a magical world...", "2021", "23", "Ended"},
                {"8.1", "A high school student navigates his social anxiety...", "2021", "24", "Ended"},
                {"8.5", "A boy with superpowers navigates a strange world...", "2021", "12", "Ended"},
                {"8.7", "A journey through the abyss...", "2022", "12", "Ended"},
                {"7.9", "A boy and his friends face new challenges...", "2021", "25", "Ended"},
                {"8.4", "A man reincarnated as a vending machine...", "2022", "12", "Ended"},
                {"7.8", "A doctor and a vampire solve mysteries...", "2021", "24", "Ended"},
                {"8.0", "A boy discovers his love for skating...", "2021", "12", "Ended"},
                {"7.5", "A conductor and his musicart fight together...", "2021", "12", "Ended"},
                {"8.7", "A magical abyss filled with secrets...", "2022", "12", "Ended"},
                {"7.9", "A time traveler tries to save his friends...", "2021", "24", "Ended"},
                {"8.4", "A singing AI fights to save humanity...", "2021", "13", "Ended"},
                {"8.0", "A boy and his friends explore a new world...", "2021", "24", "Ended"},
                {"8.6", "A prince embarks on a journey...", "2021", "23", "Ended"},
                {"8.7", "A boy with chainsaw powers fights demons...", "2022", "12", "Ended"},
                {"8.5", "A high school student navigates a strange world of superpowers...", "2021", "12", "Ended"},
                {"7.7", "A girl solves supernatural mysteries...", "2021", "13", "Ended"},
                {"8.4", "An epic battle between humans and demons...", "2022", "12", "Ended"},
                {"8.1", "A slime reincarnated in a magical world...", "2021", "24", "Ended"},
                {"7.9", "A boy and his friends face new challenges...", "2021", "25", "Ended"},
                {"8.0", "A boy explores the post-apocalyptic world...", "2021", "24", "Ended"},
                {"8.6", "A prince's journey continues...", "2021", "23", "Ended"},
                {"8.7", "A chainsaw-wielding boy fights demons...", "2022", "12", "Ended"},
                {"8.4", "A man reincarnated as a vending machine...", "2022", "12", "Ended"},
                {"7.9", "A vampire and a doctor solve cases...", "2021", "24", "Ended"},
                {"8.1", "A high school student's artistic journey...", "2021", "12", "Ended"},
                {"8.5", "A boy with superpowers navigates a strange world...", "2021", "12", "Ended"},
                {"7.8", "A supernatural war unfolds...", "2021", "52", "Ended"},
                {"8.4", "A time traveler tries to save his loved ones...", "2021", "24", "Ended"},
                {"8.0", "A boy reincarnated in a magical world...", "2021", "24", "Ended"},
                {"7.9", "A high school student finds his passion...", "2021", "12", "Ended"},
                {"8.6", "A prince's journey to find his voice...", "2021", "23", "Ended"},
                {"8.7", "A journey through a magical abyss...", "2022", "12", "Ended"},
                {"8.4", "A singing AI fights for humanity...", "2021", "13", "Ended"},
                {"8.0", "A boy and his friends navigate challenges...", "2021", "24", "Ended"},
                {"7.9", "A time traveler saves his friends...", "2021", "24", "Ended"},
                {"8.1", "A slime's magical journey continues...", "2021", "24", "Ended"},
                {"8.4", "A boy explores a post-apocalyptic world...", "2021", "24", "Ended"},
                {"7.7", "A girl investigates mysterious deaths...", "2021", "13", "Ended"},
                {"8.6", "A prince embarks on an epic journey...", "2021", "23", "Ended"},
                {"8.5", "A boy with superpowers faces new threats...", "2021", "12", "Ended"},
                {"8.7", "A magical abyss and its secrets...", "2022", "12", "Ended"},
                {"8.4", "A vending machine reincarnated in another world...", "2022", "12", "Ended"},
                {"7.9", "A vampire and a doctor solve supernatural cases...", "2021", "24", "Ended"},
                {"8.1", "A high school student's artistic journey...", "2021", "12", "Ended"},
                {"8.5", "A boy with superpowers navigates challenges...", "2021", "12", "Ended"},
                {"7.8", "A supernatural war between spirits and technology...", "2021", "52", "Ended"},
                {"8.4", "A singing AI saves humanity through music...", "2021", "13", "Ended"},
                {"8.0", "A boy and his friends explore a magical world...", "2021", "24", "Ended"},
                {"7.9", "A time traveler tries to save his friends...", "2021", "24", "Ended"},
                {"8.1", "A slime reincarnated in a magical world continues his adventures...", "2021", "24", "Ended"},
                {"8.6", "A prince embarks on a journey to find his voice...", "2021", "23", "Ended"},
                {"8.7", "A magical abyss filled with secrets and dangers...", "2022", "12", "Ended"}
        };

        //adding combined data to animeList (from combibe ANIME_TITLES + animeData)
        for (int i = 0; i < animeTitles.length; i++) {
            animeList.add(new Anime(
                    animeTitles[i],
                    Double.parseDouble(animeData[i][0]),
                    animeData[i][1],
                    Integer.parseInt(animeData[i][2]),
                    Integer.parseInt(animeData[i][3]),
                    animeData[i][4]
            ));
        }
    }

    public static void main(String[] args) {
        AnimeListSize();


    }
    //Print Anime list size
    public static void AnimeListSize () {
        System.out.println("Anime list initialized with " + animeList.size() + " entries.");
    }

    //Print Anime list
    public static void Anime(int i){
        Anime firstAnime = animeList.get(i);
        System.out.println("Title: " + firstAnime.getTitle());
        System.out.println("Rating: " + firstAnime.getRating());
        System.out.println("Description: " + firstAnime.getDescription());
        System.out.println("Year: " + firstAnime.getYear());
        System.out.println("Episodes: " + firstAnime.getEpisodes());
        System.out.println("Status: " + firstAnime.getStatus());
    }
}

