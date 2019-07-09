package sg.edu.rp.c346.demosimplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> movieList;
    ArrayAdapter<String> arrTp;
ListView lvExamTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips=findViewById(R.id.listViewMovie);
        movieList=new ArrayList<String>();
        movieList.add("Avengers");
        movieList.add("Guardian of the Galaxy");
        arrTp=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,movieList);
        arrTp.notifyDataSetChanged();
        lvExamTips.setAdapter(arrTp);
    }
}
