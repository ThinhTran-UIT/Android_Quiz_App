package uit.final_project.toeicquiz_offline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout part1 = findViewById(R.id.part1Layout);
        final LinearLayout part2 = findViewById(R.id.part2Layout);
        final LinearLayout part3 = findViewById(R.id.part3Layout);
        final LinearLayout part4 = findViewById(R.id.part4Layout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "part1";
                part1.setBackgroundResource(R.drawable.round_back_white_stroke10);

                part2.setBackgroundResource(R.drawable.round_back_white10);
                part3.setBackgroundResource(R.drawable.round_back_white10);
                part4.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        part2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "part2";
                part2.setBackgroundResource(R.drawable.round_back_white_stroke10);

                part1.setBackgroundResource(R.drawable.round_back_white10);
                part3.setBackgroundResource(R.drawable.round_back_white10);
                part4.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        part3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "part3";
                part3.setBackgroundResource(R.drawable.round_back_white_stroke10);

                part1.setBackgroundResource(R.drawable.round_back_white10);
                part2.setBackgroundResource(R.drawable.round_back_white10);
                part4.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        part4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "part4";
                part4.setBackgroundResource(R.drawable.round_back_white_stroke10);

                part1.setBackgroundResource(R.drawable.round_back_white10);
                part2.setBackgroundResource(R.drawable.round_back_white10);
                part3.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select the topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("SelectedTopic", selectedTopicName);

                }
            }
        });
    }
}