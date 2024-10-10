package com.example.assign2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        val adapter = ArticlesAdapter(getArticles())
        recyclerView.adapter = adapter
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
    fun getArticles(): List<Article> {
        return listOf(
            Article("SportsBlog newsletter 11/20: Vivaaaa Las Vegas!", "By SportsBlog News Desk",
                "Every Monday morning, the SportsBlog staff sends a comprehensive email covering all the biggest news in the sporting world from the week that was.\n" +
                        "\nWith three featured stories, a deeper look into NFL, NHL, NBA, MLB, and soccer news, a 'This Day in Sports History' section, and a 'Video of the Week,' the SportsBlog newsletter makes sure you never miss a story or crazy moment!",
                "Formula 1", R.drawable.bimg1),

            Article("Chiefs stun Raiders with last-second touchdown", "By John Smith",
                "Kansas City - In an epic divisional clash, the Kansas City Chiefs stunned the Las Vegas Raiders with a last-second touchdown to secure a 31-28 victory. Patrick Mahomes connected with Travis Kelce on a 25-yard strike, sending the crowd into a frenzy as the clock expired.",
                "NFL", R.drawable.bimg2),

            Article("Lakers win thriller against the Warriors", "By Mike Johnson",
                "Los Angeles - In a nail-biting game, the Los Angeles Lakers edged out the Golden State Warriors 112-110 with a clutch three-pointer from LeBron James in the final seconds. The win keeps the Lakers in playoff contention as the season heads into the final stretch.",
                "NBA", R.drawable.bimg3),

            Article("Federer announces retirement after historic career", "By Jane Doe",
                "Roger Federer has officially announced his retirement from professional tennis, ending a historic career that spanned over two decades. Federer, who won 20 Grand Slam titles, leaves the game as one of the greatest players in tennis history.",
                "Tennis", R.drawable.bimg4),

            Article("Liverpool thrash Manchester United in derby showdown", "By Alex Brown",
                "Liverpool - In one of the most anticipated matches of the season, Liverpool thrashed Manchester United 4-0 at Anfield. Mohamed Salah scored a brace as the Reds dominated from start to finish, leaving United searching for answers.",
                "Soccer", R.drawable.bimg1),

            Article("Yankees sign All-Star pitcher to 5-year deal", "By Sarah Lee",
                "New York - The New York Yankees have signed All-Star pitcher Garrett Cole to a massive 5-year, $150 million contract. Cole, one of the most dominant pitchers in the league, is expected to bolster the Yankees' rotation as they aim for another World Series title.",
                "MLB", R.drawable.bimg2),

            Article("Mercedes secures Constructors' Championship in Abu Dhabi", "By Emily Green",
                "Abu Dhabi - Mercedes has clinched the Formula 1 Constructors' Championship with a dominant performance at the Abu Dhabi Grand Prix. Lewis Hamilton secured second place, while teammate George Russell finished third, giving Mercedes enough points to claim the title.",
                "Formula 1", R.drawable.bimg3),

            Article("Raptors upset Bucks in overtime thriller", "By Kevin White",
                "Toronto - The Toronto Raptors pulled off a stunning upset, defeating the Milwaukee Bucks 118-115 in overtime. Pascal Siakam led the way with 35 points, while Fred VanVleet sealed the victory with a clutch three-pointer in the dying moments.",
                "NBA", R.drawable.bimg4),

            Article("Cowboys defeat Eagles in NFC East showdown", "By Chris Davis",
                "Dallas - In a crucial NFC East showdown, the Dallas Cowboys defeated the Philadelphia Eagles 27-20 to take control of the division. Dak Prescott threw for 300 yards and three touchdowns, while the defense came up with key stops in the fourth quarter.",
                "NFL", R.drawable.bimg1),

            Article("Novak Djokovic wins 10th Australian Open title", "By Laura Wilson",
                "Melbourne - Novak Djokovic has won his 10th Australian Open title, defeating Daniil Medvedev in straight sets. Djokovic's dominant performance solidified his place as one of the greatest players in tennis history, adding another Grand Slam to his resume.",
                "Tennis", R.drawable.bimg2),
        Article("Novak Djokovic wins 10th Australian Open title", "By Laura Wilson",
                "Melbourne - Novak Djokovic has won his 10th Australian Open title, defeating Daniil Medvedev in straight sets. Djokovic's dominant performance solidified his place as one of the greatest players in tennis history, adding another Grand Slam to his resume.",
                "Tennis", R.drawable.bimg1)
        )
    }

}