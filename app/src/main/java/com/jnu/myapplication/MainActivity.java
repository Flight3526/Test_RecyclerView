package com.jnu.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private RecyclerView recycler_View_books;
    private MyAdapter bookAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MainActivity","enter OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_View_books = findViewById(R.id.book_view);
        recycler_View_books.setLayoutManager(new LinearLayoutManager(this));
        List<BookItem> booklist = new ArrayList<>();
        for(int i=0;i<30;i++) {
            booklist.add(new BookItem("软件项目管理案例教程（第4版）", "30元", R.drawable.book_2));
            booklist.add(new BookItem("创新工程实践", "25元", R.drawable.book_no_name));
            booklist.add(new BookItem("信息安全教学基础（第2版）", "35元", R.drawable.book_1));
        }
        bookAdapter = new MyAdapter(booklist);
        recycler_View_books.setAdapter(bookAdapter);

    }
}
