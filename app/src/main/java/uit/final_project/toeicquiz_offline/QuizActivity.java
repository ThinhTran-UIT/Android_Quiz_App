package uit.final_project.toeicquiz_offline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final String getSelectedTopicName =getIntent().getStringExtra("SelectedTopic");
    }
}