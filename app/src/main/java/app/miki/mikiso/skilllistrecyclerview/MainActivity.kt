package app.miki.mikiso.skilllistrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val courseData:List<CourseData> = listOf(
        CourseData(R.drawable.android,"Androidアプリプログラミングコース","色んなアプリを作って、プログラミングを楽しもう!"),
        CourseData(R.drawable.iphone,"iPhoneアプリプログラミングコース","世界にひとつだけのiPhoneアプリをつくって、周りを驚かせよう!"),
        CourseData(R.drawable.unity,"Unityゲームプログラミングコース","世界を驚かすワクワクが止まらない! 3Dゲームを制作しよう!"),
        CourseData(R.drawable.minecraft,"Minecraftプログラミングコース","マインクラフトでJavaプログラミングを学ぼう!"),
        CourseData(R.drawable.film,"映像制作コース","撮影から編集まで。オリジナルの映像作品を作り出そう!"),
        CourseData(R.drawable.animation,"アニメーションコース","頭の中で描いたストーリーをアニメにしてみよう!"),
        CourseData(R.drawable.mediaart,"メディアアートプログラミングコース","映像とプログラミングの融合!メディアアートの世界へ!"),
        CourseData(R.drawable.webdesign,"Webデザインコース","HTML5、CSS3、JavaScriptで動くオリジナルWebサイトを作ろう!"),
        CourseData(R.drawable.webservice,"Webサービスプログラミングコース","インターネットの仕組みを学び、Webサービスをリリースしよう!"),
        CourseData(R.drawable.dtm,"デジタルミュージックコース","今日から君はミュージシャン! その直感を音楽に変えよう!")





    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}