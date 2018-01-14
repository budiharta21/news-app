package com.example.budiharta.newsapps.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.budiharta.newsapps.R;
import com.example.budiharta.newsapps.data.remote.model.NewsItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_news)
    RecyclerView rvNews;
    private NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        
        adapter = new NewsAdapter();
        adapter.setData(getDummyData());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvNews.setLayoutManager(linearLayoutManager);
        rvNews.setAdapter(adapter);
    }

    public List<NewsItem> getDummyData(){
        List<NewsItem> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            NewsItem newsItem = new NewsItem();
            newsItem.setTitle("Meow "+String.valueOf(i));
            newsItem.setAuthor("Mr. Meow "+String.valueOf(i));
            newsItem.setDescription("Meow meow meow, meow meow meow meow meow meow meow meow meow meow meow meow meow. Meow, meow meow meow meow meow meow meow meow meow meow meow meow meow. "+ String.valueOf(i));
            newsItem.setUrlCover("http://lorempixel.com/400/200/cats/"+ String.valueOf(i));

            result.add(newsItem);
        }

        return result;
    }
}
