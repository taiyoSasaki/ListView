package jp.co.ods.listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import jp.co.ods.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //①棚に入れたい荷物を作る(リストを作成する)


        //②作業員を用意すると同時に荷物を渡す(adapterをインスタンス化する)


        //③作業員に荷物の更新を通知する(adapterへデータの更新を通知する)


        //④荷物を追加する(リストに要素を追加)


        //⑤作業員に荷物の更新を通知する(adapterへデータの更新を通知する)



    }
}