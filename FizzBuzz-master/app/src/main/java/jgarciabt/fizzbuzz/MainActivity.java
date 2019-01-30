package jgarciabt.fizzbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType;

public class MainActivity extends AppCompatActivity {

    private Button fizzBuzzButton;
    private Button rockPaperButton;
    private EditText inputEditText;
    private TextView fizzBuzzResultTextView;
    private Spinner playerOneSpinner;
    private Spinner playerTwoSpinner;
    private TextView rockPaperResultTextView;

    private GameController gameController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FizzBuzz Views
        fizzBuzzButton = (Button) findViewById(R.id.fizz_buzz_button);


        // Rock-Paper-Scissors-Lizard-Spock Views
        rockPaperButton = (Button) findViewById(R.id.rock_paper_button);


        initialiseController();

        fizzBuzzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Intent intent = new Intent(getApplicationContext(), FizzBuzzGameActivity.class);
              startActivity(intent);
            }
        });

        rockPaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), RockPaperActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialiseController() {

        FizzBuzzHelper fizzBuzzHelper = new FizzBuzzHelper();
        RockPaperScissorsLizardSpockHelper rockPaperScissorsLizardSpockHelper = new RockPaperScissorsLizardSpockHelper();

        gameController = new GameController(fizzBuzzHelper, rockPaperScissorsLizardSpockHelper);
    }
}
